//6-4
import java.util.Scanner;
public class P6_8 {
 public static void main(String[] args) {
	// Random rnd=new Random();
	 Scanner stdIn=new Scanner(System.in);

	 System.out.print("x:"); int x=stdIn.nextInt();
	 int[]a=new int[x];
	 for(int i=0; i<x; i++) {
	 System.out.print("i:");a[i]=stdIn.nextInt();
	 }
	 System.out.print("a:"); int ans=stdIn.nextInt();
	 int t=0;
	 for(int i=0; i<x; i++) {
		 //System.out.print(a[i]);
		 if(a[i]==ans) {
			 t=1;
			 System.out.print("index="+i);
			 break;
		 }

	}if(t==0) {
		System.out.print("noooooo");
	}stdIn.close();
 }}