package models;

public class MobilePhone extends Electronics {
    private String _model;
    private String _camera;

    public String getModel(){return this._model;}
    public void setModel(String model){
        this._model = model;
    }
    public String getCamera(){return this._camera;}
    public void setCamera(String camera){
        this._camera = camera;
    }

    public MobilePhone(){
        this("", "", 0.0, "", "" ,"" ,ENUMforOS.notSpecified, "", "", 0);
    }
    public MobilePhone(String articleName, String articleCategory, double price, String cpu, String brand, String ram,
                       ENUMforOS operatingSystem, String model, String camera, int articleNr){
        super(articleName, articleCategory, price, cpu, brand, ram, operatingSystem, articleNr);
        this.setCamera(camera);
        this.setModel(model);
    }

    @Override
    public String toString(){
        return super.toString() + "Model: " + this.getModel() + "\n" + "Kamera: " + this.getCamera();
    }

}
