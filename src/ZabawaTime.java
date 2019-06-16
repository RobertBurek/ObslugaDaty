import java.time.LocalTime;

public class ZabawaTime {
    public static void zabawaTime() {

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(14, 06, 52);
        LocalTime perseTime = LocalTime.parse("15:25:14");
        System.out.println("now(): " + nowTime);
        System.out.println("of(...): " + ofTime);
        System.out.println("parse(...)" + perseTime);

        System.out.println(nowTime.hashCode());
        nowTime = nowTime.plusMinutes(85);
        System.out.println(" po modyfikacji: " + nowTime);
        System.out.println(nowTime.hashCode());

        LocalTime time1 = nowTime.plusMinutes(36);
        LocalTime time2 = nowTime.minusMinutes(4215);
        LocalTime time3 = nowTime.plusHours(13);
        LocalTime time4 = nowTime.minusHours(23);
        System.out.println("Time1 :" + time1);
        System.out.println("Time2 :" + time2);
        System.out.println("Time3 :" + time3);
        System.out.println("Time4 :" + time4);
        System.out.println("Liczba sekund jaka minęłs od godziny 00:00:00 " +
                "do godziny " + time1 + " wynosi: " + time1.toSecondOfDay());
    }
}
