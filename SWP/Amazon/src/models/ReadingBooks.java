package models;

public class ReadingBooks extends Books {
    private boolean _bound;
    private int _sites;

    public boolean getBound() {
        return this._bound;
    }

    public void setBound(boolean bound) {
        this._bound = bound;
    }

    public int getSites() {
        return this._sites;
    }

    public void setSites(int sites) {
        if(sites >= 0) {
            this._sites = sites;
        }
    }

    public ReadingBooks(){this("", "", 0.0, "", "", "", "", false, 0, 0);}
    public ReadingBooks(String articleName, String articleCategory, double price,String ISBN, String title, String author, String bookSeries, boolean bound, int sites
            , int articleNr){
        super(articleName, articleCategory, price, ISBN, title, author, bookSeries, articleNr);
        this.setBound(bound);
        this.setSites(sites);
    }

    @Override
    public String toString(){
        return "Gebunden [j, n]: " + this.getBound() + "\t" + "Seiten: " + this.getSites();
    }
}
