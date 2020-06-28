class Human2{
    private String name;
    private int height;
    private int weight;
    private static int counter=0;
    private int id;

    Human2( String name,int height,int weight){
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.id=++counter;;
    }
    Human2(){
    	this("name",0,0);

       }
    Human2(Human2 c){
    	this(c.name,c.height,c.weight);
    }
    int getId(){
        return this.id;
    }

    String getName(){
        return this.name;
    }
    int getHeight(){
        return this.height;
    }
    int getWeight(){
        return this.weight;
    }
	@Override
	public String toString() {
		return "Human2 [name=" + name + ", height=" + height + ", weight=" + weight + ", id=" + id + "]";
	}


}


public class P10_1 {
    public static void main(String[] args) {

    	Human2 h1=new Human2("aa",156,50);
    	Human2 h2=new Human2(h1);
    	System.out.println(h1);
    	System.out.println(h2);
    }
}