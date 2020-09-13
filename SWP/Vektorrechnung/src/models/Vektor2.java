package models;

public class Vektor2 {

    private double _x;
    private double _y;


    public double getX(){
            return this._x;
        }
    public void setX(double x){
        this._x = x;
    }
    public double getY(){
        return this._y;
    }
    public void setY(double y){
        this._y = y;
    }





    public static Vektor2 vektorAddition(Vektor2 a2, Vektor2 a3){
        Vektor2 a = new Vektor2();
        a.setX(a2.getX() + a3.getX());
        a.setY(a2.getY() + a3.getY());
        return a;
    }

    public static Vektor2 vektorSubtraktion(Vektor2 a2, Vektor2 a3){
        Vektor2 a = new Vektor2();
        a.setX(a2.getX() - a3.getX());
        a.setY(a2.getY() - a3.getY());
        return a;
    }

    public static Vektor2 vektorMultiplikation(double zahl, Vektor2 v){
        Vektor2 a = new Vektor2();
        a.setX(v.getX() * zahl);
        a.setY(v.getY() * zahl);
        return a;
    }

    public static double vektorLänge(Vektor2 v){
        double z = Math.sqrt(Math.pow(v.getX(), 2) + Math.pow(v.getY(), 2));
        return z;
    }

    public static double vektorSkalarprodukt(Vektor2 v2, Vektor2 v3){
        double ergebnis;
        ergebnis = (v2.getX() * v3.getX()) + (v2.getY() * v3.getY());
        return ergebnis;
    }

    public static Vektor2 vektorEinheit(Vektor2 v){
        Vektor2 a = new Vektor2();
        double x, y;
        double betrag = vektorLänge(v);
        x = ((1/betrag) * (v.getX()));
        y = ((1/betrag) * (v.getY()));
        a.setX(x);
        a.setY(y);
        return a;
    }

    Vektor2(){this(0.0, 0.0);}
    Vektor2(double x, double y){
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString(){
        return this.getX() + " " + this.getY();
    }

}

