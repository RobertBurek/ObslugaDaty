import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> family = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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


        do {
            if (!family.isEmpty()) {
                System.out.println("-------------OSOBY NA LISCIE-------------");
                for (Person member : family) {
                    System.out.println("   " + member);
                }
                System.out.println("-----------------------------------------");
            } else {
                System.out.println("-----------------------------------------");
                System.out.println("                 Brak osób");
                System.out.println("-----------------------------------------");
            }

            System.out.println("Wybierz aby:");
            System.out.println("1 - Dodaj osobę");
            System.out.println("2 - Usuń osobę");
            System.out.println("3 - Zmień datę urodzin osoby");
            System.out.println("q - Wyjdź");
            System.out.println("-----------------------------------------");
            System.out.println("Czekam na Twój wybór: ");


            String option = scanner.next();

            if (option.equals("1")) {
                System.out.println("Podaj imię:");
                String imie = scanner.next();
                System.out.println("Podaj datę urodzin:");
                System.out.println("(YYYY-MM-DD)");
                String data = scanner.next();
                LocalDate parseDate = LocalDate.parse(data);
                Person person = new Person(imie, parseDate);
                family.add(person);

            } else if (option.equals("2")) {

                if (family.isEmpty()) {

                    System.out.println("-----------------------------------------");
                    System.out.println("         Brak osób do usunięcia!");
                    System.out.println("-----------------------------------------");

                } else {

                    System.out.println("Podaj imię osoby do usunięcia z listy:");
                    String imie = scanner.next();
                    Person doUsuniecia = null;
                    for (Person member : family) {
                        if (imie.equals(member.getName())) {
                            doUsuniecia = member;
                        }
                    }
                    family.remove(doUsuniecia);
                }

            } else if (option.equals("3")) {

                if (family.isEmpty()) {

                    System.out.println("-----------------------------------------");
                    System.out.println("       Brak osób do modyfikacji!");
                    System.out.println("-----------------------------------------");

                } else {

                    System.out.println("Podaj imię osoby do modyfikacji daty urodzin");
                    String imie = scanner.next();
                    System.out.println("Podaj nową datę urodzin");
                    System.out.println("(YYYY-MM-DD)");
                    String data = scanner.next();
                    LocalDate parseDate = LocalDate.parse(data);
                    Person doModyfikacji = null;
                    for (Person member : family) {
                        if (imie.equals(member.getName())) {
                            doModyfikacji = member;
                        }
                    }
                    doModyfikacji.setBirthday(parseDate);
                }

            } else if (option.equals("q")) {
                System.exit(0);
            }

        } while (true);
    }
}
