public class E089{   
    void method1() {
        System.out.println("super");
    }
    void method2() {
      method1();
    }
}
class E089s extends E089{
    @Override
	void method1() {
        System.out.println("sub");
    }
    // @Override
    // void method2() {
    //    super.method2();
    // }
}

class A{
public static void main(String[] args) {

	E089s a1=new E089s();
	
      a1.method1();
      a1.method2();

      
}
}