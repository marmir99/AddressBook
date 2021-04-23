public class Address {
    private String street;
    private String houseNumber;
    private String flatNumber;
    private String postCode;
    private String postOffice;

    public Address()
    {
        street = "";
        houseNumber = "";
        flatNumber = "";
        postCode = "";
        postOffice = "";
    }
    public String getStreet()
    {
        return street;
    }
    public void setStreet(String s)
    {
        street = s;
    }
    public String getHouseNumber()
    {
        return houseNumber;
    }
    public void setHouseNumber(String hN)
    {
        houseNumber = hN;
    }
    public String getFlatNumber()
    {
        return flatNumber;
    }
    public void setFlatNumber(String fN)
    {
        flatNumber = fN;
    }
    public String getPostCode()
    {
        return postCode;
    }
    public void setPostCode(String pC)
    {
        postCode = pC;
    }
    public String getPostOffice()
    {
        return postOffice;
    }
    public void setPostOffice(String pO)
    {
        postOffice = pO;
    }
}
