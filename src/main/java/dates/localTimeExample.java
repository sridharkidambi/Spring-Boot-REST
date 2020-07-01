package dates;

import org.apache.tomcat.jni.Local;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class localTimeExample {

    public static void main(String[] args) {

        LocalTime lt = LocalTime.now();
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.of(1,20));
        System.out.println(LocalTime.of(1,20,33));
        System.out.println(LocalTime.of(23,23,23));
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(lt.with(LocalTime.MIDNIGHT));
    }
}
