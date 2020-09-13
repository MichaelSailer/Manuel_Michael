package models;

public class Action extends Films {

    private String _enemy;

    public String getEnemy(){
        return this._enemy;
    }

    public void setEnemy(String enemy){
        this._enemy = enemy;
    }

    Action(){this("", "", 0.0, "", "", "", 0.0, 0);}
    Action(String title, String author, double length, String enemy, String artileName, String articleCategory, double prize, int articleNr){
        super(title, author, length, artileName, articleCategory, prize, articleNr);
        this.setEnemy(enemy);
    }

    @Override
    public String toString(){

        return super.toString() + "Feind:" + this._enemy;
    }
}
