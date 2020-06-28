//r
//import java.util.Random;
import java.util.Scanner;
public class Sample9 {
 public static void main(String[] args) {
 //Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
int x;
do {
System.out.print("x:"); x=stdIn.nextInt();
}while(x<0);

int ans=1;
for (int i=1; i<=x; i++) {
	ans*=i;
	System.out.print(i!=x?i+"×":i);



}
 System.out.println("="+ans);
 stdIn.close();
 }}