public abstract class P13_3AbstLine extends P13_3Shape{
	private int length;
	public P13_3AbstLine(int length) {
		setLength(length);
	}
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "P13_3AbstLine [length=" + length + "]";
	}

}

class HorzLine extends P13_3AbstLine{
	public HorzLine(int length) {
		super(length);
	}
	@Override
	public String toString() {
		return "HorzLine [HorzLine=" + getLength()+ "]";
	}

	public void draw() {
		for(int i=1; i<=getLength(); i++) {
		System.out.print("-");
		}
	System.out.println();
}
}

class VertLine extends P13_3AbstLine{
	public VertLine(int length) {
		super(length);
	}
	@Override
	public String toString() {
		return "VertLine [VertLine=" + getLength()+ "]";
	}

	public void draw() {
		for(int i=1; i<=getLength(); i++) {
		System.out.print("|");
		}
	System.out.println();
}
}