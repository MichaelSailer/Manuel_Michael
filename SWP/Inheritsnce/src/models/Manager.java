package models;

public class Manager extends Permanent_Employee {

    public double commission;

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        if(commission >= 0.0) {
            this.commission = commission;
        }
    }

    public Manager(){
        this("","","","","",0.0,"","",
                0.0, 0.0, 0.0);
    }

    public Manager(String firstname, String lastname, String postalcode, String city, String street, double baseSalary,
                   String streetNumber, String socialSecurityNumber, double commission, double overtimeRate, double numberOfHours){
        super(firstname, lastname, postalcode, city, street, streetNumber, socialSecurityNumber, baseSalary, overtimeRate, numberOfHours);
        this.setCommission(commission);

    }

    @Override
    public String toString(){
        return super.toString() + " Provision: " + this.getCommission();
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + this.getCommission();
    }
}
