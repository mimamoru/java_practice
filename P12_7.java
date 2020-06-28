
class P12_7s extends P9_5{
	private long timeBalance;

	P12_7s(String name,String no,long balance,P9_4 date,long timeBalance){
		super(name, no, balance, date);
		this.timeBalance=timeBalance;
	}
	P12_7s(String name,String no,long balance,long timeBalance){
    	this(name, no, balance,new P9_4(),timeBalance);
	}



	public long getTimeBalance() {
		return timeBalance;
	}

	void cancel() {
		deposit(timeBalance);
		timeBalance=0;
	}



    public String toString() {
    	return super.toString()+"timeBalance:"+timeBalance;
	}


}
class P12_7{

static int compBalance(P9_5 a,P9_5 b) {
	long tBa= a instanceof P12_7s?((P12_7s)a).getTimeBalance()+a.getBalance():a.getBalance();
	long tBb= b instanceof P12_7s?((P12_7s)b).getTimeBalance()+b.getBalance():b.getBalance();

	return tBb==tBa?0:tBb>tBa?-1:1;
}

public static void main(String[] args) {

	P12_7s a1=new P12_7s("a1","1234abc",10000,500);
	P12_7s a2=new P12_7s("a2","5678abc",10000,1500);
	 P9_5 b1=new P12_7s("b1","1234def",10000,500);
	 P9_5 b2=new P12_7s("b2","5678def",10000,500);
	 P9_5 c1=new P9_5("c1","1234ghi",10000);
	 P9_5 c2=new P9_5("c2","5678ghi",10000);
   	System.out.println(compBalance(a1,a2));
   	System.out.println(compBalance(b1,a2));
   	System.out.println(compBalance(b2,b1));
   	System.out.println(compBalance(c1,a2));
   	System.out.println(compBalance(c1,c2));
   	System.out.println(compBalance(b2,c1));

      System.out.println(a1);
      System.out.println(b1);
      System.out.println(c1);
   }
}