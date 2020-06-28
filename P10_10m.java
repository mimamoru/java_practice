
import java.util.Scanner;

public class P10_10m {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("num=>");
		 int num=stdIn.nextInt();
		 P10_10[] hs=new P10_10[num];
		 for(int i=0; i<num; i++) {
			System.out.print("type=>");
			 int type=stdIn.nextInt();
		System.out.print("name=>");
		String name=stdIn.next();
		 System.out.print("number=>");
		 String number=stdIn.next();
		 if(type==1) {
		 System.out.print("balance=>");
		 long balance=stdIn.nextInt();
		System.out.print("year=>");
		 int year=stdIn.nextInt();
		 System.out.print("month=>");
		 int month=stdIn.nextInt();
		 System.out.print("date=>");
		 int date=stdIn.nextInt();
		 hs[i]=new P10_10(name,number,balance,new P9_4(year,month,date));
		 }else {
		 hs[i]=new P10_10(name,number);
		 }

		System.out.println(hs[i]);
		 }

		stdIn.close();
	}

}
