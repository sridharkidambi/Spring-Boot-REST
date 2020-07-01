package dates;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class comparingDatesPeriodExample {

    public static void main(String[] args) {
        //Period for date comparision
        //Period for date comparision
        LocalDate dt =LocalDate.of(2018,1,1);
        LocalDate dt1 =LocalDate.of(2019,12,31);

      Period pd=  dt.until(dt1);

        System.out.println(pd);
        System.out.println(pd.getDays());
        System.out.println(pd.getMonths());
        System.out.println(pd.toTotalMonths());
        System.out.println(pd.toTotalMonths());

        Period pd3=Period.ofYears(10);
        System.out.println(pd3.getYears());
        System.out.println(pd3.toTotalMonths());

        Period pd4= Period.between(dt,dt1);
        System.out.println(pd4.toTotalMonths());
        System.out.println(pd4.toTotalMonths());

//        duration for time comparision

        LocalTime lt= LocalTime.of(7,20);
        LocalTime lt1= LocalTime.of(17,20);

      long lt3=   lt.until(lt1, ChronoUnit.MINUTES);
        System.out.println(lt3);

       Duration dtion= Duration.between(lt1,lt);
        System.out.println(dtion.toMinutes());

        Instant ins= Instant.now();
        System.out.println(ins);
        System.out.println(ins.getEpochSecond());
        System.out.println(ins.getNano());
        System.out.println(Instant.ofEpochSecond(0));

        Instant ins1=Instant.now();
        Duration dtInst= Duration.between(ins,ins1);
        System.out.println(dtInst.getNano());
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        System.out.println(zdt.getOffset());
        System.out.println(zdt.getZone());

        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId.getAvailableZoneIds().stream().forEach(zid-> System.out.println(zid.toUpperCase()) );

        System.out.println(ZoneId.getAvailableZoneIds().size());
        System.out.println("CST time zone"+ ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("MST time zone"+ ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("PST time zone"+ ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));

        System.out.println(ZonedDateTime.now(Clock.systemDefaultZone().system(ZoneId.of("America/Chicago"))));
        System.out.println( LocalDateTime.now(ZoneId.of("America/Chicago")));

        System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Chicago")));

//        Localdatetime ,instant to ZOnedLocalDate and time.

        LocalDateTime ldt3=LocalDateTime.now();
        System.out.println(ldt3);
        System.out.println(ldt3.atZone(ZoneId.systemDefault()));

        OffsetDateTime ofDt=ldt3.atOffset(ZoneOffset.ofHours(-6));
        System.out.println(ofDt);



        Date dt7 =new Date();
        System.out.println(dt7  );
        System.out.println(dt7.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

        System.out.println(new Date().from(dt.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant()));

        java.sql.Date sqlDt=java.sql.Date.valueOf(dt);

        System.out.println(sqlDt);
        System.out.println(sqlDt.toLocalDate());

//        Datetimeformatter



    }
}
