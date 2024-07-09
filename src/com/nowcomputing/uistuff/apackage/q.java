package com.nowcomputing.uistuff.apackage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.nowcomputing.Image;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.pixelfurnace.Animation;
import com.nowcomputing.pixelfurnace.UnusedInterface;
import com.nowcomputing.uistuff.GamebandButton;
import com.nowcomputing.uistuff.GamebandColors;
import com.nowcomputing.uistuff.GamebandFonts;

public class q extends JPanel implements UnusedInterface {
	private final com.nowcomputing.uistuff.n a;
	private BufferedImage b;
	private List c;
	private int d;

	public q(p var1) {
		this.a = new com.nowcomputing.uistuff.n(com.nowcomputing.uistuff.n.a, com.nowcomputing.uistuff.n.a, 0);
		this.c = new ArrayList();
		this.setBackground(Color.BLACK);
		boolean var2 = var1.g().getOrientation() == 1;

		try {
			this.b = GamebandColors.a(var2);
		} catch (IOException var6) {
		}

		this.setLayout((LayoutManager) null);
		this.a.setOpaque(false);
		this.add(this.a);
		JButton var3 = new JButton();
		var3.setContentAreaFilled(false);
		var3.setBorderPainted(false);
		this.add(var3);
		var3.addActionListener(new r(this));
		if (var2) {
			this.a.setBounds(320, 282, 160, 56);
			var3.setBounds(536, 290, 27, 38);
		} else {
			this.a.setBounds(300, 295, 160, 56);
			var3.setBounds(227, 303, 28, 39);
		}

		JPanel var4 = new JPanel();
		this.add(var4);
		var4.setBounds(0, 400, 800, 100);
		var4.setOpaque(false);
		var4.setBorder(new EmptyBorder(60, 0, 0, 0));
		GamebandButton var5 = new GamebandButton(LocaleUtil.getLocalizedString("CLOSE_BUTTON"));
		var5.setFont(GamebandFonts.n);
		var5.setBackground(GamebandColors.e());
		var5.setForeground(GamebandColors.f());
		var4.add(var5);
		var5.addActionListener(new s(this, var1));
	}

	@Override
	public void paintComponent(Graphics var1) {
		super.paintComponent(var1);
		var1.drawImage(this.b, 0, 0, this.getWidth(), this.getHeight(), (ImageObserver) null);
	}

	public void a(List var1) {
		if (this.d != 0) {
			((Animation) this.c.get(this.d - 1)).stopAnimation();
			this.d = 0;
		}

		this.a.a(false);
		this.c = var1;
		Iterator var2 = this.c.iterator();

		while (var2.hasNext()) {
			Animation var3 = (Animation) var2.next();
			var3.a(this);
		}

	}

	public void b() {
		if (this.d != 0) {
			((Animation) this.c.get(this.d - 1)).stopAnimation();
		}

		if (this.d == this.c.size()) {
			this.d = 0;
		}

		if (this.c.size() > 0) {
			((Animation) this.c.get(this.d++)).f();
		}

	}

	@Override
	public void a(Image var1) {
		if (var1 != null) {
			this.a.a(var1, 0, 0);
		}

	}

	@Override
	public void a() {
		this.d = 0;
	}
}
