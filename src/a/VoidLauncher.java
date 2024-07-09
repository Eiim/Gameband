package a;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;

import com.nowcomputing.DownloadRunnable;
import com.nowcomputing.GamebandConfig;
import com.nowcomputing.Utils;
import com.nowcomputing.X;
import com.nowcomputing.DownloadProgress;
import com.nowcomputing.uistuff.GamebandDialog;

public class VoidLauncher extends AbstractMinecraftLauncher {
	private int progress;

	public VoidLauncher(GamebandConfig var1) {
		super(var1);
	}

	@Override
	public String getDisplayName() {
		return "VoidLauncher";
	}

	@Override
	public String getSupportURL() {
		return "http://voidlauncherforums.voidswrath.com";
	}

	@Override
	public boolean setLaunchCMD() throws IOException {
		this.config.setProperty("launch_cmd", "java -jar VoidLauncher.jar --gameband_dir=void");
		return true;
	}

	@Override
	public boolean isJavaLaunchCommandValid() {
		try {
			String[] var1 = this.buildJavaCommand();
			return var1 != null && var1[2].equals("VoidLauncher.jar");
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public void f() {
		File var1 = new File(this.h());
		if (!var1.exists()) {
			var1.mkdirs();
		}

		File var2 = new File(var1, "VoidLauncher.jar");
		if (!var2.exists()) {
			this.a(var2);
		} else {
			X var3 = this.m();
			X var4 = this.l();
			if (var3.a(var4) < 0) {
				this.a(var2);
			}
		}

	}

	private X l() {
		try {
			InputStream var1 = Utils.HttpGet("http://voidswrath.com/release/releases/version.txt");
			BufferedReader var2 = new BufferedReader(new InputStreamReader(var1));
			String var3 = var2.readLine();
			return new X(var3);
		} catch (IOException var4) {
			var4.printStackTrace();
			return new X(0, 0, 0, 0);
		}
	}

	private X m() {
		try {
			File var1 = new File(this.h(), "void/VoidLauncher/jarversion");
			if (var1.exists()) {
				String var2 = Utils.readFileLazy(var1);
				return new X(var2);
			}
		} catch (Exception var3) {
			logger.log(Level.WARNING, "Error getting launcher version void/VoidLauncher/jarversion", var3);
		}

		return new X(0, 0, 0, 0);
	}

	public void a(File var1) {
		GamebandDialog var2 = new GamebandDialog("Getting the latest Launcher", "This won't take long...", "", false);
		var2.setVisible(true);

		try {
			this.progress = 0;
			DownloadRunnable var3 = new DownloadRunnable(
					new URL("http://vl4.voidswrath.com/release/releases/linux/VoidLauncher.jar"), var1,
					(DownloadProgress) null);
			var3.a(new VoidDownloadProgress(this, var3, var2));
			var3.run();
			var2.c();
		} catch (Exception var4) {
			logger.log(Level.WARNING, "Error getting launcher", var4);
		}

	}

	@Override
	public boolean g() {
		return (new File(this.h(), "VoidLauncher.jar")).exists();
	}

	// $FF: synthetic method
	static int increaseProgress(VoidLauncher var0, long var1) {
		return var0.progress = (int) (var0.progress + var1);
	}

	// $FF: synthetic method
	static int getProgress(VoidLauncher var0) {
		return var0.progress;
	}
}
