package models;

public class Customer {
    //fields

    private String _firstname;
    private String _lastname;

    //getter setter

    public String getFirstname(){return this._firstname;}
    public void setFirstname(String firstname){this._firstname = firstname;}
    public String getLastname(){return this._lastname;}
    public void setLastname(String lastname){this._lastname = lastname;}


    //ctors

    public Customer(){this("", "");}
    public Customer(String firstname, String lastname){
        this.setFirstname(firstname);
        this.setLastname(lastname);

    }

    //toString
    @Override
    public String  toString(){
        return "Vorname: " + this.getFirstname() + "Nachname: " + this.getLastname() ;
    }

}
