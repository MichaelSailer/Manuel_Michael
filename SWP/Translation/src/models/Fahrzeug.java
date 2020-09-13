package models;

public class Fahrzeug {

    private String _karosserie;
    private String _motor;
    private double _räder;
    private char _allrad;

    public String getKarosserie(){
        return this._karosserie;
    }

    public void setKarosserie(String karosserie){
        this._karosserie = karosserie;
    }

    public String getMotor(){
        return this._motor;
    }

    public void setMotor(String motor){
        this._motor = motor;
    }

    public double getRäder(){
        return this._räder;
    }

    public void setRäder(double räder){
        if(räder > 1){
            this._räder = räder;
        }
    }

    public char getAllrad(){
        return this._allrad;
    }

    public void setAllrad(char allrad){
        this._allrad = allrad;
    }


    Fahrzeug(){this("","",0.0, ' ');}
    Fahrzeug(String karosserie, String motor, double räder, char allrad){
        this.setKarosserie(karosserie);
        this.setMotor(motor);
        this.setRäder(räder);
        this.setAllrad(allrad);
    }

    @Override
    public String toString(){
        return "Karosserie; " + this.getKarosserie() + "Motor: " + this.getMotor() +
                "Räder: " + this.getRäder() + "Allrad: " + this.getAllrad();
    }

}
