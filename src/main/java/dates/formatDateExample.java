package dates;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class formatDateExample {

    public static  void parseLocalDate()
    {
        String datestr="2018-10-10";
        System.out.println(LocalDate.parse(datestr));
        System.out.println(LocalDate.parse(datestr,DateTimeFormatter.ISO_LOCAL_DATE));

        String datestr1="20180428";
//        System.out.println(LocalDate.parse(datestr1));
        System.out.println(LocalDate.parse(datestr1,DateTimeFormatter.BASIC_ISO_DATE));

//        custom date formatter
        String date2="2018|04|29";
        DateTimeFormatter dfmt=DateTimeFormatter.ofPattern("yyyy|MM|dd");
        System.out.println(LocalDate.parse(date2,dfmt));

        date2="2018|04|28";
        dfmt=DateTimeFormatter.ofPattern("yyyy|MM|dd");
        System.out.println(LocalDate.parse(date2,dfmt));


    }

    public static  void formatLocalDate()
    {
        System.out.println("format date: ");
        LocalDate ldt=LocalDate.now();
        DateTimeFormatter dfmt=DateTimeFormatter.ofPattern("yyyy|MM|dd");
        String formattedDate=ldt.format(dfmt);
        System.out.println(formattedDate);

    }
    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
