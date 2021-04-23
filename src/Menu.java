import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu extends MenuMenu {
    @Override
    public void view() {
        System.out.println("Podaj co chcesz zrobic:");
        System.out.println("[1] Dodaj nowy kontakt");
        System.out.println("[2] Usun kontakt");
        System.out.println("[3] Modyfikuj kontakt");
        System.out.println("[4] Wyswietl liste kontaktow");
        System.out.println("[5] Wyszukaj po nazwisku");
        System.out.println("[6] Wczytaj dane z pliku");
        System.out.println("[7] Zapisz dane do pliku");
        System.out.println("[8] Zakoncz");
    }

    @Override
    public void options() {
        Persons book = new Persons();
        boolean work = true;
        String choose;
        char x;
        int value;
        while (work) {
            view();
            do {
                System.out.println(".............................");
                System.out.println("Podaj co chcesz zrobic");
                System.out.println(".............................");
                Scanner scanner = new Scanner(System.in);
                choose = scanner.next();
                x = choose.charAt(0);
                value = Character.getNumericValue(x);
                if (choose.length() != 1 || value > 8) System.out.println("Podaj wartosc od 1 do 7");
            } while (choose.length() != 1 || value > 8);
            switch (value) {
                case 1:
                    book.addPerson();
                    break;
                case 2:
                    book.removePerson();
                    break;
                case 3:
                    book.modificatePerson();
                    break;
                case 4:
                    book.view();
                    break;
                case 5:
                    book.searchBySurname();
                    break;
                case 6:
                    try {
                        book.readFile();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        book.writeFile();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    work = false;
                    break;
            }
        }
    }
}
