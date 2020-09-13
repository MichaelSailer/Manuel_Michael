package models;

import java.util.ArrayList;
import java.util.List;

public class Shop {


        private String _shopName;
        private Address _address;
        List<Article> _articles = new ArrayList<Article>();



        public String getShopName(){
            return this._shopName;
        }
        public void setShopName(String shopName){
            this._shopName = shopName;
        }
        public Address getAddress(){
            return this._address;
        }
        public void setAddress(Address address){
            this._address = address;
        }


        public Shop(){
            this("", null);
        }
        public Shop(String shopName, Address address){
            this.setAddress(address);
            this.setShopName(shopName);
            createArticlesForShop();
        }

        public Article getArticleByID(int id){
            for(Article a : this._articles){
                if(a.getArticleNr() == id){
                    return a;
                }
            }
            return null;
        }
        public Article getArticleByName(String name){
            for(Article n : this._articles){
                if(n.getArticleName() == name){
                    return n;
                }
            }
            return null;
        }
        public Article getArticleByCategory(String category){
            for(Article c : this._articles){
                if(c.getArticleCategory() == category){
                    return c;
                }
            }
            return null;
        }

        @Override
        public String toString(){

            StringBuilder s = new StringBuilder();

            for(Article a: _articles){
                s.append(a.getArticleNr()).append(" ").append(a.getArticleName()).append(" ").append(a.getPrice()).append("€\n");
            }

            return s.toString();
        }

        private void createArticlesForShop(){
            this._articles.add(new MobilePhone("IPhone", "Handy", 1190.99,"ARM-basierter Sechskern-64-Bit-Prozessor",
                    "Apple","3GB Ram", ENUMforOS.IOS, "X", "" + "12 Megapixel Kamera", 1));
            this._articles.add(new MobilePhone("IPhone", "Handy", 620.99,"ARMv8-basierter 64-Bit-Prozessor ",
                    "Apple","2GB Ram", ENUMforOS.IOS, "6s", "12 Megapixel Kamera", 2));
            this._articles.add(new PC("Omen-By-HP", "Notebook", 1500.00,"Intel I7-6700HQ",
                    "HP","32GB Ram", ENUMforOS.Windwos, "GTX 1070", "HP Omen", 3));
            this._articles.add(new Action("Infinity War", "Stan Lee", 2.00, "Thanos", "Avengers Infinity War", "Action",
                    15.99, 4));
            this._articles.add(new Comedy("Zombieland", "Comedian", 25.00,
                    "Zombieland: Doppelt hält beseser", "Paul Wernick", 1.6,
                    "Emma Stone", 5));
            this._articles.add(new ReadingBooks("Ich bin Circe", "Lese Bücher", 45.25,
                    "9781408890080", "Ich bin Circe: Roman", "Madelline Miller",
                    "Roman", true,344, 6));
            this._articles.add(new ReadingBooks("An American Marriage", "Lese Bücher", 43.99,
                    "9781786075192", "An American Marriage", "Tayari Jones",
                    "Roman, Fiktion", true,430, 7));
            this._articles.add(new PC("Thermaltake View 71 TG RGB", "PC", 1749.49,"Ryzen 7 2700X",
                    "Asus ROG","16GB Ram", ENUMforOS.Windwos, "Asus ROG Stric RTX 2070 OC Edition",
                    "Asus ROG Crosshair VII Hero Wi-Fi", 8));
            this._articles.add(new PC("Thermaltake View 91 TG RGB", "PC", 2600.00,"Ryzen 9 3950X",
                    "Asus ROG","16GB Ram", ENUMforOS.Windwos, "Asus ROG Strix RTX 2080 Super", "Asus ROG Crosshair VI Hero Wi-Fi", 9));

        }
}
