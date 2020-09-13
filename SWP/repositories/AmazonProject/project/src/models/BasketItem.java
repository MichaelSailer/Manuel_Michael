package models;

public class BasketItem {

    private Article _article;
    private int _count;

    public Article getArticle(){
        return this._article;
    }

    public void setArticle(Article article){
        this._article = article;
    }

    public int getCount(){
        return this._count;
    }

    public void setCount(int count){
        if(count >= 0){
        this._count = count;
        }
    }

    public BasketItem(){this(null, 0);}
    public BasketItem(Article article, int count){
        this.setArticle(article);
        this.setCount(count);
    }

    @Override
    public String toString(){
        return String.format("%5d%40s%10.2f€%10d%10.2f€", this.getArticle().getArticleNr(),this.getArticle().getArticleName(), this.getArticle().getPrice(),
                this.getCount(), this.getArticle().getPrice() * this.getCount()) ;
    }

}
