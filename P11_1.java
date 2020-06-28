import java.util.Calendar;
import java.util.Random;

public class P11_1 {


	 public static void main(String[] args) {
		 final Calendar cl = Calendar.getInstance();
			int dy = cl.get(Calendar.YEAR);
			int dm =  cl.get(Calendar.MONTH)+1;
			int ds = cl.get(Calendar.DATE);
			System.out.printf("%04d/%02d/%02d",dy,dm,ds);

		 Random rand =new Random();
		 int k=rand.nextInt(10);
		 switch(k) {
		 case 0:System.out.println("daikichi"); break;
		 case 1:case 2:case 3:System.out.println("kichi"); break;
		 case 4:case 5:case 6:System.out.println("chixyukichi"); break;
		 case 7:case 8:System.out.println("sixyokichi"); break;
		 case 9:System.out.println("kixyou"); break;
		 }

	 }
}
