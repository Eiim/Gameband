package com.nowcomputing.uistuff;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.nowcomputing.LocaleUtil;
import com.nowcomputing.Utils;

public class GamebandFonts {
	public static final Logger logger = Logger.getLogger(Utils.class.getName());
	private static String[] langs = new String[] { "en", "es", "fr", "de", "it", "pt" };
	private static boolean gotham_loaded = false;
	private static boolean osaka_loaded = false;
	public static final Font b = new Font("SanSerif", 0, 16);
	public static final Font c = new Font("SanSerif", 0, 14);
	public static Font PLAIN_17;
	public static Font PLAIN_16;
	public static Font PLAIN_14;
	public static Font PLAIN_12;
	public static Font PLAIN_10;
	public static Font PLAIN_26;
	public static Font j;
	public static Font k;
	public static Font BOLD_16;
	public static Font ITALIC_14;
	public static Font n;
	public static Font o;
	public static Font p;
	public static Font q;
	public static Font r;
	public static Font s;
	public static Font t;
	public static Font u;
	public static Font v;
	public static Font w;
	public static Font x;
	public static Font y;
	public static Font z;
	public static Font A;
	public static Font B;
	public static Font C;

	public static Font getFont(int style, int size) {
		String langCode = LocaleUtil.getLocale().getLanguage();
		if (langCode.equals("ja")) {
			if (!osaka_loaded) {
				loadFont(".lib/osaka.unicode.ttf");
				osaka_loaded = true;
			}

			return new Font("osaka_unicode", Font.PLAIN, size);
		} else if (arrayContains(langs, langCode)) {
			if (!gotham_loaded) {
				loadFont("/resources/Gotham-Book.otf");
				gotham_loaded = true;
			}

			return new Font("Gotham Book", style, size);
		} else {
			return new Font("SanSerif", Font.PLAIN, size - 2);
		}
	}

	public static void loadFont(String var0) {
		InputStream var1 = null;

		try {
			File var2 = new File(var0);
			if (var2.exists()) {
				var1 = new FileInputStream(var2);
			} else {
				var1 = GamebandFonts.class.getResourceAsStream(var0);
			}

			Font var3 = Font.createFont(0, var1);
			GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(var3);
			logger.log(Level.FINER, "Loaded font " + var0);
		} catch (FontFormatException var14) {
			logger.log(Level.WARNING, "Error loading font", var14);
		} catch (IOException var15) {
			logger.log(Level.WARNING, "Error loading font", var15);
		} finally {
			try {
				if (var1 != null) {
					var1.close();
				}
			} catch (IOException var13) {} // TODO: handle exception?
		}

	}

	private static boolean arrayContains(String[] arr, String val) {
		for (String s : arr) {
			if (s.equals(val)) {
				return true;
			}
		}
		return false;
	}

	private static void setupAllFonts() {
		PLAIN_17 = getFont(Font.PLAIN, 17);
		PLAIN_16 = getFont(Font.PLAIN, 16);
		PLAIN_14 = getFont(Font.PLAIN, 14);
		PLAIN_12 = getFont(Font.PLAIN, 12);
		PLAIN_10 = getFont(Font.PLAIN, 10);
		PLAIN_26 = getFont(Font.PLAIN, 26);
		j = PLAIN_17;
		k = PLAIN_16;
		BOLD_16 = getFont(Font.BOLD, 16);
		ITALIC_14 = getFont(Font.ITALIC, 14);
		n = PLAIN_14;
		o = PLAIN_12;
		p = PLAIN_16;
		q = PLAIN_12;
		r = PLAIN_12;
		s = PLAIN_12;
		t = PLAIN_16;
		u = PLAIN_14;
		v = PLAIN_14;
		w = PLAIN_16;
		x = PLAIN_14;
		y = PLAIN_16;
		z = PLAIN_10;
		A = PLAIN_14;
		B = PLAIN_12;
		C = PLAIN_14;
	}

	// $FF: synthetic method
	static void a() {
		setupAllFonts();
	}

	static {
		LocaleUtil.a((new r()));
		setupAllFonts();
	}
}
