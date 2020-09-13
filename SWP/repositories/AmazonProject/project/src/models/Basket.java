package models;
import java.util.*;

public class Basket {

    private ENUMS _paymentOption;
    private double _price;
    private Customer _customer;
    private Address _deliveryAddress;
    private ArrayList<BasketItem> _items = new ArrayList<BasketItem>();
    private long _bestellnummer;

    public ENUMS getPaymentOption() {
        return this._paymentOption;
    }

    public void setPaymentOption(ENUMS paymentOption) {
        this._paymentOption = paymentOption;
    }

    public double getPrice() {
        return this._price;
    }

    public void setPrice(double price) {
       if(price > 0.0) {
           this._price = price;
       }
    }
    public void setItem(ArrayList<BasketItem> item) {
        this._items = item;
    }
    public ArrayList<BasketItem> getItems(){
        return this._items;
    }

    public Customer getCustomer() {
        return this._customer;
    }

    public void setCustomer(Customer customer) {
        this._customer = customer;
    }

    public Address getDeliveryAddress() {
        return this._deliveryAddress;
    }
    public void addItem(BasketItem item){

        this._items.add(item);
    }
    public boolean removeItem(int id){
        for(BasketItem b : this._items){
            if(id == b.getArticle().getArticleNr()){
                return this._items.remove(b);
            }
        }
        return false;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this._deliveryAddress = deliveryAddress;
    }

    public long getBestellnummer(){
        return this._bestellnummer;
    }
    public void setBestellnummer(long bestellnummer){
        this._bestellnummer = bestellnummer;
    }

    public Basket(){this(ENUMS.notSpecified, 0.0, null, null, 0);}
    public Basket(ENUMS paymentOptions, double price, Customer customer, Address deliveryAddress, long bestellnummer){
        this.setPaymentOption(paymentOptions);
        this.setPrice(price);
        this.setCustomer(customer);
        this.setDeliveryAddress(deliveryAddress);
        this._bestellnummer = new Random().nextInt(900000) + 1000000;
    }
    @Override
    public String toString(){
        String s = "";

        if(this._items.size() > 0){
            for(BasketItem b : this._items){
                s += b.toString() + "\n";
            }
        }
        if(s == ""){
            return "Keine Einträge im Warenkorb";
        }
        return s;
    }

}
