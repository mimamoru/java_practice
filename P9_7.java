
class Period {
	private P9_4 from;
	private P9_4 to;

	Period(P9_4 from, P9_4 to){
//		this.from=new  P9_4(from);
//		this.to=new  P9_4(to);
		this.from=from;
		this.to=to;
	}

	public P9_4 getFrom() {
		return new  P9_4(from);
	}

	public void setFrom(P9_4 from) {
		this.from = new  P9_4(from);
	}

	public P9_4 getTo() {
		return new  P9_4(to);
		//return to;
	}

	public void setTo(P9_4 to) {
		this.to = new  P9_4(to);
	}

	@Override
	public String toString() {
		return "from"+from+"=>"+"to"+to;
	}
}

public class P9_7 {
    public static void main(String[] args) {

    	Period p1=new Period(new P9_4(1997,4,25),new P9_4(2099,8,9));
    	System.out.println(p1);
    	P9_4 to=p1.getTo();
    	to.set(2000, 5, 20);
       System.out.println(p1);
    }
}
