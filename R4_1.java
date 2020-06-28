
public class R4_1 {

	public static void main(String[] args) {
	int n=45;
	int w=6;
	for(int i=1; i<=n; i++) {
		if(i!=1&&i%w==1) {
			System.out.println();
			if(i%(w*3)==1) {
				System.out.println();
			}
		}
		System.out.print("+");
	}
	System.out.println();
	System.out.println("--------------------------------------");
	int h=13;
	int l=12;
	for(int i=1; i<=h; i++) {
		for(int j=1; j<=l; j++) {
			System.out.print((j+i-1)%10);
		}System.out.println();
	}




	}

}
