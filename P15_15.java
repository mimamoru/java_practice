
class P15_15 extends P10_8{
	private static boolean all;
	private static int k=0;
	P15_15(){
		super(dy);
	};
	P15_15(int year){
		super(year,dm);
		all=true;
	}
	P15_15(int year,int month){

		super(year,month);
	};
	P15_15(P15_15 c){
		super(c.getYear(),c.getMonth());
	};

	public int monthDays() {
		if(this.isLeap()) {return 29;}
		switch(getMonth()) {
		case 2:return 28;
		case 4:case 6:case 9:case 11:return 30;
		default:return 31;
		}
	}
	public int monthDays(int year,int month) {
		return new P15_15(year,month).monthDays();
	}

	public void putCalendar2() {
		int md=31;
		int wd=7;
		if(all&&k==0) {
			System.out.println(getYear()+"年のカレンダー");
			for(k=1; k<=12;k++) {
				System.out.println(k+"月");
				wd=dayOfWeek(getYear(),k,1);
				md=monthDays(getYear(),k);
				putCalendar(getYear(),k);
			}
		}else {
			if(!all) {
				System.out.println(getYear()+"年"+getMonth()+"月のカレンダー");}
			System.out.printf("%-2s%-2s%-2s%-2s%-2s%-2s%-2s%n","日","月","火","水","木","金","土");
			wd=dayOfWeek(getYear(),getMonth(),1);
			md=monthDays(getYear(),getMonth());

			int day=1;
			outer:
				for(int i=0; i<5; i++) {
					for(int j=0; j<7; j++) {
						if(i==0&&j<wd) {System.out.print("   ");
						}else {
							System.out.printf("%3d",day);
							day++;
							if(day>md) {
								break outer;
							}
						}
					}
					System.out.println();
				}System.out.println();}
	}
	static void putCalendar(int year,int month) {
		new P15_15(year,month).putCalendar2();
	}
	static void putCalendar(int year) {
		all=true;
		new P15_15(year).putCalendar2();
	}
	static void putCalendar() {
		new P15_15().putCalendar2();
	}

	public static void main(String[] args) {
		int length=args.length;

		if(length==2) {
			putCalendar(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		}else if(length==1) {
			putCalendar(Integer.parseInt(args[0]));
		}else {
			putCalendar();
		}

	}
}
