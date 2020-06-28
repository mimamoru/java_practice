//import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class P10_7 {
	static int max2(int x,int y) {
		return x>y?x:y;
	}
	static int max3(int x,int y,int z) {
		return x>y?max2(x,z):max2(y,z);
	}
	static int max(int[] x) {
		return Arrays.stream(x).max().getAsInt();
	}
	static int[] maxindex(int[] x) {
		int max=max(x);
		int count=0;
		for(int i:x) {
			count=count+(i==max?1:0);
		}
		int[] ans=new int[count];
		int c=0;
		while(c<count) {
			for(int i=0;i<x.length; i++) {
			if(x[i]==max) {
				ans[c]=i;
				c++;
			}}
		}
		return ans;
	}
	static int min2(int x,int y) {
		return x>y?y:x;
	}
	static int min3(int x,int y,int z) {
		return x>y?min2(y,z):min2(x,z);
	}
	static int min(int[] x) {
		return Arrays.stream(x).min().getAsInt();
	}
	static int[] minindex(int[] x) {
		int min=min(x);
		int count=0;
		for(int i:x) {
			count=count+(i==min?1:0);
		}
		int[] ans=new int[count];
		int c=0;
		while(c<count) {
			for(int i=0;i<x.length; i++) {
			if(x[i]==min) {
				ans[c]=i;
				c++;
			}}
		}
		return ans;
	}
	 public static void main(String[] args) {
	//Random rnd=new Random();

	 Scanner stdIn=new Scanner(System.in);
	 System.out.print("x:");int x=stdIn.nextInt();
	 System.out.print("y:");int y=stdIn.nextInt();
	 System.out.print("z:");int z=stdIn.nextInt();
	 System.out.println(min2(x,y));
	 System.out.println(max2(x,y));
	 System.out.println(min3(x,y,z));
	 System.out.println(max3(x,y,z));
	 int[] a={2,1,3,2,1,3};
	 System.out.println(min(a));
	 System.out.println(max(a));
	 for(int aa:minindex(a)) {
		 System.out.print(aa);
	 }
	 System.out.println();
	 for(int aa:maxindex(a)) {
		 System.out.print(aa);
	 }
	
	 
	 stdIn.close();
	 }
}
