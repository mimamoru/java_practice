//
//import java.util.Random;
import java.util.Scanner;
public class Sample2 {
 public static void main(String[] args) {
// Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
int x;
int sum=1;
int b_sum=1;
do {
	System.out.print("x:");
	x=stdIn.nextInt();
}while(x<=0);
for(int i=2; i<=x; i++) {
	sum+=x;
	System.out.println(b_sum+"+"+i+"="+sum);
	b_sum+=x;
}
stdIn.close();
 }}