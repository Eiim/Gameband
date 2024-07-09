package com.nowcomputing.uistuff.apackage;

import java.awt.Color;
import java.awt.LayoutManager;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.nowcomputing.LocaleUtil;
import com.nowcomputing.Utils;
import com.nowcomputing.e.Transition;
import com.nowcomputing.uistuff.GamebandColors;
import com.nowcomputing.uistuff.GamebandFonts;

public class a extends JPanel {
	private static final Logger a = Logger.getLogger(Utils.class.getName());
	private JComboBox b;
	private JButton c;

	public a(p var1) {
		this.setBackground(GamebandColors.n);
		this.setLayout((LayoutManager) null);
		JButton var2 = this.a(LocaleUtil.getLocalizedString("ADD_ANIMATION"), 22);
		var2.addActionListener(new b(this, var1));
		JLabel var3 = new JLabel(LocaleUtil.getLocalizedString("SET_TRANSITION"));
		this.add(var3);
		var3.setFont(GamebandFonts.v);
		var3.setForeground(Color.WHITE);
		var3.setBounds(27, 76, 166, 25);
		Transition[] var4 = new Transition[] { Transition.scroll, Transition.dissolve, Transition.rain,
				Transition.none };
		this.b = new JComboBox(var4);
		this.b.setSelectedItem(var1.g().c());
		this.add(this.b);
		this.b.setFont(GamebandFonts.v);
		this.b.setForeground(GamebandColors.o);
		this.b.setBounds(22, 104, 146, 35);
		this.b.addActionListener(new c(this, var1));
		JButton var5 = this.a(LocaleUtil.getLocalizedString("PREVIEW"), 156);
		var5.addActionListener(new d(this, var1));
		this.c = this.a(LocaleUtil.getLocalizedString("SAVE_TO_GAMEBAND"), 208);
		this.c.addActionListener(new saveButtonAction(this, var1));
	}

	private JButton a(String var1, int var2) {
		JButton var3 = new JButton("<html><center>" + var1);
		this.add(var3);
		var3.setFont(GamebandFonts.v);
		var3.setBackground(GamebandColors.j);
		var3.setForeground(GamebandColors.o);
		var3.setBounds(22, var2, 146, 40);
		return var3;
	}
}
