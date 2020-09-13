package models;

public class Apprentice extends Person {

    public double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary >= 0.0){
            this.baseSalary = baseSalary;
        }

    }

    public Apprentice(){
        this ("", "", "", "", "", "", "", 0.0);
    }

    public Apprentice(String firstname, String lastname, String postalcode,
                      String city, String street, String streetNumber, String socialSecurityNumber,
                      double baseSalary){
        super(firstname, lastname, postalcode, city, street, streetNumber, socialSecurityNumber);
        this.setBaseSalary(baseSalary);

    }

    @Override
    public String toString(){
        return super.toString() + "Standartgehalt: " + this.getBaseSalary();
    }

    @Override
    public double calculateSalary(){
        return this.getBaseSalary();
    }
}
