package com.nowcomputing;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class T implements X509TrustManager {
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

	public void checkClientTrusted(X509Certificate[] var1, String var2) {
	}

	public void checkServerTrusted(X509Certificate[] var1, String var2) {
	}
}
