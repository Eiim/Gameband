package com.nowcomputing.uistuff.apackage;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

import com.nowcomputing.GamebandFont;

public class v extends DocumentFilter {
	private int a;

	public v(int var1) {
		this.a = var1;
	}

	@Override
	public void insertString(FilterBypass var1, int var2, String var3, AttributeSet var4) throws BadLocationException {
		Document var5 = var1.getDocument();
		int var6 = GamebandFont.a(var5.getText(0, var5.getLength()));
		int var7 = GamebandFont.a(var3);
		if (var6 + var7 <= this.a) {
			super.insertString(var1, var2, var3, var4);
		}

	}

	@Override
	public void replace(FilterBypass var1, int var2, int var3, String var4, AttributeSet var5)
			throws BadLocationException {
		Document var6 = var1.getDocument();
		int var7 = GamebandFont.a(var6.getText(0, var6.getLength()));
		int var8 = GamebandFont.a(var4);
		int var9 = GamebandFont.a(var6.getText(var2, var3));
		if (var7 - var9 + var8 <= this.a) {
			super.replace(var1, var2, var3, var4, var5);
		}

	}
}
