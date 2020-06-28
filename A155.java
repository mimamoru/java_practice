import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;



public class A155 {
    public static void main(String[] args) {
        int[] a=new int[6];
        a=new int[3];
        LocalDateTime dt=LocalDateTime.of(2020, 11, 15, 12, 32, 34);
        LocalDateTime dt2=dt.withHour(15).withYear(1999);
        // System.out.println(dt.getDayOfYear());
        // System.out.println(dt.getYear());
        // System.out.println(dt2.getHour());
        // System.out.println(dt2.getYear());
        System.out.println(dt2);
        dt2=dt2.plusDays(3).plusMonths(3);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("uuuu/MM/dd (E) a KK:mm");
        System.out.println(dt2.format(df));
        System.out.println(dt2);
        dt.getMonthValue();
        dt=dt.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(dt.format(df));
        System.out.println(dt.with(TemporalAdjusters.next(dt.getDayOfWeek())).format(df));
        System.out.println(dt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)).format(df));
        System.out.println(dt.getDayOfWeek());
        LocalDate day1=LocalDate.of(2014,5,4);
        LocalDate day2=LocalDate.of(2012,4,4);
        Period p1=Period.between(day1,day2);
        Period p2=Period.between(dt.toLocalDate(),dt2.toLocalDate());
        System.out.println(p1);
    }
}