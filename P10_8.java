
import java.util.Calendar;


class P10_8 {
	private int year;
	private int month;
	private int date;
	public final String[] yobi= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

	 static final Calendar cl;
	 static final int dy;
	 static final int dm;
	 static final int ds ;

	static {
		cl = Calendar.getInstance();
		dy = cl.get(Calendar.YEAR);
		dm =  cl.get(Calendar.MONTH)+1;
		ds = cl.get(Calendar.DATE);
		System.out.printf("今日は%04d年%02d月%02d日です%n",dy,dm,ds);
	}

	P10_8(){
		//this(1);
		this(dy);
	};
	P10_8(int year){
		this(year,dm);
	}
	P10_8(int year,int month){

		this(year,month,ds);
	};
	P10_8(P10_8 c){
		this(c.year,c.month,c.date);
	};
	P10_8(int year,int month,int date){
		setAll(year,month,date);
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
	public void setAll(int year,int month,int date) {
		this.year=year<1?1:year;
		this.month=month<1?1:month>12?12:month;
		this.date=date<1?1:date>29&&isLeap()&&month==2?28:date>29&&month==2?29:(date>30&&(month==4||month==6||month==9||month==11))?30:date>31?31:date;
	};
	public boolean isLeap() {
		Calendar cal = Calendar.getInstance();
		cal.set(this.year, 1, 28);
		cal.add(Calendar.DATE, +1);
		if (cal.get(Calendar.MONTH)+1 == 3) {
			return false;
		}
		return true;
	}
	public boolean isLeapDay(int day) {
		return isLeap() ;
	}
	private static P10_8 makeP10_8(Calendar c) {
		return  new P10_8(c.get(Calendar.YEAR),c.get(Calendar.MONTH)+1,c.get(Calendar.DATE));
	}
	private static Calendar makeCal(P10_8 d) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(d.year, d.month-1, d.date);
		return cal1 ;
	}
	public int compareTo(P10_8 d) {
		return compare(this,d);
	}
	static int compare(P10_8 d1,P10_8 d2) {
		Calendar day1=makeCal(d1);
		Calendar day2=makeCal(d2);
		return day1.equals(day2)?0:day1.before(day2)?-1:1;
	}
	public void succeed(){
		Calendar cal1=makeCal(this);
		cal1.add(Calendar.DAY_OF_MONTH, 1);
		this.setAll(makeP10_8(cal1).year,makeP10_8(cal1).month,makeP10_8(cal1).date);
	}
	public void succeedDays(int n){
		for(int i=0; i<n; i++) {
			this.succeed();
		}
	}

	public void preceed(){
		Calendar cal1=makeCal(this);
		cal1.add(Calendar.DAY_OF_MONTH, -1);
		this.setAll(makeP10_8(cal1).year,makeP10_8(cal1).month,makeP10_8(cal1).date);
	}
	public void preceedDays(int n){

		for(int i=0; i<n; i++) {
			this.preceed();
		}
	}
	public P10_8 after(int n){
		P10_8 day=new P10_8(this);
		day.succeedDays(n);
		return day;
	}
	public P10_8 before(int n){
		P10_8 day=new P10_8(this);
		day.preceedDays(n);
		return day;
	}

	public P10_8 succeedingDay(){
		P10_8 day=new P10_8(this);
		day.succeed();
		return day;
	}
	public P10_8 preceedingDay(){
		P10_8 day=new P10_8(this);
		day.preceed();
		return day;
	}
	public int DayOfYear() {
		int count=0;
		P10_8 d=new P10_8(this.year,1,1);

		while(this.compareTo(d)==1) {
			this.preceed();
			count++;
		}
		this.succeedDays(count);//同じインスタンスで日付を戻すか初期化して日付を変更するか。
		return count ;
	}
	public int leftDayOfYear() {
		System.out.println(this.DayOfYear());
		return (isLeap()?364:365)-this.DayOfYear() ;
	}
	public int dayOfWeek(int year,int month,int date) {
		int y=year;
		int m=month;
		if(m==1||m==2) {
			y--;
			m+=12;
		}
		return (y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
	}
	public int dayOfWeek(P10_8 c) {
		return dayOfWeek(c.year,c.month,c.date) ;
	}

	public boolean equalTo(P10_8 c) {
		return (this.year==c.year&&this.month==c.month&&this.date==c.date);
	}

	@Override
	public  String toString() {
		return String.format("%04d/%02d/%02d (%s)",year,month,date,yobi[dayOfWeek(this)]);
	}
}
