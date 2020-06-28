public class A068 {
    private int a;
    static{
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
    A068(){
        a=1;
        System.out.println("constructor");
    }
    // A068(int a){
    //     System.out.println("constructor2");
    // }
}

class A068_sub extends A068{
    static{
        System.out.println("sub_static");
    }
    {
        System.out.println("sub_instance");
    }
    // A068_sub(){
    //     System.out.println("sub_constructor");
    // }
    A068_sub(int a){
       
        System.out.println("sub_constructor2");
    }
public static void main(String[] args) {
    //A068_sub a=new A068_sub();
    A068_sub b=new A068_sub(1);
}

}