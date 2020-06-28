import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("入力=>");
		String str=stdIn.next();
		String[] s=str.split(",");
		int[] in=new int[s.length];
		for(int i=0; i<s.length; i++) {
			in[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(in);
		int sum=0;
		for(int i=0; i<in.length; i++) {
			sum+=in[i];
			if((i+1)<in.length&&in[i]!=in[i+1]) {
				System.out.println(in[i]+"人世帯の人数=>"+sum+"人");
				sum=0;
			}else if((i+1)>=in.length) {
				System.out.println(in[i]+"人世帯の人数=>"+sum+"人");
			}
		}		stdIn.close();
	}
}
