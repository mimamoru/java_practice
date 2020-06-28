package id;
import java.util.Calendar;
import static java.util.Calendar.*;
public class P11_3 {
    private static final Calendar cl;
	private static final int dy;
	private static final int dm;
	private static final int ds ;
    private String id;
    private static int count;
    static {
        count=0;
		cl = Calendar.getInstance();
		dy = cl.get(YEAR);
		dm =  cl.get(MONTH)+1;
		ds = cl.get(DATE);
		System.out.printf("今日は%04d年%02d月%02d日です%n",dy,dm,ds);	
    }
   // {
      public P11_3(){
        count++;
              
        id=String.format("%04d%02d%02d%03d", dy,dm,ds,count);
    }
    @Override
    public String toString(){
        return "id=>"+id;
    }
}