//三角形
//import java.util.Random;
import java.util.Scanner;
public class Sample5 {
 public static void main(String[] args) {
 //Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);
System.out.print("x:"); int x=stdIn.nextInt();
for(int i=1; i<=x; i++) {
	for(int j=0; j<=x-i; j++) {
		System.out.print("*");
	}
	System.out.println("");
}
System.out.println("");
for(int i=0; i<x; i++) {
	for(int j=0; j<x; j++) {
		System.out.print(j<i?" ":"*");
	}
	System.out.println("");
}
System.out.println("");
for(int i=1; i<=x; i++) {
	for(int j=1; j<=2*x-1; j++) {
		if(((2*x-1)-(2*i-1))/2<j&&j<=(((2*x-1)-(2*i-1))/2)+(2*i-1)) {System.out.print(i%10);
		}else {
		System.out.print(" ");}
	}
	System.out.println("");
}
System.out.println("");
for(int i=0; i<x; i++) {
	for(int j=0; j<2*x-1-i; j++) {
		System.out.print(j<i?" ":(x-i)%10);
	}
	System.out.println("");
}stdIn.close();
 }}