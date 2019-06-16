import java.time.*;
import java.util.Iterator;
import java.util.Set;

public class StrefaCzasowa {

    public static void strefaCzasowa() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        Iterator<String> setIter = zones.iterator();

        while (setIter.hasNext()) {
            System.out.println(setIter.next());
        }


        ZoneId mojsStrefa = ZoneId.of("US/Pacific");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(mojsStrefa);
        System.out.println(zonedDateTime);

        Period period1 = Period.of(2,6,15);
        Period period2=Period.between(LocalDate.now(),LocalDate.parse("2019-10-22"));
        Period period3=Period.between(LocalDate.now(),LocalDate.parse("2018-10-22"));

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
    }
}
