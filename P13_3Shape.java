public abstract class P13_3Shape{
	public static void main(String[] args) {
		P13_3Shape[] sh=new P13_3Shape[9];
		sh[0]=new Point();
		sh[1]=new HorzLine(6);
		sh[2]=new VertLine(6);
		sh[3]=new Rectangle(5,5);
		sh[4]=new P13_4LB(4);
		sh[5]=new P13_4LU(4);
		sh[6]=new P13_4RB(4);
		sh[7]=new P13_4RU(4);
		sh[8]=new Parallel(6,4);
		for(P13_3Shape i:sh) {
				i.print();
				if(i instanceof Rectangle||i instanceof Parallel) {
					System.out.println(((P14_3)i).getArea());
				}
			}
	}
	public abstract String toString();
	public abstract void draw();
	public  void print() {
		System.out.println(toString());
		draw();
	}
}

class Point extends P13_3Shape{
	//public Point(){}
	@Override
	public String toString() {
		return "Point";
	}

	public void draw() {
		System.out.println("+");
	}
}

class Rectangle extends P13_3Shape implements P14_3{
	private int width;
	private int height;
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" +width+ "height="+height+"]";
	}

	public void draw() {
		for(int i=1; i<=height; i++) {
			for(int j=1;j<=width; j++) {
				System.out.print("*");
				}System.out.println();
			}
	}
	public int getArea() {
		return height*width;
	}
}

class Parallel extends P13_3Shape implements P14_3{
	private int width;
	private int height;
	public Parallel(int width,int height){
		this.width=width;
		this.height=height;
	}
	@Override
	public String toString() {
		return "Parallel [width=" +width+ "height="+height+"]";
	}

	public void draw() {
		for(int i=1; i<=height; i++) {
			for(int j=1;j<=height-1; j++) {
				System.out.print(" ");
				}
			for(int j=1;j<=width; j++) {
				System.out.print("#");
				}System.out.println();
			}
	}
	public int getArea() {
		return height*width;
	}
}