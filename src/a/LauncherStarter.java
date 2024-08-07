//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package a;

import java.io.File;
import java.util.logging.Level;

import javax.swing.JFrame;

import com.nowcomputing.GamebandConfig;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.Main;
import com.nowcomputing.PathUtils;
import com.nowcomputing.LatchedCommandRun;
import com.nowcomputing.uistuff.am;

public class LauncherStarter extends LatchedCommandRun {
	public LauncherStarter(GamebandConfig var1) {
		super(var1);
		File var2 = PathUtils.getMinecraftPath();
		if (!var2.exists()) {
			var2.mkdir();
		}

	}

	@Override
	public boolean d() {
		try {
			AbstractMinecraftLauncher var1 = Main.c();
			var1.f();
			var1.i();
			return true;
		} catch (Exception var2) {
			logger.log(Level.FINE, "Caught exception launching Minecraft: ", var2);
			am.a((JFrame) null, LocaleUtil.getLocalizedString("NO_LAUNCH_HEADING"),
					LocaleUtil.getLocalizedString("NO_LAUNCH_1"), var2.getMessage(), "", "");
			return false;
		}
	}
}
