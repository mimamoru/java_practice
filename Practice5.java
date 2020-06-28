import java.util.Arrays;
import java.util.Set;
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
		//Comparator の実装は？ Comparatorの返り値で
		/*Comparableはそのオブジェクト自身が本来持つデフォルトの比較ルールを実装するのに対し、
Comparatorは外から特定クラスのオブジェクト同士の比較ルールの適用を可能とする。
さらに、ComparatorはComparator.comparingメソッドを使えば、ラムダ式を使って簡潔に書けるので便利。
class Employee implements Comparable<Employee> {    
       @Override
       public int compareTo(Employee emp) {
              return this.id - emp.id;
       }
}
class EmployeeNameComparator implements Comparator<Employee> {
       @Override
       public int compare(Employee emp1, Employee emp2) {
              return emp1.getName().compareTo(emp2.getName());
       }
}
*/
		map.entrySet().stream().sorted((e1,e2)->e1.getKey()-e2.getKey()).forEachOrdered(e->System.out.println(e.getKey()+"人世帯の人数=>"+e.getValue()+"人"));
		map.entrySet().stream().sorted((e1,e2)->e1.getKey().compareTo(e2.getKey())).forEachOrdered(e->System.out.println(e.getKey()+"人世帯の人数=>"+e.getValue()+"人"));
		
		// Integer[] i2=map.keySet().toArray(new Integer[map.size()]);
		// Arrays.sort(i2);
		
		
		// for (Integer k : i2)
		// {
		// 	System.out.println(k+"人世帯の人数=>"+map.get(k)+"人");
		// }
		stdIn.close();
	}
}
