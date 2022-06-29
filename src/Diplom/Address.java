package Diplom;

public class Address {
    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getFlat() {
        return flat;
    }

    String city;
    String street;
    int house;
    int flat;

    public Address(String city, String street, int house, int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }
}
