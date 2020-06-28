//正方形
//import java.util.Random;
import java.util.Scanner;
public class Sample4 {
 public static void main(String[] args) {
// Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
System.out.print("x:"); int x=stdIn.nextInt();
for(int i=1; i<=x*x; i++) {
	System.out.print(i%x==0? "*\n":"*");
}
stdIn.close();
 //System.out.println(Math.(x,y,z));
 }}