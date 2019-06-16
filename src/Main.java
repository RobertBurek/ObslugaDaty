import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Person> family = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//        ZabawaDate.zabawaDate();
//        ZabawaTime.zabawaTime();
        StrefaCzasowa.strefaCzasowa();



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
            System.out.print("Czekam na Twój wybór: ");


            String option = scanner.next();

            if (option.equals("1")) {
                System.out.print("Podaj imię: ");
                String imie = scanner.next();
                System.out.print("Podaj datę urodzin (YYYY-MM-DD): ");
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

                    System.out.print("Podaj imię osoby do usunięcia z listy: ");
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

                    System.out.print("Podaj imię osoby do modyfikacji daty urodzin: ");
                    String imie = scanner.next();
                    System.out.print("Podaj nową datę urodzin (YYYY-MM-DD): ");
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
