package models;

public class ListeningBooks extends Books {
    private double _length;

    public double getLength(){
        return this._length;
    }

    public void setLength(double lenght){
        if(lenght >= 0) {
            this._length = lenght;
        }
    }
    public ListeningBooks(){this("", "", 0.0, "", "", "", "", 0.0, 0);}
    public ListeningBooks(String articleName, String articleCategory, double price,String ISBN, String title, String author, String bookSeries, double length, int articleNr){
        super(articleName, articleCategory, price, ISBN, title, author, bookSeries, articleNr);
        this.setLength(length);
    }

    @Override
    public String toString(){
        return super.toString() + "Länge des Hörbuches: " + this.getLength();
    }
}
