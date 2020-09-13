package models;


import Interfaces.BriefStatus1;
import Interfaces.Test_Interface;

import javax.print.DocFlavor;

public class Brief implements Test_Interface {

    public boolean UserLoggedIn() {
        return false;
    }

    enum BriefStatus{
        NICHT_BEGONNEN,
        IN_BEARBEITUNG,
        FERTIG
    }
    private String _namedesAbsenders;
    private String _überschrift;
    private BriefStatus _status = BriefStatus.NICHT_BEGONNEN;
    private BriefStatus1 _testSTatus = BriefStatus1.VOGT;

    public String getNamedesAbsenders(){
        return this._namedesAbsenders;
    }

    public void setNamedesAbsenders(String namedesAbsenders){
        this._namedesAbsenders = namedesAbsenders;
    }

    public String getÜberschrift(){
        return this._überschrift;
    }

    public void setÜberschrift(String überschrift){
        this._überschrift = überschrift;
    }

    public BriefStatus getStatus(){return this._status;}

    public  void BriefBearbeitenStarten(){
        this._status = BriefStatus.IN_BEARBEITUNG;
    }

    public  void BriefFertigBearbeitet(){
        this._status = BriefStatus.FERTIG;
    }

    Brief(){this("", "");}
    Brief(String namedesAbsenders, String überschrift){
        this.setNamedesAbsenders(namedesAbsenders);
        this.setÜberschrift(überschrift);
    }

    @Override
    public String toString(){
        return "Absender: " + this.getNamedesAbsenders() + " Überschrift des Briefes: " + this.getÜberschrift();
    }

}
