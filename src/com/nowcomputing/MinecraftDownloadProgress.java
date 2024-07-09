package com.nowcomputing;

class MinecraftDownloadProgress implements DownloadProgress {
	// $FF: synthetic field
	final MinecraftDownloader a;

	MinecraftDownloadProgress(MinecraftDownloader var1) {
		this.a = var1;
	}

	public void addProgress(long var1) {
		if (MinecraftDownloader.b(this.a) != null) {
			MinecraftDownloader.c(this.a, var1);
			int var3 = (int) ((float) MinecraftDownloader.c(this.a) / (float) MinecraftDownloader.d(this.a) * 100.0F);
			MinecraftDownloader.b(this.a).setProgress(var3);
		}

	}
}
