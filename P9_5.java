import java.util.ArrayList;
import java.util.List;

public class P9_5 {
	private String name;
	private String no;
	private long balance;
	private P9_4 openDay;

    private static List<String> nos=new ArrayList<String>();
	public P9_5(String name,String no,long balance,P9_4 date){
		this.name=name;
		while(nos.contains(no)) {
			no= String.valueOf(Integer.parseInt(no)+1);
		}
		this.no=no;
		nos.add(no);
		this.balance=balance;
		//this.openDay=date;
		this.openDay=new P9_4(date);
	}
	public P9_5(String name,String no,long balance){
		this(name, no, balance, new P9_4());
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

	public boolean deposit(long k) {
		balance+=k;
		return true;
	}
    public boolean withdraw(long k) {
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
