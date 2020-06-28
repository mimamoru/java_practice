//right
//import java.util.Random;
import java.util.Scanner;
public class Sample8 {
 public static void main(String[] args) {
 //Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
int x;
do {
System.out.print("x:"); x=stdIn.nextInt();
}while(String.valueOf(x).length()>15);


for (int i=0; i<15; i++) {
	System.out.print(i<15-String.valueOf(x).length()?" ":"");
}
 System.out.println(x);
 stdIn.close();
 }}