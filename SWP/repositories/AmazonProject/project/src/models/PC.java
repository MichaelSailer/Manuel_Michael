package models;

public class PC extends Electronics{

    private String _graphicsCard;
    private String _motherboard;


    public String getGraphicsCard(){
        return this._graphicsCard;
    }
    public void setGraphicsCard(String graphicsCard){
        this._graphicsCard = graphicsCard;
    }
    public String getMotherboard(){
        return this._motherboard;
    }
    public void setMotherboard(String motherboard){
        this._motherboard = motherboard;
    }

    public PC(){this("", "", 0.0, "", "" ,"" ,ENUMforOS.notSpecified ,"", "", 0);}
    public PC(String articleName, String articleCategory, double price, String cpu, String brand,
              String ram, ENUMforOS operatingSystem, String graphicsCard, String motherboard, int articleNr){
        super(articleName, articleCategory, price, cpu, brand, ram, operatingSystem, articleNr);
        this.setGraphicsCard(graphicsCard);
        this.setMotherboard(motherboard);
    }

    @Override
    public String toString(){
        return "Grafikkarte:" + this.getGraphicsCard() + "Motherboard:" + this.getMotherboard();
    }
}
