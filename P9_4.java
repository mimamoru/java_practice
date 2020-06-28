import java.util.Calendar;

class P9_4 {
	private int year;
	private int month;
	private int date;
	public String[] yobi= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	private static final Calendar cl=Calendar.getInstance();
	private static final int dy= cl.get(Calendar.YEAR);
	private static final int dm =  cl.get(Calendar.MONTH)+1;
	private static final int ds = cl.get(Calendar.DATE);

	P9_4(){
		//this(1);
		this(dy);
	};
	P9_4(int year){
		this(year,dm);
		//this(year,1);
	};
	P9_4(int year,int month){
		this(year,month,ds);
	};
	P9_4(P9_4 c){
		this(c.year,c.month,c.date);
	};
	P9_4(int year,int month,int date){
		set(year,month,date);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	};
	public void set(int year,int month,int date) {
		this.year=year<1?1:year;
		this.month=month;
		this.date=date;

	};

	public int dayOfWeek(int year,int month,int date) {
		int y=year;
		int m=month;
		if(m==1||m==2) {
			y--;
			m+=12;
		}
		return (y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
	}
	public int dayOfWeek(P9_4 c) {
		return dayOfWeek(c.year,c.month,c.date) ;
	}

	public boolean equalTo(P9_4 c) {
		return (this.year==c.year&&this.month==c.month&&this.date==c.date);
	}

	@Override
	public  String toString() {
		//System.out.printf("%04d//%02d//%02d (%s)%n",year,month,date,yobi[dayOfWeek(this)]);
		return String.format("%04d/%02d/%02d (%s)",year,month,date,yobi[dayOfWeek(this)]);//year,month,date
//		return String.format("%04d//%02d//%02d (%s)",this.getYear(),this.getMonth(),yobi[this.getDate()]);
	}

	//public static void main(String[] args) {}


}
