import java.util.Scanner;

class RangeError extends RuntimeException{
	RangeError(int n){super("範囲外"+n);}
}
class PRangeError extends RangeError{
	PRangeError(int n){super(n);}
}
class RRangeError extends RangeError{
	RRangeError(int n){super(n);}
}

public class P16_5 {

	static boolean isValid(int a){
		return (a>=0&&a<10)?true:false;
}
	static int calc(int a,int b) throws PRangeError,RRangeError{
		if(!isValid(a)) throw new PRangeError(a);
		if(!isValid(b)) throw new PRangeError(b);
		int sum=a+b;
		if(!isValid(sum)) throw new RRangeError(sum);
			return sum;
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("a=>");
		int a=stdIn.nextInt();
		System.out.print("b=>");
		int b=stdIn.nextInt();
		try {
		System.out.println(calc(a,b));
		}catch(PRangeError e){
			System.out.println(e.getMessage()+"param");
		}catch(RRangeError e){
			System.out.println(e.getMessage()+"return");
		}
		stdIn.close();
	}
}
