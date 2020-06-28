//
import java.util.Random;
import java.util.Scanner;


public class R10_1 {
	 static Random rnd=new Random();
	 Scanner stdIn=new Scanner(System.in);
	 private int x;
	 private int y;
	 private int z;
	 private int my_count;
	 private static int count;
	 static{
		 count=rnd.nextInt(10)*100;
	 }
	 {
		 count++;
	 }
	 R10_1(int x,int y,int z){
		 this.x=x;
		 this.y=y;
		 this.z=z;
		 this.my_count=count;

	 }
	 @Override
		public String toString() {
			return "R10_1 [x=" + x + ", y=" + y + ", z=" + z + ",my_count="+my_count+"]";
		}
	 public static void main(String[] args) {
		 R10_1 p1=new R10_1(1,2,3);

		 R10_1 p2=new R10_1(4,5,6);

		 R10_1 p3=new R10_1(7,8,9);

		 R10_1 p4=new R10_1(1,2,3);
		 System.out.println(count);
		 System.out.println(p1);
		 System.out.println(p2);
		 System.out.println(p3);
		 System.out.println(p4);
	 }

}
