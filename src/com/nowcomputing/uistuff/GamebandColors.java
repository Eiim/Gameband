package com.nowcomputing.uistuff;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.geom.Point2D.Float;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import com.nowcomputing.GamebandConfig;

/**
 * was com.nowcomputing.f.h
 */
public class GamebandColors {
	private static final Color LIGHT_GRAY = new Color(211, 211, 211);
	private static final Color DARK_GRAY = new Color(68, 68, 68);
	private static final Color LIGHT_GRAY2 = new Color(211, 211, 211);
	private static final Color WHITE;
	private static final float[] GRADIENT_SPACING_EVEN;
	private static final Color LED_RED;
	private static final Color TEXT_1;
	private static final Color BUTTON_BG_1;
	private static final Color BUTTON_FG_1;
	private static final Color BUTTON_HL_BG_RED;
	private static final Color BUTTON_HL_FG_1;
	private static final float[] GRADIENT_SPACING_REDSTONE;
	private static final Color[] REDSTONE_GRADIENT;
	private static final Color LED_BLUE;
	private static final Color TEXT_2;
	private static final Color BUTTON_BG_2;
	private static final Color BUTTON_FG_2;
	private static final Color BUTTON_HL_BG_BLUE;
	private static final Color BUTTON_HL_FG_2;
	private static final float[] GRADIENT_SPACING_DIAMOND;
	private static final Color[] DIAMOND_GRADIENT;
	public static final Color NEAR_BLACK;
	public static final Color DARKER_GRAY;
	private static Properties Q;
	private static Map R;
	private static Map S;
	private static Map T;
	private static Map U;
	private static ImageIcon V;
	public static final Color OFF_WHITE;
	public static final Color GRAY;
	public static final Color DARKISH_GRAY;
	public static final Color STACK_GRAY;
	public static final Color BLACK;
	public static final Color YELLOWED_GRAY;
	public static final Color i;
	public static final Color BUTTON_BG;
	public static final Color BACKUP_CANCEL_BG;
	public static final Color ANIM_BUTTON_BG;
	public static final Color ASSORTED_FG;
	public static final Color n;
	public static final Color o;
	public static final Color p;
	public static final Color q;
	public static final Color SCROLL_PANEL_BG;
	public static final Color s;
	public static final Color BRIGHT_RED;
	public static final Color ORANGE;

	public static Color a() {
		return b("skin.led");
	}

	public static Color b() {
		return b("skin.text");
	}

	public static Color c() {
		return b("skin.button.bg");
	}

	public static Color d() {
		return b("skin.button.fg");
	}

	public static Color e() {
		return b("skin.highlight.button.bg");
	}

	public static Color f() {
		return b("skin.highlight.button.fg");
	}

	public static BufferedImage a(boolean var0) throws IOException {
		String var1 = var0 ? "/resources/previewbg_left.jpg" : "/resources/previewbg_right.jpg";
		if ("diamond".equals(h())) {
			var1 = var0 ? "/resources/previewbg_left_diamond.png" : "/resources/previewbg_right_diamond.png";
		}

		return ImageIO.read(GamebandColors.class.getResource(var1));
	}

	public static void a(BufferedImage var0, Color var1) {
		Graphics2D var2 = var0.createGraphics();
		var2.setColor(var1);
		var2.setComposite(AlphaComposite.SrcAtop);
		var2.fillRect(0, 0, var0.getWidth(), var0.getHeight());
	}

	public static BufferedImage getImage(String var0) throws IOException {
		BufferedImage var1 = ImageIO.read(GamebandColors.class.getResourceAsStream(var0));
		a(var1, e());
		return var1;
	}

	public static Icon a(int var0, int var1) {
		if (V == null) {
			BufferedImage var2 = new BufferedImage(var0, var1, 2);
			Graphics2D var3 = var2.createGraphics();
			Float var4 = new Float(0.0F, 0.0F);
			Float var5 = new Float(var0 - 1, var1);
			float[] var6 = m();
			Color[] var7 = l();
			if (var6.length != var7.length) {
				var6 = GRADIENT_SPACING_REDSTONE;
				var7 = REDSTONE_GRADIENT;
			}

			var3.setPaint(new LinearGradientPaint(var4, var5, var6, var7));
			var3.fillRect(0, 0, var0, var1);
			V = new ImageIcon(var2);
		}

		return V;
	}

	private static Color b(String var0) {
		if (S == null) {
			g();
		}

		return (Color) S.get(var0);
	}

	private static void g() {
		i();
		S = new HashMap();
		a("skin.led", c("skin.led"));
		a("skin.text", c("skin.text"));
		a("skin.button.bg", c("skin.button.bg"));
		a("skin.button.fg", c("skin.button.fg"));
		a("skin.highlight.button.bg", c("skin.highlight.button.bg"));
		a("skin.highlight.button.fg", c("skin.highlight.button.fg"));
		T = new HashMap();
		T.put("redstone", a(n(), GRADIENT_SPACING_REDSTONE));
		T.put("diamond", a(n(), GRADIENT_SPACING_DIAMOND));
		U = new HashMap();
		U.put("redstone", a(n(), REDSTONE_GRADIENT));
		U.put("diamond", a(n(), DIAMOND_GRADIENT));
	}

	private static Color c(String var0) {
		Map var1 = (Map) R.get(h());
		if (var1 == null) {
			var1 = (Map) R.get("redstone");
		}

		return (Color) var1.get(var0);
	}

	private static String h() {
		return n().getProperty("skin", "redstone");
	}

	private static void i() {
		R = new HashMap();
		R.put("redstone", j());
		R.put("diamond", k());
	}

	private static HashMap j() {
		HashMap var0 = new HashMap();
		var0.put("skin.led", LED_RED);
		var0.put("skin.text", TEXT_1);
		var0.put("skin.button.bg", BUTTON_BG_1);
		var0.put("skin.button.fg", BUTTON_FG_1);
		var0.put("skin.highlight.button.bg", BUTTON_HL_BG_RED);
		var0.put("skin.highlight.button.fg", BUTTON_HL_FG_1);
		return var0;
	}

	private static HashMap k() {
		HashMap var0 = new HashMap();
		var0.put("skin.led", LED_BLUE);
		var0.put("skin.text", TEXT_2);
		var0.put("skin.button.bg", BUTTON_BG_2);
		var0.put("skin.button.fg", BUTTON_FG_2);
		var0.put("skin.highlight.button.bg", BUTTON_HL_BG_BLUE);
		var0.put("skin.highlight.button.fg", BUTTON_HL_FG_2);
		return var0;
	}

	private static void a(String var0, Color var1) {
		S.put(var0, a(n(), var0, var1));
	}

	private static Color a(Properties var0, String var1, Color var2) {
		String var3 = var0.getProperty(var1, "");
		return !var3.isEmpty() ? Color.decode(var3) : var2;
	}

	private static Color[] l() {
		return (Color[]) U.get(h());
	}

	private static float[] m() {
		return (float[]) T.get(h());
	}

	private static Properties n() {
		if (Q == null) {
			Q = new Properties();

			try {
				Q.load(new FileInputStream(GamebandConfig.defaultConfigFile));
			} catch (IOException var1) {
			}
		}

		return Q;
	}

	private static Color[] a(Properties var0, Color[] var1) {
		try {
			String var2 = var0.getProperty("skin.header.colors", "");
			if (!var2.isEmpty()) {
				String[] var3 = var2.split(",");
				Color[] var4 = new Color[var3.length];

				for (int var5 = 0; var5 < var3.length; ++var5) {
					var4[var5] = Color.decode(var3[var5]);
				}

				return var4;
			}
		} catch (NumberFormatException var6) {
		}

		return var1;
	}

	private static float[] a(Properties var0, float[] var1) {
		try {
			String var2 = var0.getProperty("skin.header.dist", "");
			if (!var2.isEmpty()) {
				String[] var3 = var2.split(",");
				float[] var4 = new float[var3.length];

				for (int var5 = 0; var5 < var3.length; ++var5) {
					var4[var5] = java.lang.Float.parseFloat(var3[var5]);
				}

				return var4;
			}
		} catch (NumberFormatException var6) {
		}

		return var1;
	}

	static {
		WHITE = Color.WHITE;
		GRADIENT_SPACING_EVEN = new float[] { 0.0F, 0.5F, 1.0F };
		LED_RED = new Color(188, 0, 0);
		TEXT_1 = LIGHT_GRAY;
		BUTTON_BG_1 = DARK_GRAY;
		BUTTON_FG_1 = LIGHT_GRAY2;
		BUTTON_HL_BG_RED = LED_RED;
		BUTTON_HL_FG_1 = WHITE;
		GRADIENT_SPACING_REDSTONE = GRADIENT_SPACING_EVEN;
		REDSTONE_GRADIENT = new Color[] { new Color(127, 35, 0), new Color(188, 0, 0), new Color(127, 35, 0) };
		LED_BLUE = new Color(43, 173, 148);
		TEXT_2 = LIGHT_GRAY;
		BUTTON_BG_2 = DARK_GRAY;
		BUTTON_FG_2 = LIGHT_GRAY2;
		BUTTON_HL_BG_BLUE = LED_BLUE;
		BUTTON_HL_FG_2 = WHITE;
		GRADIENT_SPACING_DIAMOND = GRADIENT_SPACING_EVEN;
		DIAMOND_GRADIENT = new Color[] { new Color(17, 138, 135), new Color(51, 235, 203), new Color(17, 138, 135) };
		NEAR_BLACK = new Color(35, 35, 35);
		DARKER_GRAY = new Color(45, 45, 45);
		OFF_WHITE = new Color(234, 237, 241);
		GRAY = new Color(98, 98, 98);
		DARKISH_GRAY = new Color(83, 83, 83);
		STACK_GRAY = new Color(64, 64, 64);
		BLACK = new Color(25, 25, 25);
		YELLOWED_GRAY = new Color(87, 87, 85);
		i = OFF_WHITE;
		BUTTON_BG = OFF_WHITE;
		BACKUP_CANCEL_BG = STACK_GRAY;
		ANIM_BUTTON_BG = YELLOWED_GRAY;
		ASSORTED_FG = Color.WHITE;
		n = BLACK;
		o = BLACK;
		p = STACK_GRAY;
		q = YELLOWED_GRAY;
		SCROLL_PANEL_BG = STACK_GRAY;
		s = Color.WHITE;
		BRIGHT_RED = new Color(255, 45, 38);
		ORANGE = new Color(243, 172, 17);
	}
}
