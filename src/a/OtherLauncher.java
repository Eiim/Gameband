package a;

import com.nowcomputing.GamebandConfig;
import com.nowcomputing.LocaleUtil;

// Seemingly unused
public class OtherLauncher extends AbstractMinecraftLauncher {

	// Doesn't exist in the original jar
	protected OtherLauncher(GamebandConfig var1) {
		super(var1);
	}

	@Override
	public String getDisplayName() {
		return LocaleUtil.getLocalizedString("OTHER_LAUNCHER");
	}

	@Override
	public String getSupportURL() {
		return "";
	}

	@Override
	public boolean setLaunchCMD() {
		return false;
	}

	@Override
	public boolean isJavaLaunchCommandValid() {
		return false;
	}

	@Override
	public void f() {
	}

	@Override
	public boolean g() {
		return false;
	}
}
