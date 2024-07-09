package b.a.a.a;

import javax.swing.JComponent;

class Class24 implements Class13 {
	private JComponent field56;

	public Class24(JComponent var1) {
		this.field56 = var1;
	}

	protected void method79(JComponent var1) {
		this.field56 = var1;
	}

	public JComponent method60() {
		return this.field56;
	}

	public int method61() {
		return this.method60().getPreferredSize().height;
	}

	public int method62() {
		return this.method60().getMinimumSize().width;
	}

	public int method63() {
		return this.method60().getPreferredSize().width;
	}

	public int method64() {
		return Class27.method91(this.method60());
	}
}
