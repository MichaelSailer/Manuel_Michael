package models;

public class Mail {
    private Customer _mail;
    private BasketItem _bestellung;
    private  Basket _bestellnummer;

    public Customer getMail(){
        return this._mail;
    }
    public void setMail(Customer mail){
        this._mail  = mail;
    }
    public BasketItem getBestellung(){
        return this._bestellung;
    }
    public void setBestellung(BasketItem bestellung){
        this._bestellung = bestellung;
    }
    public Basket getBestellnummer(){
        return this._bestellnummer;
    }
    public void setBestellnummer(Basket bestellnummer){
        this._bestellnummer = bestellnummer;
    }

    public Mail(){this(null, null, null);}
    public Mail(Customer mail, BasketItem bestellung, Basket bestellnumer){
        this.setMail(mail);
        this.setBestellung(bestellung);
        this.setBestellnummer(bestellnumer);
    }

    @Override

    public String toString(){
        return "E-Mail:" + this.getMail().toString() +  "Bestellung:" + " " + this.getBestellung().toString() + " " +"Bestellnummer:" + this.getBestellnummer();
    }
    private void createPaymentForEMail(){

    }
}

