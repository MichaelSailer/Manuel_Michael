public class Fußballspieler {

    private String _vorname;
    private String _nachname;
    private int _trikotnummer;

    public String _getVorname(){
        return this._vorname;
    }
    public void _setVorname(String vorname){
        this._vorname = vorname;
    }
    public String _getNachname(){
        return this._nachname;
    }
    public void _setNachname(String nachname){
        this._nachname = nachname;
    }
    public int _getTrikotnummer(){
        return this._trikotnummer;
    }
    public void _setTrikotnummer(int trikotnummer){
        if(trikotnummer > 0) {
            this._trikotnummer = trikotnummer;
        }
    }

    Fußballspieler(){this();}
    Fußballspieler(String vorname, String nachname, int trikotnummer){
        this._setVorname(vorname);
        this._setNachname(nachname);
        this._setTrikotnummer(trikotnummer);
    }

    @Override
    public String toString(){
        return "Vorname:" + this._getVorname() + "Nachname:" + this._getNachname() + "Trikotnummer:" + this._getTrikotnummer();
    }
}
