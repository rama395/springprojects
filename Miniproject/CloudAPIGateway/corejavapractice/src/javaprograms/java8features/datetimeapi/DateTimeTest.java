package javaprograms.java8features.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeTest
{
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        int dd=date.getDayOfMonth();
        int mm=date.getMonthValue();
        int yy=date.getDayOfYear();
        System.out.println(dd+"...."+mm+"...."+yy);
        //System.out.println("\n%d-%d-%d",dd,mm,yy);
        int h=time.getHour();
        int m= time.getMinute();
        int s=time.getSecond();
        int n=time.getNano();
        System.out.println(h+"..."+m+"...."+s+"...."+n);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        LocalDateTime dt1=LocalDateTime.of(2026, Month.JUNE,22,11,9);
        System.out.println(dt1);
        System.out.println("After six months:"+dt.plusMonths(6));
        System.out.println("Before six months:"+dt.minusMonths(6));

    }
}
