
public class Sample11 {
	 public static void main(String[] args) {
		 int ans=2;
		 int count=1;
		 int j=2;
		 while(count<1) {
			 j++;
			 for(int i=2; i<j; i++) {
				 if(j%i==0) {
					 break;
				 }else if(j-1== i) {
					 count++;
					 ans=j;
				 }
			 }
		 }
		 System.out.print(ans);
	    }
}
