//break outer
//import java.util.Random;
import java.util.Scanner;
public class Sample7 {
 public static void main(String[] args) {
// Random rnd=new Random();
Scanner stdIn=new Scanner(System.in);

//do {
//System.out.print("x:"); x=stdIn.nextInt();
//}while(x<0);
int y=0;
outer:
for (int i=0; i<10; i++) {
	System.out.println("new group");
	for (int j=0; j<5; j++) {
		System.out.print("?:");
		int x=stdIn.nextInt();
	    if(x==8888) {
	    	break;
	    }
	    if(x==9999) {
	    	break outer ;
	    }
	    y+=x;

	}
}
 System.out.println(y);
 }}