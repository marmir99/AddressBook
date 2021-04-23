import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class Persons {
    private List<Person> persons = new ArrayList<Person>();
    public void addPerson()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        Person p = new Person();
        String name, surname, telephoneNumber, street, postCode, postOffice, houseNumber, flatNumber;

        System.out.println("Podaj imie: ");
        name = scanner.next();
        p.setName(name);

        System.out.println("Podaj nazwisko: ");
        surname = scanner.next();
        p.setSurname(surname);

        System.out.println("Podaj numer telefonu: ");
        telephoneNumber = scanner.next();
        p.setTelephoneNumber(telephoneNumber);

        System.out.println("Podaj ulice: ");
        street = scanner.next();
        p.setAddressStreet(street);

        System.out.println("Podaj numer domu: ");
        houseNumber = scanner.next();
        p.setAddressHouseNumber(houseNumber);

        System.out.println("Podaj numer mieszkania, jesli mieszkasz w domu podaj 0: ");
        flatNumber = scanner.next();
        p.setAddressFlatNumber(flatNumber);

        System.out.println("Podaj kod pocztowy: ");
        postCode = scanner.next();
        p.setAddressPostCode(postCode);

        System.out.println("Podaj urzad pocztowy: ");
        postOffice = scanner.next();
        p.setAddressPostOffice(postOffice);

        persons.add(p);
    }
    public void removePerson()
    {
        Person personToKill;
        personToKill = searchAndChoose();
        if(personToKill == null)
        {
            System.out.println("Nie mamy takiej osoby :(");
        }
        else
        {
            persons.remove(personToKill);
        }

    }
    public void modificatePerson()
    {
        Person personToModify;
        String decision;
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        personToModify = searchAndChoose();
        if (personToModify == null)
        {
            System.out.println("Nie mamy takiej osoby :(");
        }
        else
        {
            System.out.println("Jesli chcesz cos zmienic podaj nowe, w przeciwnym przypadku podaj enter");
            System.out.println("Imie: " + personToModify.getName());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setName(decision);
            }
            System.out.println("Nazwisko: " + personToModify.getSurname());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setSurname(decision);
            }
            System.out.println("Numer telefonu: " + personToModify.getTelephoneNumber());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setTelephoneNumber(decision);
            }
            System.out.println("Ulica: " + personToModify.getAddresStreet());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setAddressStreet(decision);
            }
            System.out.println("Numer domu: " + personToModify.getAddressHouseNumber());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setAddressHouseNumber(decision);
            }
            System.out.println("Numer mieszkania: " + personToModify.getAddressFlatNumber());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setAddressFlatNumber(decision);
            }
            System.out.println("Kod pocztowy: " + personToModify.getAddressPostCode());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setAddressPostCode(decision);
            }
            System.out.println("Urzad pocztowy: " + personToModify.getAddressPostOffice());
            decision = scanner.next();
            if (decision.equalsIgnoreCase("") == false)
            {
                personToModify.setAddressPostOffice(decision);
            }
        }
    }
    public void view()
    {
        int i = 1;
        for (Person num : persons)
        {
            System.out.println("Osoba numer " + i);
            System.out.println("Identyfikator: " + num);
            num.viewPerson();
            System.out.println("----------------------------");
            i++;
        }
    }
    public void searchBySurname()
    {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Podaj imie poszukiwanej osoby: ");
        String name = scanner.next();
        System.out.println("Podaj nazwisko poszukiwanej osoby: ");
        String surname = scanner.next();
        System.out.println(".-----------------------");
        System.out.println("Lista osob o tym imieniu i nazwisku: ");
        System.out.println("------------------------");
        for (Person num : persons)
        {
            if (num.checkName(name) == 1)
            {
                if (num.checkSurname(surname) == 1)
                    num.viewPerson();
                System.out.println(".----------------------");
            }
        }
    }
    public Person searchAndChoose()
    {
        String answer;
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Podaj imie osoby: ");
        String name = scanner.next();
        System.out.println("Podaj nazwisko osoby: ");
        String surname = scanner.next();
        System.out.println("Lista osob o tym imieniu i nazwisku: ");
        for (Person num : persons)
        {
            if (num.checkName(name) == 1)
            {
                if (num.checkSurname(surname) == 1) {
                    num.viewPerson();
                    System.out.println("-----------------------");
                    System.out.println("Czy o te osobe ci chodzilo? T - tak/N - nie");
                    System.out.println("-----------------------");
                    answer = scanner.next();
                    if(answer.equalsIgnoreCase("T"))
                    {
                        return num;
                    }
                }
            }
        }
        return null;
    }
    public void readFile() throws FileNotFoundException
    {
        File file = new File("AdressBook.txt");
        persons.clear();
            Scanner in = new Scanner(file);
            String line;
            while (in.hasNextLine()) {
                Person p = new Person();
                line = in.nextLine();
                p.setName(line);
                line = in.nextLine();
                p.setSurname(line);
                line = in.nextLine();
                p.setTelephoneNumber(line);
                line = in.nextLine();
                p.setAddressStreet(line);
                line = in.nextLine();
                p.setAddressHouseNumber(line);
                line = in.nextLine();
                p.setAddressFlatNumber(line);
                line = in.nextLine();
                p.setAddressPostCode(line);
                line = in.nextLine();
                p.setAddressPostOffice(line);
                persons.add(p);
            }
    }
    public void writeFile() throws FileNotFoundException
    {
        PrintWriter file = new PrintWriter("AdressBook.txt");
        for (Person num : persons)
        {
            file.println(num.getName());
            file.println(num.getSurname());
            file.println(num.getTelephoneNumber());
            file.println(num.getAddresStreet());
            file.println(num.getAddressHouseNumber());
            file.println(num.getAddressFlatNumber());
            file.println(num.getAddressPostCode());
            file.println(num.getAddressPostOffice());
        }
        file.close();
    }
}
