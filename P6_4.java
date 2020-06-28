//6-4
import java.util.Random;
import java.util.Scanner;
public class P6_4 {
 public static void main(String[] args) {
	 Random rnd=new Random();
	 Scanner stdIn=new Scanner(System.in);

	 System.out.print("x:"); int x=stdIn.nextInt();
	 String[][] arr=new String[11][x];
	 int[]a=new int[x];
	 for(int i=0; i<x; i++) {

			a[i]=(i+1)%10;

	 }
	 for(int i=0; i<x; i++) {
		 int rn=rnd.nextInt(10)+1;
		 for(int j=9; j>=10-rn; j--) {
			arr[j][i]="* ";
		 }
	 }

	 for(int i=0; i<11; i++) {

		 for(int j=0; j<x; j++) {
			 System.out.print(arr[i][j]=="* "?"* ":"  ");
		 }
	System.out.println();
	 }
	//  for(int i:a) {
	// 		System.out.print("--");
	// 	}
	 System.out.println();
	 for(int i:a) {
	System.out.print(i+" ");
}stdIn.close();
 }}