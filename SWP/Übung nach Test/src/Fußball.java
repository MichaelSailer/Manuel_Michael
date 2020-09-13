import java.util.ArrayList;
import java.util.List;

public class Fußball {

    private String _fußballspieler;
    private String _regeln;
    private int _minuten;
    private char _anfangsbuchstabeStadt;
    private boolean _heim;
    List<Fußballspieler> _player = new ArrayList<>();

    public String _getFußballspieler(){
        return this._fußballspieler;
    }
    public void _setFußballspieler(String fußballspieler){
        this._fußballspieler = fußballspieler;
    }
    public String _getRegeln(){
        return this._regeln;
    }
    public void _setRegeln(String regeln){
        this._regeln = regeln;
    }
    public int getMinuten(){return this._minuten;}
    public void setMinuten(int minuten){if(minuten > 0){this._minuten = minuten;}}
    public char getAnfangsbuchstabeStadt(){return this._anfangsbuchstabeStadt;}
    public void setAnfangsbuchstabeStadt(char anfangsbuchstabeStadt){this._anfangsbuchstabeStadt = anfangsbuchstabeStadt;}
    public boolean getHeim(){return this._heim;}
    public void setHeim(boolean heim){this._heim = heim;}


    Fußball(){this("", "", 0.0, '', "");}
    Fußball(String fußballspieler, String regeln, int minuten, char anfangsbuchstabeStadt, boolean heim){
        this._setFußballspieler(fußballspieler);
        this._setRegeln(regeln);
        this._setMinuten(minuten);
        this._setAnfangsbuchstabeStadt(anfangsbuchstabeStadt);
        this.setHeim(heim);
    }

    @Override
    public String toString() {
        return "Fußballspieler:" + this._getFußballspieler() + "Regeln:" + this._getRegeln() + "Minuten:" + this.getMinuten() + "Anfangsbuchstabe der Stadt:" + this.getAnfangsbuchstabeStadt() + "Heim:" + this.getHeim();
    }

    public boolean removeFußballspieler(Fußballspieler vorname) {
        for (fußballspieler b : this._player) {
            if (vorname.equals(b.getVorname())) {
                return this._player.remove(b);
            }
        }
    }

    public String addFußballspieler(Fußballspieler fußballspieler){
        this._player.add(fußballspieler);
    }


}
