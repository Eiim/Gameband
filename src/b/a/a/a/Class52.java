package b.a.a.a;

import java.util.Collections;
import java.util.List;
import javax.swing.JComponent;

class Class52 extends Class46 {
	private int field110 = 1;
	private Class52 field111 = null;
	private Class52 field112 = null;
	private List field113 = Collections.emptyList();

	public Class52(int var1, JComponent var2) {
		super(var2);
		this.field110 = var1;
	}

	public JComponent method225() {
		return this.field111 != null ? this.field111.method225() : super.method60();
	}

	public int method226() {
		if (this.field111 == null && this.field112 == null) {
			return super.method61();
		} else if (this.field112 != null) {
			return 0;
		} else {
			int var1 = 0;

			for (int var2 = 0; var2 < this.field113.size() - 1; ++var2) {
				Class32 var3 = (Class32) this.field113.get(var2);
				var1 += var3.method117() + var3.method113();
			}

			return Math.max(0, super.method61() - var1);
		}
	}

	public void method142(List var1) {
		this.field113 = var1;
		if (this.field112 != null) {
			this.field112.method142(this.field113);
		}

	}

	public boolean method144() {
		return this.field111 == null;
	}

	public boolean method145() {
		return this.field112 == null;
	}

	public int method143() {
		int var1 = 1;

		for (Class52 var2 = this.field112; var2 != null; var2 = var2.field112) {
			++var1;
		}

		return var1;
	}

	public void method231(JComponent var1) {
		this.method79(var1);
		this.field110 = this.field111.method232();
		this.field111.field112 = null;
		this.field111 = null;
	}

	public int method232() {
		return this.field111 != null ? this.field111.method232() : this.field110;
	}
}
