package com.nowcomputing.uistuff;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.nowcomputing.LocaleUtil;
import com.nowcomputing.Utils;

public class M extends DialogPanel {
   private static final Logger a = Logger.getLogger(Utils.class.getName());
   private JButton b = new GamebandButton();
   private JButton h = new GamebandButton();
   private JButton i = new GamebandButton();
   private ImageIcon j = new ImageIcon(this.getClass().getResource("/resources/gameband_logo.png"));
   private JLabel k = new JLabel();
   private JPanel l;

   M() {
      this.setLayout(new BorderLayout());
      this.a();
   }

   @Override
public void a() {
      this.removeAll();
      this.a(this.j);
      this.a(false);
      this.c(true);
      this.b(true);
      super.a();
   }

   @Override
protected Component b() {
      JPanel var1 = new JPanel();
      var1.setLayout(new BorderLayout());
      var1.setBackground(GamebandColors.a);
      var1.add(this.c(), "North");
      var1.add(this.o(), "Center");
      var1.add(this.p(), "South");
      return var1;
   }

   public JPanel c() {
      JPanel var1 = new JPanel();
      var1.setLayout(new FlowLayout(1, 20, 0));
      var1.setOpaque(false);
      var1.setBorder(new EmptyBorder(154, 0, 0, 0));
      this.b.setText("<html><center>" + LocaleUtil.getLocalizedString("PLAY_MINECRAFT").toUpperCase());
      this.b.setFont(GamebandFonts.A);
      this.b.setIcon(new ImageIcon(this.getClass().getResource("/resources/minecraft_icon.png")));
      this.b.setVerticalTextPosition(3);
      this.b.setHorizontalTextPosition(0);
      this.b.setPreferredSize(new Dimension(200, 120));
      var1.add(this.b);
      this.h.setText("<html><center>" + LocaleUtil.getLocalizedString("PIXELFURNACE").toUpperCase());
      this.h.setFont(GamebandFonts.A);
      this.h.setIcon(new ImageIcon(this.getClass().getResource("/resources/pf_icon.png")));
      this.h.setVerticalTextPosition(3);
      this.h.setHorizontalTextPosition(0);
      this.h.setPreferredSize(new Dimension(200, 120));
      var1.add(this.h);
      this.i.setText("<html><center>" + LocaleUtil.getLocalizedString("OPTIONS_HEADING").toUpperCase());
      this.i.setFont(GamebandFonts.A);
      this.i.setIcon(new ImageIcon(this.getClass().getResource("/resources/settings_icon.png")));
      this.i.setVerticalTextPosition(3);
      this.i.setHorizontalTextPosition(0);
      this.i.setPreferredSize(new Dimension(200, 120));
      var1.add(this.i);
      return var1;
   }

   private Component o() {
      this.l = new JPanel();
      this.l.setLayout(new FlowLayout(1, 0, 0));
      this.l.setOpaque(false);
      this.l.setBorder(new EmptyBorder(70, 0, 0, 0));
      return this.l;
   }

   private Component p() {
      JPanel var1 = new JPanel();
      var1.setLayout(new FlowLayout(0, 0, 0));
      var1.setOpaque(false);
      var1.setBorder(new EmptyBorder(0, 50, 10, 0));
      this.k.setFont(GamebandFonts.B);
      this.k.setForeground(GamebandColors.b());
      var1.add(this.k);
      return var1;
   }

   JButton d() {
      return this.b;
   }

   JButton m() {
      return this.h;
   }

   JButton n() {
      return this.i;
   }
}
