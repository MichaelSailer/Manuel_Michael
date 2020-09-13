package models;



public class Contact {




    //fields
    private String _firstname;
    private String _lastname;
    private int _age;
    private Department _department;
    private Boolean _isMale;
    private double _salary;
    private char _favoriteCharacter;

    //get-/set-methods

    public String get_firstname() {
        return _firstname;
    }

    public void set_firstname(String firstname) {
        this._firstname = firstname;
    }

    public String get_lastname() {
        return _lastname;
    }

    public void set_lastname(String lastname) {
        this._lastname = lastname;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int age) {
        if (age >= 0) {
            this._age = age;
        }
    }

    public Department get_department() {
        return _department;
    }

    public void set_department(Department department) {
        this._department = department;
    }

    public Boolean get_isMale() {
        return _isMale;
    }

    public void set_isMale(Boolean isMale) {
        this._isMale = isMale;
    }

    public double get_salary() {
        return _salary;
    }

    public void set_salary(double salary) {
        if (salary >= 0) {
            this._salary = salary;
        }
    }

    public char get_favoriteCharacter() {
        return _favoriteCharacter;
    }

    public void set_favoriteCharacter(char favoriteCharacter) {
        this._favoriteCharacter = favoriteCharacter;
    }

    //ctors
    //über this wird ein anderer ctor aufgerufen
    public Contact(){this("", "", 0, Department.notSpecified, true, 0.0, '-');}
    public Contact(String firstname, String lastname, int age, Department department, Boolean isMale, double salary, char favoriteCharacter){
        this.set_firstname(firstname);
        this.set_lastname(lastname);
        this.set_age(age);
        this.set_department(department);
        this.set_isMale(isMale);
        this.set_salary(salary);
        this.set_favoriteCharacter(favoriteCharacter);
    }

    //toString() & other methods
    @Override
    public String toString(){
        return this.get_firstname() + " " + this.get_lastname() + "\n" +
                this.get_department() + " " + this.get_salary() + "Euro";
    }

    public String get_name(){
        return this.get_firstname() + " " + this.get_lastname();
    }
}
