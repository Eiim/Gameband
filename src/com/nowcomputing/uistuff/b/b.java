package com.nowcomputing.uistuff.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import com.nowcomputing.Image;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.TimeDisplay;
import com.nowcomputing.a.Duality;
import com.nowcomputing.pixelfurnace.Animation;
import com.nowcomputing.pixelfurnace.DateScreen;
import com.nowcomputing.uistuff.GamebandColors;
import com.nowcomputing.uistuff.GamebandFonts;
import com.nowcomputing.uistuff.apackage.t;

public class b extends e implements ActionListener {
	DateScreen a;
	private com.nowcomputing.a.g g;

	public b(t var1, DateScreen var2) {
		super(var1, LocaleUtil.getLocalizedString("DATE"));
		this.a = var2;
		this.h();
		this.g = new com.nowcomputing.a.g();
		var2.a(this.g);
		JRadioButton var3 = new JRadioButton(TimeDisplay.normal.a());
		var3.setActionCommand(TimeDisplay.normal.a());
		var3.setOpaque(false);
		var3.setFont(GamebandFonts.u);
		var3.setForeground(GamebandColors.m);
		var3.setBounds(278, 6, 120, 20);
		this.add(var3);
		JRadioButton var4 = new JRadioButton(TimeDisplay.crackhead.a());
		var4.setActionCommand(TimeDisplay.crackhead.a());
		var4.setOpaque(false);
		var4.setFont(GamebandFonts.u);
		var4.setForeground(GamebandColors.m);
		var4.setBounds(278, 24, 120, 20);
		this.add(var4);
		if (var2.getDateFormat() == 2) {
			var4.setSelected(true);
		} else {
			var3.setSelected(true);
		}

		ButtonGroup var5 = new ButtonGroup();
		var5.add(var3);
		var5.add(var4);
		var3.addActionListener(this);
		var4.addActionListener(this);
	}

	@Override
	public Animation b() {
		return this.a;
	}

	@Override
	public void d() {
		SimpleDateFormat var1 = new SimpleDateFormat(this.a.b().b(), LocaleUtil.a());
		var1.setTimeZone(LocaleUtil.e());
		String var2 = var1.format(new Date());
		this.a(this.e.d().c());
		Image var3 = this.a(var2);
		this.a.h().b(var3);
		this.a.i().a(var3);
		this.a.i().b(new Image(20, 7));
		this.g.a(var3, Duality.a, 3000, 20);
		super.d();
	}

	@Override
	public void actionPerformed(ActionEvent var1) {
		if (TimeDisplay.normal.a().equals(var1.getActionCommand())) {
			this.a.SetDateFormat(TimeDisplay.normal);
		} else if (TimeDisplay.crackhead.a().equals(var1.getActionCommand())) {
			this.a.SetDateFormat(TimeDisplay.crackhead);
		}

		this.e.a(true);
		if (this.j()) {
			this.e();
			this.d();
		}

	}

	private Image a(String var1) {
		int var2 = this.e.d().getOrientation() == 0 ? 3 : 0;
		Image var3 = new Image(20, 7);
		var3.ramImageInForcefully(Image.FromFile(var1), var2, 1);
		return var3;
	}
}
