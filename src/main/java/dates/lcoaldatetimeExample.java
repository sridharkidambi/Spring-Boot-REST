package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class lcoaldatetimeExample {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));

        System.out.println(LocalTime.now().atDate(LocalDate.now()));
    }
}
