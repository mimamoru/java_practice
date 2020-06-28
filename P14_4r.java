public class P14_4r extends P14_4s{
   
    P14_4r(String name,String mastername){
        super(name, mastername);
    }
    public void work(int k){
        switch(k){
        case 0:System.out.println("clean");break;
        case 1:System.out.println("wash");break;
        default:System.out.println("dish");break;
        }
    }
    public void introduce(){
        System.out.println("I'm robot. my name is "+getName());
        System.out.println("my master's name is "+getMastername());
    }
}
class P14_4r2 extends P14_4r implements P14_2{
    private int color;
    P14_4r2(String name,String mastername,int color){
        super(name, mastername);
        this.color=color;
    }
    P14_4r2(String name,String mastername){
        this(name, mastername,BLACK);
    }
	public void changeSkin(int skin) {
		this.color=skin;
    }
    public int getColor(){
        return color;
    }
    public void introduce(){
        super.introduce();
        System.out.println("my color number is "+color);
    }

    public static void main(String[] args) {
        P14_4r2 s1=new P14_4r2("robo","a",GREEN);
        P14_4r2 s2=new P14_4r2("robo2","b");
        s1.changeSkin(LEOPARD);
        s1.introduce();
        s2.work(0);

        P14_4s[] carr=new P14_4s[3];
        carr[0]=new P14_4s("cat","c");
        carr[1]=new P14_4r("robocat","d");
        carr[2]=new P14_4r2("robo2cat","e");
        for(P14_4s c:carr){
            c.introduce();
            if(c instanceof P14_4r){
                ((P14_4r)c).work(1);
            }
            
        }System.out.println(carr[2] instanceof P14_2);
    }
}