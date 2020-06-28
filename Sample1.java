
//import java.util.Random;
import java.util.Scanner;
public class Sample1 {
 public static void main(String[] args) {
	 //Random rnd=new Random();
	 Scanner stdIn=new Scanner(System.in);
	 //System.out.print("x:"); double x=stdIn.nextDouble();
	 System.out.print("x:"); int x=stdIn.nextInt();
	 System.out.print("y:"); int y=stdIn.nextInt();
	 System.out.println(Math.max(x, y));
	 System.out.println((double)x/ y);
	// System.out.println(Integer.parseInt(Integer.valueOf(x),8));
	 for(int i=0; i<x; i++) {
		 System.out.println("%");
	 }
	 for(int i=0; i<y; i++) {
		 System.out.printf("%s\n","%");

	 }
	 System.out.printf("aaaaaaaaaa");
	 stdIn.close();
 }}