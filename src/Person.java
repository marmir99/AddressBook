public class Person {
    private String name;
    private String surname;
    private String telephoneNumber;
    private Address address = new Address();

    public Person()
    {
        name = "";
        surname = "";
        telephoneNumber = "";
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setSurname(String s)
    {
        surname = s;
    }
    public String getTelephoneNumber() { return telephoneNumber; }
    public void setTelephoneNumber(String tN)
    {
        telephoneNumber = tN;
    }
    public void setAddressStreet(String s) { address.setStreet(s); }
    public String getAddresStreet() { return address.getStreet(); }
    public void setAddressHouseNumber(String hN)
    {
        address.setHouseNumber(hN);
    }
    public String getAddressHouseNumber() { return address.getHouseNumber(); }
    public void setAddressFlatNumber(String fN)
    {
        address.setFlatNumber(fN);
    }
    public String getAddressFlatNumber() { return address.getFlatNumber(); }
    public void setAddressPostCode(String postCode) { address.setPostCode(postCode); }
    public String getAddressPostCode() { return address.getPostCode(); }
    public void setAddressPostOffice(String postOffice)
    {
        address.setPostOffice(postOffice);
    }
    public String getAddressPostOffice() { return address.getPostOffice(); }
    public void viewPerson()
    {
        System.out.println("imie: " + name);
        System.out.println("nazwisko: " + surname);
        System.out.println("telefon: " + telephoneNumber);
        System.out.println("ulica: " + address.getStreet());
        System.out.println("numer domu: " + address.getHouseNumber());
        System.out.println("numer mieszkania: " + address.getFlatNumber());
        System.out.println("kod pocztowy: " + address.getPostCode());
        System.out.println("poczta: " + address.getPostOffice());
    }
    public int checkName(String string)
    {
        if (name.equalsIgnoreCase(string)) return 1;
        else return 0;
    }
    public int checkSurname(String string)
    {
        if (surname.equalsIgnoreCase(string)) return 1;
        else return 0;
    }
}
