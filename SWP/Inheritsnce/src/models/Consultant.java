package models;

public class Consultant extends Person {

    private double _hourlyRate;
    private double _numberOfHours;

    public double getHourlyRate() {
        return _hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate >= 0.0){
            this._hourlyRate = hourlyRate;
        }

    }

    public double getNumberOfHours() {
        return _numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        if(numberOfHours >= 0.0){
            this._numberOfHours = numberOfHours;
        }

    }

    public Consultant(){
        this("", "", "", "", "", "", "", 0.0, 0.0);
    }

    public Consultant(String firstname, String lastname, String postalcode,
                      String city, String street, String streetNumber, String socialSecurityNumber,
                      double hourlyRate, double numberOfHours){
        // für die Felder der Basisklasse wird super verwendet
        super(firstname, lastname, postalcode, city, street, streetNumber, socialSecurityNumber);
        // die restlichen Felder müssen wie üblich belegt werden
        this.setHourlyRate(hourlyRate);
        this.setNumberOfHours(numberOfHours);
    }
    @Override
    public String toString(){
        // mit super.toString() können wir die toString() -Methode der Basisklasse aufrufen
        // es müssen nur mehr die zusätzlichen Felder ausgegeben werden
        return super.toString() + " Stundenlohn:" + this.getHourlyRate() + "Stundenanzahl:" + this.getNumberOfHours();
    }

    @Override
    public double calculateSalary(){
        return this.getNumberOfHours() * this.getHourlyRate();
    }

}
