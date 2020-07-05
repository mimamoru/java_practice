import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQuery;

public class DayMaster {
    LocalDate dd = LocalDate.now();
    //年月日時分秒を指定
LocalDateTime d1 = LocalDateTime.of(0, 12, 15, 23, 30, 59);
LocalDateTime d = LocalDateTime.now();

LocalDateTime d2 = d.plusMonths(1);
LocalDateTime d3 = d.minusMonths(1);
LocalDateTime d4 = d.plusWeeks(1);
LocalDateTime d5 = d.minusWeeks(1);
LocalDateTime d6 = d.with(TemporalAdjusters.lastDayOfMonth());
LocalDateTime d7 = d.with(TemporalAdjusters.firstDayOfMonth());
DayOfWeek week=d7.getDayOfWeek();
LocalDateTime localDateTime = LocalDateTime.parse("2014-10-01T23:59:59");
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d");
DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("H:mm");
LocalDate value = formatter.parse("2014/2/28", LocalDate::from);
LocalTime v2 = formatter2.parse("13:44", LocalTime::from);
public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/M/d");
LocalDate value3 = formatter.parse("2014/2/28", new TemporalQuery<LocalDate>() {
    @Override
    public LocalDate queryFrom(TemporalAccessor parsedObject) {
        System.out.println(parsedObject);
        return LocalDate.from(parsedObject);
    }
});
System.out.println(value3);
System.out.println(LocalDateTime.of(2000, 10, 15, 22, 30, 59));
System.out.println(LocalDate.of(2000, 10, 15).getDayOfWeek());
System.out.println(LocalDate.of(2000, 10, 15).getDayOfWeek().getValue()%7);
}
// System.out.println(d.getYear());
// System.out.println(d.getMonth());
// System.out.println(d.getDayOfMonth());
// System.out.println(d.getHour());
// System.out.println(d.getMinute());
}