
class Id {
	private int id;
	private static int counter=0;
	Id(){
		this.id=++counter;
	}
	int getId(){
		return this.id;
	}
	static int getMaxId(){
		return counter;
	}
}
public class P10_2 {
    public static void main(String[] args) {

    	Id i1=new Id();
    	Id i2=new Id();
    	System.out.println(i1.getId());
    	System.out.println(i2.getId());
    	//System.out.println(i2.counter);
    }
}