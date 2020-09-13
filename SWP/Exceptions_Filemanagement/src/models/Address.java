package models;

import java.io.Serializable;

public class Address implements Serializable {

    private int _aid;
    private String _street;

    public int getAid() {
        return _aid;
    }

    public void setAid(int id) {
        this._aid = id;
    }

    public String getStreet() {
        return _street;
    }

    public void setStreet(String street) {
        this._street = street;
    }

    public Address(){this(0,"");}
    public Address(int aid, String street){
        this.setAid(aid);
        this.setStreet(street);
    }

    @Override
    public String toString(){
        return this.getAid() + "" + this.getStreet();
    }
}
