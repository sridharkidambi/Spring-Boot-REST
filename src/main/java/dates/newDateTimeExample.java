package dates;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.*;

public class newDateTimeExample {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate ld= LocalDate.now();
        System.out.println(LocalDate.of(2020,06,29));
        System.out.println(LocalDate.ofYearDay(2020,06));
        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.get(ChronoField.DAY_OF_MONTH));


        /*
        * Modifying the current date
        * */

        System.out.println(ld.plusDays(2));
        System.out.println(ld.withYear(2019));
        System.out.println(ld.with(ChronoField.YEAR ,2022));

        System.out.println(ld.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(ld.minus(1, ChronoUnit.YEARS));
        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());


        System.out.println(ld.isSupported(ChronoUnit.MINUTES));
//        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());
//        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());
//        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());
//        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());
//        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());
//        System.out.println(LocalDate.ofYearDay(2020,1).isLeapYear());
    }
}
