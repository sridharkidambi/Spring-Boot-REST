package dates;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingExample2 {

    public  static void ParseLocalDateTime() {
        String _dateTime="2018-10-10T14:33:33";
        System.out.println(LocalDateTime.parse(_dateTime));
        System.out.println(LocalDateTime.parse(_dateTime,DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        _dateTime="2018-04-28T14|33|33";

        DateTimeFormatter dt2=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        System.out.println(LocalDateTime.parse(_dateTime,dt2));

    }

    public  static void FormatLocalDateTime() {

    }

    public  static void ParseTime(){

        String timeTemp = "11:00";
        System.out.println(LocalTime.parse(timeTemp));// LocalTime.parse(time);
        System.out.println(LocalTime.parse(timeTemp, DateTimeFormatter.ISO_LOCAL_TIME));// LocalTime.parse(time);

        String time1="21*00";
        DateTimeFormatter dt2=DateTimeFormatter.ofPattern("HH*mm");
        System.out.println(LocalTime.parse(time1,dt2));

    }

    public  static void FormatTime(){
        DateTimeFormatter dt2=DateTimeFormatter.ofPattern("HH*mm");
        LocalTime localTime= LocalTime.now();
        System.out.println(localTime.format(dt2));


    }

    public static void main(String[] args) {
        ParseTime();FormatTime();
        ParseLocalDateTime();FormatLocalDateTime();
    }
}
