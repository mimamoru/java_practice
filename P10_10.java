import java.util.ArrayList;
import java.util.List;

public class P10_10 {
	private String name;
	private String no;

	private long balance;
	private P9_4 openDay;
    private static List<String> nos=new ArrayList<String>();

    {
    	System.out.println("Thank You For Openning Account!");


		}

		//this.balance=balance;
		//this.openDay=date;
		//this.openDay=new P9_4(date);


    P10_10(String name,String no,long balance,P9_4 date){
    	System.out.println("const");
		this.name=name;
		while(nos.contains(no)) {
			no= String.valueOf(Math.floor(Math.random()*10000)+"abc");
		}
		this.no=no;
		nos.add(no);
		this.balance=balance;
		//this.openDay=date;
		this.openDay=new P9_4(date);
	}
    P10_10(String name,String no,long balance){
		this(name, no, balance, new P9_4());
	}
    P10_10(String name,String no){
  		this(name, no, 0);
  	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public P9_4 getOpenDay() {
		return new P9_4(openDay);
	}

	public boolean deposit(int k) {
		balance+=k;
		return true;
	}
    public boolean withdraw(int k) {
    	if(k>=balance) {
    		balance-=k;
    		return true;
    	}else {
    		return false;
    	}
	}

    public String toString() {
    	//return String.format("name%n%s%nnumber%n%sdate%n%tY/%tm/%td",this.name,this.no,this.date,this.date,this.date);
    	return String.format("name  %s%nnumber  %s%nbalance %d%n",this.name,this.no,this.balance)+this.getOpenDay();
		//return String.format("name  %s%nnumber  %s%nbalance  %d%ndate  %tY/%tm/%td",this.name,this.no,this.balance,this.openDay,this.openDay,this.openDay);
	}
}
