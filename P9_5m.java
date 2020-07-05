
import java.util.Scanner;

public class P9_5m {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("name=>");
		String name=stdIn.next();
		 System.out.print("number=>");
		 String number=stdIn.next();
		 System.out.print("balance=>");
		 long balance=stdIn.nextInt();
		System.out.print("year=>");
		 int year=stdIn.nextInt();
		 System.out.print("month=>");
		 int month=stdIn.nextInt();
		 System.out.print("date=>");
		 int date=stdIn.nextInt();
		 
		P9_5 h1=new P9_5(name,number,balance,new P9_4(year,month,date));		
		System.out.println(h1);

		P9_4 c6=new P9_4(2017,10,15);
		P9_5 h2=new P9_5(name,number,balance,c6);		
		System.out.println(h1);
	
		
		
//		Scanner stdIn=new Scanner(System.in);
//		System.out.print("year=>");
//		 int year=stdIn.nextInt();
//		 System.out.print("month=>");
//		 int month=stdIn.nextInt();
//		 System.out.print("date=>");
//		 int date=stdIn.nextInt();
//		P9_5 h1=new P9_5("a","1234567",10000,new P9_4(year,month,date));
//		System.out.println(h1.getOpenDay());
//		System.out.println(h1);
//		h1.getOpenDay().set(1999, 1, 3);
//		System.out.println(h1.getOpenDay());
//		System.out.println(h1);
//	

		stdIn.close();
	}

}
