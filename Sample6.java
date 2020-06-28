//正方形
//import java.util.Random;
import java.util.Scanner;
public class Sample6 {
 public static void main(String[] args) {
// Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
int x;
do {
System.out.print("x:"); x=stdIn.nextInt();
}while(x<0);
int y=0;
for (int i=0; i<x; i++) {
	int by=y;
	System.out.print("?:");
	y+=stdIn.nextInt();
	if(y>1000) {
		y=by;
		break;
	}
}


 System.out.println(y);
 stdIn.close();
 }}