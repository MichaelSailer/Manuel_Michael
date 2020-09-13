package models;

import java.util.ArrayList;
import java.util.List;


public class Vektorkette extends Vektor2 {

    private List<Vektor2> _vektoren = new ArrayList<>();

    public void addVektor(Vektor2 v){
        this._vektoren.add(v);
    }

    public void removeVektor(Vektor2 v){
        this._vektoren.remove(v);
    }


    public double getResultierende() {
        double x = 0, y = 0;
        for (Vektor2 v: _vektoren){
            x = x + v.getX();
            y = y +v.getY();
        }
        double resultierende = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return resultierende;
    }

    public double getXresultierende(){
        double x = 0;
        for (Vektor2 v: _vektoren){
            x = x + v.getX();
        }
        return x;
    }

    public double getYresultierende(){
        double y = 0;
        for (Vektor2 v: _vektoren){
            y = y + v.getY();
        }
        return y;
    }

    @Override
    public String toString(){
        return "resultierende Länge: " + getResultierende();
    }


}
