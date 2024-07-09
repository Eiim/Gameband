package com.nowcomputing;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

public class DownloadRunnable implements Runnable { // this might be a bad name, just trying to fix errors here
	private InputStream a;
	private File b;
	private DownloadProgress c;
	private CountDownLatch d = new CountDownLatch(1);
	private IOException e;
	private boolean f;
	private boolean g;
	private int downloadSize;

	public DownloadRunnable(InputStream var1, File var2, DownloadProgress var3) {
		this.a = var1;
		this.b = var2;
		this.c = var3;
	}

	public DownloadRunnable(URL var1, File var2, DownloadProgress var3) throws IOException {
		this.b = var2;
		this.c = var3;
		HttpURLConnection var4 = (HttpURLConnection) var1.openConnection();
		var4.setDoInput(true);
		this.downloadSize = var4.getContentLength();
		this.a = var4.getInputStream();
	}

	public void a(DownloadProgress var1) {
		this.c = var1;
	}

	public int getDownloadSize() {
		return this.downloadSize;
	}

	public boolean b() {
		return this.f;
	}

	public IOException c() {
		return this.e;
	}

	public void run() {
		FileOutputStream var1 = null;

		try {
			if (this.b.getParentFile() != null) {
				this.b.getParentFile().mkdirs();
			}

			if (this.b.exists()) {
				this.b.delete();
			}

			var1 = new FileOutputStream(this.b);
			byte[] var2 = new byte[4096];
			boolean var3 = true;

			int var16;
			while ((var16 = this.a.read(var2)) != -1) {
				if (this.g) {
					return;
				}

				if (var16 > 0) {
					var1.write(var2, 0, var16);
					if (this.c != null) {
						this.c.addProgress((long) var16);
					}
				}
			}

			this.f = true;
		} catch (IOException var14) {
			this.e = var14;
		} finally {
			Utils.closeButUnsafe((Closeable) this.a);

			try {
				if (var1 != null) {
					var1.flush();
					var1.getFD().sync();
				}
			} catch (IOException var13) {
			}

			Utils.closeButUnsafe((Closeable) var1);
			this.d.countDown();
		}

	}
}
