import java.util.Scanner;

public class P9_4m {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		 System.out.println("day1");
		 System.out.print("year=>");
		 int year=stdIn.nextInt();
		 System.out.print("month=>");
		 int month=stdIn.nextInt();
		 System.out.print("date=>");
		 int date=stdIn.nextInt();
		 P9_4 c1=new P9_4(year,month,date);
		 System.out.println("day1");
		 System.out.println(c1);
		 P9_4 c2=new P9_4(c1);
		 System.out.println("day2 was made by day1");
		 System.out.println(c2.equalTo(c1)?"day2 is same to day1":"day2 is not same to day1");
		 System.out.println("day2");
		 System.out.println(c2);
		 P9_4 c3=new P9_4();
		 System.out.printf("d1   =%s%n",c3);
		 P9_4 c4=new P9_4(2017);
		 System.out.printf("d2   =%s%n",c4);
		 //System.out.println("d2"+c4);
		 P9_4 c5=new P9_4(2017,10);
		 System.out.printf("d3   =%s%n",c5);
		 //System.out.println("d3"+c5);
		 P9_4 c6=new P9_4(2017,10,15);
		 System.out.printf("d4   =%s%n",c6);
		 //System.out.println("d4"+c6);
		 System.out.println(c6.equalTo(c1)?"d4 is same to day1":"d4 is not same to day1");
		 P9_4 c[]= {new P9_4(),new P9_4(),new P9_4()};
		 for(int i=0; i<c.length; i++) {
			 System.out.printf("c[%d] =%s%n",i,c[i]);
		 }
		
		stdIn.close();
	}

}
