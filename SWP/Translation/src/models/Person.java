package models;

public class Person {

    private String _vorname;
    private String _nachname;
    private int _alter;

    public String getVorname(){
        return this._vorname;
    }

    public void setVorname(String vorname){
        this._vorname = vorname;
    }

    public String getNachname(){
        return this._nachname;
    }

    public void setNachname(String nachname){
        this._nachname = nachname;
    }

    public int getAlter(){
        return this._alter;
    }

    public void setAlter(int alter){
        if(alter > 0){
            this._alter = alter;
        }
    }

    Person(){this("", "", 0);}
    Person(String vorname, String nachname, int alter){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
    }

    @Override
    public String toString(){
        return "Vorname: " + this.getVorname() + "Nachname: " + this.getNachname() + "Alter: " + this.getAlter();
    }

}
