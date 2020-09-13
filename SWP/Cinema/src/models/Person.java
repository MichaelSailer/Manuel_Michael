package models;

public class Person {

    private String _vorname = "";
    private String _nachname = "";
    private int _alter = 0;
    private boolean _ticket = false;
    private boolean _kinoBesuchen = true;


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

    public boolean getTicket(){
        return this._ticket;
    }
    //Set Ticket  = setzt den aktuellen Status beim KAuf von ticket = false auf ticket = true;

    public void setTicket(boolean ticket){
        this._ticket = ticket;
    }

    public boolean getKinoBesuch(){
        return  this._kinoBesuchen;
    }
    public void setKinoBesuch(boolean besuchen){this._kinoBesuchen = besuchen;}

    Person(){this("", "", 0, false,false);}
    Person(String vorname, String nachname, int alter, boolean ticket,boolean besuchen){
        this.setVorname(vorname);
        this.setNachname(nachname);
        this.setAlter(alter);
        this.setTicket(ticket);
        this.setKinoBesuch(besuchen);
    }

    @Override
    public String toString(){
        return "Vorname:" + this.getVorname() + "Nachname:" + this.getNachname() + "Alter:" + this.getAlter() + "Ticket:" + this.getTicket();
    }




}
