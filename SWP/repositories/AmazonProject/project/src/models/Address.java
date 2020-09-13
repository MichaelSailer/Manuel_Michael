package models;

public class Address {
    private String _postalCode;
    private String _street;
    private String _streetNr;

    public String getPostalCode() {
        return this._postalCode;
    }

    public void setPostalCode(String postalCode) {
        this._postalCode = postalCode;
    }

    public String getStreet() {
        return this._street;
    }

    public void setStreet(String street) {
        this._street = street;
    }

    public String getStreetNr() {
        return this._streetNr;
    }

    public void setStreetNr(String streetNr) {
        this._streetNr = streetNr;
    }
    public Address(){this("", "","");}
    public Address(String postalCode, String street, String streetNr){
        this.setPostalCode(postalCode);
        this.setStreet(street);
        this.setStreetNr(streetNr);
    }

    @Override

    public String toString(){
        return "Straße: " + this.getStreet() + " " + "Zusatznummer: " + this.getStreetNr() + " " + "Postleitzahl: " + this.getPostalCode();
    }
}
