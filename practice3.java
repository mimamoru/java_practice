
import java.util.ArrayList;
import java.util.Scanner;
public class practice3 {
	public static void main(String[] args) {

		Scanner stdIn=new Scanner(System.in);
		int yosan=stdIn.nextInt();
		int nendai=stdIn.nextInt();
		String name=stdIn.next();
		String[] sake=new String[12];
		int[] year=new int[12];
		int[] price=new int[12];

		for(int i=0; i<12; i++) {
			 sake[i]=stdIn.next();
			year[i]=stdIn.nextInt();
			price[i]=stdIn.nextInt();
			}

		int ind=12;
		for(int i=0; i<12; i++) {
			if(sake[i].equals(name)) {
				ind=i;
			}
		}
		int money=yosan-price[ind];
		var list=new ArrayList<String>();
		if(money>=0) {
			list.add(name);
		}else {
			System.out.println("1本も買えなかったよ～");
		}
		while(money>0) {
			ind=12;
			for(int i=0; i<12; i++) {
				if(!(list.contains(sake[i]))&&(year[i]==nendai||nendai==0)&&(ind==12||price[ind]>price[i])) {
					ind=i;
				}
			}
			if(ind==12) {
				break;
			}
			if(money-price[ind]>=0) {
				list.add(sake[ind]);
			}
			money-=price[ind];
		}

		for(String s:list) {
			System.out.println(s);
		}
		System.out.println(list.size()+"本");
		stdIn.close();
	}
}

