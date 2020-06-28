class ExId {
	private int id;
	private static int n=1;
	private static int counter=0;
	ExId(){
		counter+=n;
		this.id=counter;
	}
	int getId(){
		return this.id;
	}

	public static void setN(int sn) {
		n = sn>0?sn:1;
	}

	public static int getN() {
		return n;
	}
	static int getMaxId(){
		return counter;
	}
	@Override
	public String toString() {
		return "ExId [id=" + id + ", n=" + n + "]";
	}

}
public class P10_4 {

	public static void main(String[] args) {
		ExId i1=new ExId();
		ExId i2=new ExId();
		ExId i3=new ExId();
		ExId.setN(4);
		ExId i4=new ExId();
		ExId i5=new ExId();
		ExId i6=new ExId();
    	System.out.println(i1.getId());
    	System.out.println(i2.getId());
    	System.out.println(i3.getId());
    	System.out.println(i4.getId());
    	System.out.println(i5.getId());
    	System.out.println(i6.getId());
    	System.out.println(ExId.getMaxId());
    	System.out.println(ExId.getMaxId()+ExId.getN());

	}

}
