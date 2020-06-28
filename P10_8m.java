import java.util.Scanner;

public class P10_8m {
	static Scanner stdIn=new Scanner(System.in);

	static void display(P10_8 day) {
		System.out.println("day:"+day);
		System.out.println("leap"+day.isLeap());
		System.out.println("now_days"+day.DayOfYear());
		System.out.println("lest_days"+day.leftDayOfYear());
	}

	static void change(P10_8 day) {
		System.out.println("1:set,2:setYear");
		System.out.println("3:setMonth,4:setDate");
		System.out.println("5:succeed,6:preceed");
		System.out.println("7:succeedDays,8:preceedDays");
		int change=stdIn.nextInt();
		int y=0,m=0,d=0,n=0;

		if(change==1||change==2) {
			System.out.print("year=>");y=stdIn.nextInt();
		}
		if(change==1||change==3) {
			System.out.print("month=>");m=stdIn.nextInt();
		}
		if(change==1||change==4) {
			System.out.print("day=>");d=stdIn.nextInt();
		}
		if(change==7||change==8) {
			System.out.print("day_count=>");n=stdIn.nextInt();
		}

		 switch(change) {
		 case 1:day.setAll(y, m, d);; break;
		 case 2:day.setYear(y); break;
		 case 3:day.setMonth(m); break;
		 case 4:day.setDate(d); break;
		 case 5:day.succeed(); break;
		 case 6:day.preceed(); break;
		 case 7:day.succeedDays(n); break;
		 case 8:day.preceedDays(n); break;
		 }
		 System.out.println(day);
	}

	static void compare(P10_8 day) {
		System.out.print("year=>");int y=stdIn.nextInt();
		System.out.print("month=>");int m=stdIn.nextInt();
		System.out.print("day=>");int d=stdIn.nextInt();
		P10_8 d2=new P10_8(y,m,d);
		int comp=day.compareTo(d2);
		System.out.print(day);

		 switch(comp) {
		 case -1:System.out.println("before"); break;
		 case 1:System.out.println("after"); break;
		 case 0:System.out.println("same"); break;

		 }
	}

	static void beforeAfter(P10_8 day) {
		System.out.println("beforeAfter:1,2,3,4");
		int type=stdIn.nextInt();
		int n=0;
		if(type==3||type==4) {
			System.out.print("day=>");n=stdIn.nextInt();
		}


		 switch(type) {
		 case 1:System.out.println(day.succeedingDay()); break;
		 case 2:System.out.println(day.preceedingDay()); break;
		 case 3:System.out.println(day.after(n)); break;
		 case 4:System.out.println(day.before(n)); break;

		 }
	}


	public static void main(String[] args) {

		 System.out.println("day1");
		 System.out.print("year=>");int year=stdIn.nextInt();
		 System.out.print("month=>");int month=stdIn.nextInt();
		 System.out.print("date=>"); int date=stdIn.nextInt();

		 P10_8 day=new P10_8(year,month,date);

		 while(true) {
			 System.out.println("menu:1,2,3,4");
			 int menu=stdIn.nextInt();
			 if(menu==5) {break;}

			 switch(menu) {
			 case 1:display(day); break;
			 case 2:change(day); break;
			 case 3:compare(day); break;
			 case 4:beforeAfter(day); break;
			 }
		 }

		 stdIn.close();
	}

}
