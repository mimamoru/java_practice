import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("入力=>");
		String str=stdIn.next();
		String[] s=str.split(",");
		int[] in=new int[s.length];

		for(int i=0; i<s.length; i++) {
			in[i]=Integer.parseInt(s[i]);
		}

		var map=new HashMap<Integer, Integer>();

		for(int i:in) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+i);
			}else {
				map.put(i, i);
			}
		}
		Object[] ob=map.keySet().toArray();
		Arrays.sort(ob);
		for (Integer k : map.keySet())
		{
			System.out.println(k+"人世帯の人数=>"+map.get(k)+"人");
		}stdIn.close();
	}
}
