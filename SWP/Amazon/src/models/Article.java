package models;

public abstract class Article{


    private String _articleName;
    private String _articleCategory;
    private double _price;
    private int _articleNr;

    public String getArticleName(){
        return this._articleName;
    }
    public void setArticleName(String articleName){
        this._articleName = articleName;
    }
    public String getArticleCategory(){
        return this._articleCategory;
    }
    public void setArticleCategory(String articleCategory){
        this._articleCategory = articleCategory;
    }
    public double getPrice(){return this._price;}
    public void setPrice(double price){
        if(price > 0){
            this._price = price;
        }
    }

    public int getArticleNr(){
    return this._articleNr;
    }
    public void setArticleNr(int articleNr){
        if(articleNr > 0){
            this._articleNr = articleNr;
        }
    }

    public Article(){this("", "", 0.0, 0);}
    public Article(String articleName, String articleCategory, double price, int articleNr){
            this.setArticleName(articleName);
            this.setArticleCategory(articleCategory);
            this.setPrice(price);
            this.setArticleNr(articleNr);
    }

    @Override
    public String toString(){
        return "Artikelnummer: " + this.getArticleNr() + " Artikelname:" + this.getArticleName() + "Artikelkategorie:" + this.getArticleCategory() +
                "Preis: " + this.getPrice();
    }


}
