package composition_example;

public class Address {
    private String city = "city";
    private String country = "country";

    public Address() {
    }

    public Address(String city, String country) {
        this();
        this.city = city;
        this.country = country;
    }

    public String getAddressInfo() {
        return getCity() + ", " + getCountry();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
