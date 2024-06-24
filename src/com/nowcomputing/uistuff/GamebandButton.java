package com.nowcomputing.uistuff;

import javax.swing.Icon;
import javax.swing.JButton;

public class GamebandButton extends JButton {
   public GamebandButton() {
      this((String)null, (Icon)null);
   }

   public GamebandButton(String var1) {
      this(var1, (Icon)null);
   }

   public GamebandButton(String var1, Icon var2) {
      super(var1, var2);
      this.setBackground(GamebandColors.c());
      this.setForeground(GamebandColors.d());
   }
}
