package models;

public abstract class Books extends Article {

    private String _ISBN;
    private String _title;
    private String _author;
    private String _bookSeries;


    public String getISBN(){return this._ISBN;}
    public void setISBN(String ISBN){this._ISBN = ISBN;}

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public String getAuthor() {
        return this._author;
    }

    public void setAuthor(String author) {
        this._author = author;
    }

    public String getBookSeries() {
        return this._bookSeries;
    }

    public void setBookSeries(String bookSeries) {
        this._bookSeries = bookSeries;
    }

    public Books(){this("", "", 0.0, "", "", "", "", 0);}
    public Books(String articleName, String articleCategory, double price,String ISBN, String title, String author, String bookSeries, int articleNr){
        super(articleName, articleCategory, price, articleNr);
        this.setISBN(ISBN);
        this.setTitle(title);
        this.setAuthor(author);
        this.setBookSeries(bookSeries);
    }

    @Override
    public String toString(){
        return super.toString() + "ISBN: " + this.getISBN() + "Autor: " + this.getAuthor() + "Titel: " + this.getTitle() + "Buch-Reihe: " + this.getBookSeries();
    }
}
