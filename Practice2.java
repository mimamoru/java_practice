import java.util.Scanner;

public class Practice2 {
	static int calc(int a,int b) {
		int i=Math.min(a,b);
		do {
			if(a%i==0&&b%i==0) {
				return i;}
		}while(--i>1);
		return 1;
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("a:");int a=stdIn.nextInt();
		System.out.print("b:");int b=stdIn.nextInt();
		System.out.println(calc(a,b));
		stdIn.close();
	}

}
