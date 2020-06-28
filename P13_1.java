
abstract class P13_1s {
	private String name;
	{System.out.println("animal!!!!!!!!!!!!!!!");
	}
	public P13_1s (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public abstract void bark();
	
	public void introduce() {
		System.out.print(toString()+"だ！！");
		bark();
	};

	public static void t() {
		System.out.println("booooooooooooo!!!!!!!!!!!!!!!");
	};
	@Override
	public String toString() {
		return name;
	}

}
class P13_1d extends P13_1s{
	private String type;
	public P13_1d (String name,String type) {
		super(name);
		this.type=type;
	}
	{System.out.println("dog");
	}
	public void bark() {
		System.out.println("wan");
	}
	@Override
	public String toString() {
		return type+"の"+super.toString();
	}
}
class P13_1c  extends P13_1s{
	private int age;
	public P13_1c (String name,int age) {
		super(name);
		this.age=age;
	}
public void bark() {
	System.out.println("nya");
	}

@Override
public String toString() {
	return age+"の"+super.toString();
}
}


public class P13_1 {
	public static void main(String[] args) {
		P13_1d dog1=new P13_1d("dog","pu");
		dog1.bark();
		P13_1c cat1=new P13_1c("cat",8);
		cat1.bark();
		P13_1s dog2=new P13_1d("dog","toy");
		dog2.bark();
		P13_1s animal=new P13_1s("animal") {
			public void bark() {
				System.out.println("aaaaaaaaaaaa");
				}
		};
		animal.bark();
		P13_1s.t();
		System.out.println(dog1);
		System.out.println(cat1);
		System.out.println(animal);
		System.out.println("=======================================");
		P13_1s[] ani=new P13_1s[4];
		ani[0]=dog1;
		ani[1]=cat1;
		ani[2]=dog2;
		ani[3]=animal;
		for(P13_1s i: ani) {
			i.introduce();
		}
	}


}