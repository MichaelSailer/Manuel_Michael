package models;

public abstract class Films extends Article{

    private String _title;
    private String _author;
    private double _length;

    public String getTitle(){
        return this._title;
    }

    public void setTitle(String title){
        this._title = title;
    }

    public String getAuthor(){
        return this._author;
    }

    public void setAuthor(String author){
        this._author = author;
    }

    public double getLength() {
        return _length;
    }

    public void setLength(double length) {
        if(length > 0.0) {
            this._length = length;
        }
    }

    public Films(String articleName, String articleCategory, double price, String title, String author, double length){this("", "", 0.0, "", "", 0.0, 0);}
    public Films(String articleName, String articleCategory, double price, String title, String author, double length, int articleNr){
        super(articleName, articleCategory, price, articleNr);
        this.setTitle(title);
        this.setAuthor(author);
        this.setLength(length);
    }

    @Override
    public String toString(){
        return super.toString() + "Titel:" + this.getTitle() + "Autor:" + this.getAuthor() + "Länge: " +  this.getLength();
    }
}
