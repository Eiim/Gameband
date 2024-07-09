//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package a;

import com.nowcomputing.DownloadProgress;
import com.nowcomputing.DownloadRunnable;
import com.nowcomputing.uistuff.GamebandDialog;

class FTBDownloadProgress implements DownloadProgress {
	final DownloadRunnable a;
	final GamebandDialog b;
	final FTBLauncher c;

	FTBDownloadProgress(FTBLauncher var1, DownloadRunnable var2, GamebandDialog var3) {
		this.c = var1;
		this.a = var2;
		this.b = var3;
	}

	@Override
	public void addProgress(long progress) {
		FTBLauncher.increaseProgress(this.c, progress);
		int var3 = (int) ((float) FTBLauncher.getProgress(this.c) / (float) this.a.getDownloadSize() * 100.0F);
		if (var3 == 100) {
			this.b.close();
		} else {
			this.b.setProgressBarValue(var3);
		}

	}
}
