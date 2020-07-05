import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DayManager {

    private  LocalDate date = LocalDate.now();
    private  int hour;
    private  int minute;

	
	DayManager(int year,int month){
		this(year,month,1);
	};
	
	DayManager(int year,int month,int date){
		this(year,month,date,0,0);
    }
    DayManager(int year,int month,int date,int hour,int minute){
		set(year,month,date,hour,minute);
	}
	
	public void set(int year,int month,int date,int hour,int minute) {   
        this.date=make(year,month,date);
        this.hour=hour%24;
        this.minute=minute%60;
    };
    
    public LocalDate make(int year,int month,int date) {
        int lastdate=LocalDate.of(year, month, 1).with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        return LocalDate.of(year<1?1:year, month%12==0?12:month%12, date<1?1:date>lastdate?lastdate:date);
    };
    
    public int dayOfWeek(int year, int month, int date) {
        return make(year,month,date).getDayOfWeek().getValue()%7;
    }
    	
	public boolean equalTo(int year,int month,int date) {
		return make(year,month,date).isEqual(this.date);
	}

	@Override
	public  String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return this.date.format(formatter)+String.format("(%s) %02d:%02d ",this.date.getDayOfWeek(),hour,minute);
    	}
    
}