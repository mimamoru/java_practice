public abstract class A069 {
    private int x;
    static{
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    A069(){
        init(1);
        init2(4);
        System.out.println("constructor=>"+x);
        
    }
    void init(int a){
        x=a;
        System.out.println("init=>"+x);
    }
    abstract void init2(int a);
    
    A069(int a){
        init(a);
        System.out.println("constructor2=>"+x);
    }
}

class A069_sub extends A069{
   private int y;
    static{
        System.out.println("sub_static");
    }
    {
        System.out.println("sub_instance");
    }
    A069_sub(){
        y=5;
        System.out.println("sub_constructor");
    }
    A069_sub(int a){
        super(a);
        y=6;
        System.out.println("sub_constructor2");
    }
    void init(int a){
        System.out.print("before=>"+y);
        y=a;
        System.out.println("sub_init=>"+y);
    }
    void init2(int a){
        System.out.print("before=>"+y);
        y=a;
        System.out.println("sub_init=>"+y);
    }
public static void main(String[] args) {
    A069_sub a=new A069_sub();
    System.out.println("=================");
    A069_sub b=new A069_sub(3);
}

}