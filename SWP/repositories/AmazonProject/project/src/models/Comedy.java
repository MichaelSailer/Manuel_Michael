package models;

public class Comedy extends Films {

    private String _comedian;

    public String getComedian(){
        return this._comedian;
    }

    public void setComedian(String comedian){
        this._comedian = comedian;
    }

    Comedy(){this("", "", 0.0, "", "", 0.0, "", 0);}
    Comedy(String articleName, String articleCategory, double price, String title, String author, double length, String comedian, int articleNr){
        super(articleName, articleCategory, price, title, author, length, articleNr);
        this.setComedian(comedian);
    }

    @Override
    public String toString(){
        return super.toString() + "Komiker:" + this.getComedian();
    }
}
