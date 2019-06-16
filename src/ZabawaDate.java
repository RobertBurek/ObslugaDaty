import java.time.LocalDate;

public class ZabawaDate {

    public static void zabawaDate() {

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2019, 06, 16);
        LocalDate perseDate = LocalDate.parse("2019-02-13");
        System.out.println("now(): " + nowDate);
        System.out.println("of(...): " + ofDate);
        System.out.println("parse(...)" + perseDate);

        System.out.println(nowDate.hashCode());
        nowDate = nowDate.plusDays(16);
        System.out.println(" po modyfikacji: " + nowDate);
        System.out.println(nowDate.hashCode());

        LocalDate data1 = nowDate.plusDays(16);
        LocalDate data2 = nowDate.minusDays(15);
        LocalDate data3 = nowDate.minusMonths(13);
        LocalDate data4 = nowDate.plusMonths(13);
        System.out.println("Data1 :" + data1);
        System.out.println("Data2 :" + data2);
        System.out.println("Data3 :" + data3);
        System.out.println("Data4 :" + data4);

        System.out.println("Data1 wystepuje po Date2 :" + data1.isAfter(data2));
        System.out.println("Data1 wystepuje przed Data2: " + data1.isBefore(data2));

        System.out.println("Data1 który to dzień tygodnia: " + data1.getDayOfWeek());
        System.out.println("Data1 który to dzień miesiąca: " + data1.getDayOfMonth());
        System.out.println("Data1 który to dzień roku: " + data1.getDayOfYear());

        System.out.println(data1.getYear() + " to rok przestępny :" + data1.isLeapYear());
        System.out.println(data2.getYear() + " to rok przestępny :" + data2.isLeapYear());
        System.out.println(data3.getYear() + " to rok przestępny :" + data3.isLeapYear());
        System.out.println(data4.getYear() + " to rok przestępny :" + data4.isLeapYear());
    }
}
