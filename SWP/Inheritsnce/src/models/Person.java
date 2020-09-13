package models;

public abstract class Person {

    //fields
    private String _firstname;
    private String _lastname;
    private String _postalcode;
    private String _city;
    private String _street;
    private String _streetNumber;
    private String _socialSecurityNumber;

    //get-/set-methoden

    public String getFirstname() {
        return _firstname;
    }

    public void setFirstname(String firstname) {
        this._firstname = firstname;
    }

    public String getLastname() {
        return _lastname;
    }

    public void setLastname(String lastname) {
        this._lastname = lastname;
    }

    public String getPostalcode() {
        return _postalcode;
    }

    public void setPostalcode(String postalcode) {
        this._postalcode = postalcode;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        this._city = city;
    }

    public String getStreet() {
        return _street;
    }

    public void setStreet(String street) {
        this._street = street;
    }

    public String getStreetNumber() {
        return _streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this._streetNumber = streetNumber;
    }

    public String getSocialSecurityNumber() {
        return _socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this._socialSecurityNumber = socialSecurityNumber;
    }



    //ctors
    public Person(){
        this("", "", "", "", "", "", "");
    }
    public Person(String firstanme, String lastname, String postalcode, String city, String street, String streetNumber, String socialSecurityNumber){
        this._firstname = firstanme;
        this._lastname = lastname;
        this._postalcode = postalcode;
        this._city = city;
        this._street = street;
        this._streetNumber = streetNumber;
        this._socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + _firstname + '\'' +
                ", lastname='" + _lastname + '\'' +
                ", postalcode='" + _postalcode + '\'' +
                ", city='" + _city + '\'' +
                ", street='" + _street + '\'' +
                ", streetNumber='" + _streetNumber + '\'' +
                ", socialSecurityNumber='" + _socialSecurityNumber + '\'' +
                '}';
    }

    // dadurch ist diese Methode in allen Unterklassen vorhanden
    public abstract double calculateSalary();
}
