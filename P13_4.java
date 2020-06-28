public abstract class P13_4 extends P13_3Shape{
	private int length;

	public P13_4(int length) {
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
		return "P13_4 [length=" + length +"]";
	}
}

class P13_4LB extends P13_4{

	public P13_4LB(int length) {
		super(length);
	}

	public  void draw() {
		for(int i=0; i<getLength(); i++) {
			for(int j=0;j<getLength(); j++) {
				if(j<=i) {
				System.out.print("*");
				}
				}System.out.println();
			}
	}
}
class P13_4LU extends P13_4{

	public P13_4LU(int length) {
		super(length);
	}

	public  void draw() {
		for(int i=0; i<getLength(); i++) {
			for(int j=0;j<getLength(); j++) {
				if(getLength()-i>j) {
				System.out.print("*");
				}
				}System.out.println();
			}
	}
}
class P13_4RB extends P13_4{

	public P13_4RB(int length) {
		super(length);
	}

	public  void draw() {
		for(int i=0; i<getLength(); i++) {
			for(int j=0;j<getLength(); j++) {
				if((getLength()-i-1)<=j) {
				System.out.print("*");
				}else {System.out.print(" ");}
				}System.out.println();
			}
	}
}
class P13_4RU extends P13_4{

	public  P13_4RU(int length) {
		super(length);
	}

	public  void draw() {
		for(int i=0; i<getLength(); i++) {
			for(int j=0;j<getLength(); j++) {
				if(j>=i) {
				System.out.print("*");
				}else {System.out.print(" ");}
				}System.out.println();
			}
	}
}