package models;

public class Permanent_Employee extends Apprentice {

    public double overtimeRate;
    public double numberOfHours;

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        if(overtimeRate >= 0.0){
            this.overtimeRate = overtimeRate;
        }

    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        if(numberOfHours >= 0.0) {
            this.numberOfHours = numberOfHours;
        }
    }

    public Permanent_Employee(){
        this ("", "", "", "", "", "", "",0.0,
                0.0, 0.0);
    }

    public Permanent_Employee(String firstname, String lastname, String postalcode,
                              String city, String street, String streetNumber, String socialSecurityNumber, double baseSalary,
                              double overtimeRate, double numberOfHours){
        super(firstname, lastname, postalcode, city, street, streetNumber, socialSecurityNumber, baseSalary);
        this.setOvertimeRate(overtimeRate);
        this.setNumberOfHours(numberOfHours);
    }

    @Override
    public String toString() {
        return super.toString() + "Überstunden: " + this.getOvertimeRate() + " Stunden: " + this.getNumberOfHours();
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() * this.getNumberOfHours() + this.getOvertimeRate();
    }
}
