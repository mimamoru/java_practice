
class R9_1 {
	private int x;
	private int y;

	R9_1(int x,int y){
		set(x,y);
	}
	R9_1(){
		set(0,0);
	}
	R9_1(R9_1 xy){
		set(xy.x,xy.y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void set(int x,int y) {
		setX(x);
		setY(y);
	}
	@Override
	public String toString() {
		return "R9_1 [x=" + x + ", y=" + y + "]";
	}

}
class R9_2 {
	private R9_1 center;
	private int radius;

	R9_2(R9_1 center,int radius){
		set(new R9_1(center),radius);
	}
	R9_2(){
		set(new R9_1(),0);
	}
	R9_2(R9_2 xy){
		set(new R9_1(xy.center),xy.radius);
	}

	public R9_1 getCenter() {
		return center;
	}
	public void setCenter(R9_1 center) {
		this.center = new R9_1(center);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void set(R9_1 center,int radius) {
		setCenter(new R9_1(center));
		setRadius( radius);
	}
	@Override
	public String toString() {
		return "R9_2 [center=" + center + ", radius=" + radius + "]";
	}


}

public class R9 {
	 public static void main(String[] args) {
		 R9_1[] p=new R9_1[]{new  R9_1(3,7),new  R9_1(4,6)};
		 R9_2 c1=new R9_2();
		 R9_2 c2=new R9_2(new  R9_1(10,15),5);
		 for(int i=0; i<p.length; i++) {
			 System.out.println("p["+i+"]="+p[i]);
			c1.setRadius(10);

		 }
		 System.out.println("c1="+c1);
			System.out.println("c2="+c2);
	    }
}