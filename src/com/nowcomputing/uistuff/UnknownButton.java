package com.nowcomputing.uistuff;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class UnknownButton extends JButton {
	public UnknownButton() {
		this((String) null, (Icon) null);
	}

	public UnknownButton(Icon var1) {
		this((String) null, var1);
	}

	public UnknownButton(String var1, Icon var2) {
		super(var1, var2);
		this.setForeground(GamebandColors.d());
	}

	public void paintComponent(Graphics var1) {
		ImageIcon var2 = this.getModel().isPressed() ? (ImageIcon) this.getPressedIcon() : (ImageIcon) this.getIcon();
		var1.drawImage(var2.getImage(), (this.getWidth() - var2.getImage().getWidth((ImageObserver) null)) / 2,
				(this.getHeight() - var2.getImage().getHeight((ImageObserver) null)) / 2, GamebandColors.DARKER_GRAY,
				(ImageObserver) null);
	}
}
