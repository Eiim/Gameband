package com.nowcomputing;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import c.a.scanner.a.UnexpectedDoodadException;

public class MinecraftDownloader {
	static final Logger log = Logger.getLogger(Utils.class.getName());
	private static String c;
	private static String d;
	private static String e;
	private static String f;
	private static String g;
	private static String h;
	private static String i;
	private R j;
	private long k;
	private long l;
	private Thread m;
	private boolean n;
	private DownloadRunnable o;
	protected Exception ex;

	public MinecraftDownloader(GamebandConfig var1) {
		String var2 = PathUtils.getMinecraftPath().getAbsolutePath();
		var2 = GamebandConfig.fixPath(var2);
		c = var2 + File.separator + "launcher.jar";
		d = c + ".lzma";
		h = var2 + File.separator + ".mc.exe";
		i = h + ".tmp";
		f = var2 + File.separator + "runtime" + File.separator + "Minecraft.app";
		e = f + File.separator + "Contents" + File.separator + "MacOS" + File.separator + "launcher";
		g = f + ".zip";
	}

	public void a(R var1) {
		this.j = var1;
	}

	public Severity a() {
		c.a.scanner.c var1 = b();
		if (var1 != null) {
			switch (OS.getOS()) {
			case WINDOWS:
				return this.a(var1) ? Severity.normal : Severity.none;
			case OSX:
				return this.c(var1) ? Severity.normal : Severity.none;
			case LINUX:
			case UNKNOWN:
				return this.b(var1) ? Severity.normal : Severity.none;
			}
		}

		return Severity.none;
	}

	public static c.a.scanner.c b() {
		c.a.scanner.c var0 = null;

		try {
			String launcherJSON = Utils
					.getAllFromInputStream(Utils.b("https://launchermeta.mojang.com/mc/launcher.json"));
			c.a.scanner.a.b var2 = new c.a.scanner.a.b();
			var0 = (c.a.scanner.c) var2.a(launcherJSON);
		} catch (IOException var3) {
			log.log(Level.FINE, "Error Checking for new Minecraft launcher", var3);
		} catch (UnexpectedDoodadException var4) {
			log.log(Level.FINE, "Error reading Minecraft launcher json", var4);
		}

		return var0;
	}

	private boolean a(c.a.scanner.c var1) {
		try {
			c.a.scanner.c var2 = (c.a.scanner.c) var1.get("windows");
			String var3 = (String) var2.get("apphash");
			String var4 = Utils.d(h);
			return !var4.equals(var3);
		} catch (Exception var5) {
			return false;
		}
	}

	private boolean b(c.a.scanner.c var1) {
		try {
			c.a.scanner.c var2 = (c.a.scanner.c) var1.get("java");
			String var3 = (String) var2.get("sha1");
			String var4 = Utils.d(c);
			return !var4.equals(var3);
		} catch (Exception var5) {
			return false;
		}
	}

	private boolean c(c.a.scanner.c var1) {
		try {
			c.a.scanner.c var2 = (c.a.scanner.c) var1.get("osx");
			String var3 = (String) var2.get("apphash");
			String var4 = Utils.d(e);
			return !var4.equals(var3);
		} catch (Exception var5) {
			return false;
		}
	}

	public void c() {
		this.m = new UpdateThread(this);
		this.m.start();
	}

	public void d() throws IOException {
		c.a.scanner.c var1 = b();
		if (var1 != null) {
			switch (Utils.getOS()) {
			case WINDOWS:
				this.e(var1);
				break;
			case OSX:
				this.d(var1);
				break;
			case LINUX:
			case UNKNOWN:
				this.f(var1);
				break;
			default:
				return;
			}

		}
	}

	private void d(c.a.scanner.c var1) throws IOException {
		c.a.scanner.c var2 = (c.a.scanner.c) var1.get("osx");
		this.a((String) var2.get("applink"), g, (String) var2.get("downloadhash"));
		File var3 = new File(g);
		Utils.a(var3, new File(f), (List) null);
		var3.delete();
		if (this.j != null) {
			this.j.exit();
		}

	}

	private void e(c.a.scanner.c var1) throws IOException {
		c.a.scanner.c var2 = (c.a.scanner.c) var1.get("windows");
		this.a((String) var2.get("applink"), i, (String) var2.get("apphash"));
		Utils.b(new File(i), new File(h));
		Utils.hideFile(new File(h));
		if (this.j != null) {
			this.j.exit();
		}

	}

	private void f(c.a.scanner.c var1) throws IOException {
		c.a.scanner.c var2 = (c.a.scanner.c) var1.get("java");
		c.a.scanner.c var3 = (c.a.scanner.c) var2.get("lzma");
		this.a((String) var3.get("url"), d, (String) var3.get("sha1"));
		Utils.a(d, c);
		String var4 = (String) var2.get("sha1");
		String var5 = Utils.d(c);
		if (!var5.equals(var4)) {
			throw new IOException("Error uncompressing " + d);
		} else {
			if (this.j != null) {
				this.j.exit();
			}

		}
	}

	public void a(String var1, String var2, String var3) throws IOException {
		log.log(Level.INFO, "Downloading " + var2);
		this.o = new DownloadRunnable(new URL(var1), new File(var2), new MinecraftDownloadProgress(this));
		this.k = this.o.getDownloadSize();
		this.o.run();
		if (!this.o.b()) {
			throw this.o.c();
		} else {
			String var4 = Utils.d(var2);
			if (!var4.equals(var3)) {
				throw new IOException("Error downloading " + var2);
			}
		}
	}

	public Exception e() {
		return this.ex;
	}

	// $FF: synthetic method
	static boolean a(MinecraftDownloader var0, boolean var1) {
		return var0.n = var1;
	}

	// $FF: synthetic method
	static boolean a(MinecraftDownloader var0) {
		return var0.n;
	}

	// $FF: synthetic method
	static long a(MinecraftDownloader var0, long var1) {
		return var0.k = var1;
	}

	// $FF: synthetic method
	static long b(MinecraftDownloader var0, long var1) {
		return var0.l = var1;
	}

	// $FF: synthetic method
	static R b(MinecraftDownloader var0) {
		return var0.j;
	}

	// $FF: synthetic method
	static long c(MinecraftDownloader var0, long var1) {
		return var0.l += var1;
	}

	// $FF: synthetic method
	static long c(MinecraftDownloader var0) {
		return var0.l;
	}

	// $FF: synthetic method
	static long d(MinecraftDownloader var0) {
		return var0.k;
	}
}
