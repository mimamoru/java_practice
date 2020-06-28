/**
 *
 * @author Labo
 *
 */
class P9_6s{
	/**String */
    private String name;
    /**int */
    private int height;
    private int weight;
    /**day */
    private P9_4 birthday;
/**
 *
 * @param name
 * @param height
 * @param weight
 * @param birthday
 */
    P9_6s( String name,int height,int weight, P9_4 birthday){
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.birthday=new P9_4(birthday);
    }
    P9_6s(){
        this.name="name";
        this.weight=0;
        this.height=0;
        this.birthday=new P9_4();
       }
    P9_6s(P9_6s c){
        this.name=c.name;
        this.weight=c.weight;
        this.height=c.height;
        this.birthday=new P9_4(c.birthday);
    }
/**
 *
 * @return
 */
    String getName(){
        return this.name;
    }
    int getHeight(){
        return this.height;
    }
    int getWeight(){
        return this.weight;
    }
    P9_4 getBirthday(){
        return new P9_4(this.birthday);
    }
    /**
     * String
     */
    @Override
    public String toString(){
        return name+" "+height+"cm "+weight+"kg "+birthday;
    }

}


public class P9_6 {
    public static void main(String[] args) {

    	P9_6s h1=new P9_6s("aa",156,50,new P9_4(1997,4,25));

       System.out.println(h1);
    }
}