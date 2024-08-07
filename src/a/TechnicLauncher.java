package a;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;

import com.nowcomputing.DownloadRunnable;
import com.nowcomputing.GamebandConfig;
import com.nowcomputing.Utils;
import com.nowcomputing.LatchedCommandRun;
import com.nowcomputing.DownloadProgress;
import com.nowcomputing.uistuff.GamebandDialog;

import c.a.scanner.a.b;

public class TechnicLauncher extends AbstractMinecraftLauncher {
	private int progress;

	public TechnicLauncher(GamebandConfig var1) {
		super(var1);
	}

	@Override
	public String getDisplayName() {
		return "TechnicLauncher";
	}

	@Override
	public String getSupportURL() {
		return "https://technicpack.zendesk.com/hc/en-us";
	}

	@Override
	public boolean setLaunchCMD() throws IOException {
		this.config.setProperty("launch_cmd",
				"java -Dawt.useSystemAAFontSettings=lcd -Djava.net.preferIPv4Stack=true -jar TechnicLauncher.jar -launcheronly");
		return true;
	}

	@Override
	public boolean isJavaLaunchCommandValid() {
		try {
			String[] var1 = this.buildJavaCommand();
			return var1 != null && var1.length > 4 && var1[4].equals("TechnicLauncher.jar");
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public void f() {
		try {
			String var1 = this.h();
			a(new File(var1, "technic"));
			this.a(new File(var1), "TechnicLauncher.jar");
			String[] var2 = "java -Dawt.useSystemAAFontSettings=lcd -Djava.net.preferIPv4Stack=true -jar TechnicLauncher.jar -update"
					.split(" ");
			String var3 = j();
			logger.log(Level.FINE, "bundledJava: " + var3);
			if (var3 != null) {
				var2[0] = var3;
			}

			LatchedCommandRun.a(var2, var1, false);
			File var4 = new File(var1 + File.separatorChar + "technic", "temp.jar");
			if (var4.exists()) {
				File var5 = new File(var1, "TechnicLauncher.jar");
				if (var4.lastModified() > var5.lastModified()) {
					logger.log(Level.FINE, "New TechnicLauncher, moving temp.jar");

					try {
						Thread.sleep(1000L);
					} catch (InterruptedException var7) {
					}

					if (Utils.b(var4, var5)) {
						logger.log(Level.FINE, "TechnicLauncher updated");
					} else {
						logger.log(Level.WARNING, "Error updating TechnicLauncher");
					}
				}
			}
		} catch (IOException e) {
			logger.log(Level.WARNING, "Error updating TechnicLauncher", e);
		}

	}

	private void a(File var1, String var2) {
		if (!var1.exists()) {
			var1.mkdirs();
		}

		File var3 = new File(var1, var2);
		if (!var3.exists()) {
			GamebandDialog var4 = new GamebandDialog("Getting the latest Launcher", "This won't take long...", "",
					false);
			var4.setVisible(true);

			try {
				String var5 = Utils
						.getAllFromInputStream(Utils.HttpGet("http://api.technicpack.net/launcher/version/stable4"));
				b var6 = new b();
				c.a.scanner.c var7 = (c.a.scanner.c) var6.a(var5);
				c.a.scanner.c var8 = (c.a.scanner.c) var7.get("url");
				String var9 = (String) var8.get("jar");
				this.progress = 0;
				DownloadRunnable var10 = new DownloadRunnable(new URL(var9), var3,
						(DownloadProgress) null);
				var10.a(new TechnicDownloadProgress(this, var10, var4));
				var10.run();
				var4.c();
			} catch (Exception var11) {
				logger.log(Level.WARNING, "Error getting launcher", var11);
			}
		}

	}

	private static void a(File var0) throws IOException {
		if (!var0.exists()) {
			var0.mkdirs();
		}

		File var1 = new File(var0, "settings.json");
		if (var1 != null && var1.exists()) {
			try {
				String var2 = Utils.readFileLazy(var1);
				b var3 = new b();
				c.a.scanner.c var4 = (c.a.scanner.c) var3.a(var2);
				String var5 = (String) var4.get("directory");
				if (!"portable".equals(var5)) {
					a(var1, var4);
				}
			} catch (Exception var6) {
				b(var1);
			}
		} else {
			b(var1);
		}

	}

	private static void b(File var0) throws IOException {
		c.a.scanner.c var1 = new c.a.scanner.c();
		a(var0, var1);
	}

	private static void a(File var0, c.a.scanner.c var1) throws IOException {
		var1.put("directory", "portable");
		c.a.scanner.f var2 = new c.a.scanner.f();
		var1.a(var2);
		Utils.a(var0, var2.toString());
	}

	@Override
	public boolean g() {
		return (new File(this.h(), "TechnicLauncher.jar")).exists();
	}

	// $FF: synthetic method
	static int increaseProgress(TechnicLauncher var0, long var1) {
		return var0.progress = (int) (var0.progress + var1);
	}

	// $FF: synthetic method
	static int getProgress(TechnicLauncher var0) {
		return var0.progress;
	}
}
