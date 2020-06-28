//import java.util.Random;
import java.util.Scanner;

public class P10_6 {
	static double abs(double x) {
		return x>0?x:-x;
	}
	static double sqrt(double x) {
		return Math.sqrt(x);
	}
	static double round(double x) {
		return Math.PI*x*x;
	}
	 public static void main(String[] args) {
	//Random rnd=new Random();

	 Scanner stdIn=new Scanner(System.in);
	 double x=stdIn.nextDouble();
	 System.out.println(abs(x));
	 System.out.println(sqrt(x));
	 System.out.println(round(x));
	 stdIn.close();
	 }
}
