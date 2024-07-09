package a;

import com.nowcomputing.DownloadProgress;
import com.nowcomputing.DownloadRunnable;
import com.nowcomputing.uistuff.GamebandDialog;

class TechnicDownloadProgress implements DownloadProgress {
	// $FF: synthetic field
	final DownloadRunnable a;
	// $FF: synthetic field
	final GamebandDialog b;
	// $FF: synthetic field
	final TechnicLauncher c;

	TechnicDownloadProgress(TechnicLauncher var1, DownloadRunnable var2, GamebandDialog var3) {
		this.c = var1;
		this.a = var2;
		this.b = var3;
	}

	@Override
	public void addProgress(long progress) {
		TechnicLauncher.increaseProgress(this.c, progress);
		int var3 = (int) ((float) TechnicLauncher.getProgress(this.c) / (float) this.a.getDownloadSize() * 100.0F);
		if (var3 == 100) {
			this.b.close();
		} else {
			this.b.setProgressBarValue(var3);
		}

	}
}
