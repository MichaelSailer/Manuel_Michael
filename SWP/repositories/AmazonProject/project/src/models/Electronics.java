package models;

public abstract class Electronics extends Article {

    private String _cpu;
    private String _brand;
    private String _ram;
    private ENUMforOS _operatingSystem;

    public String getCPU(){return this._cpu;}
    public void setCPU(String cpu){
        this._cpu = cpu;
    }
    public String getBrand(){return this._brand;}
    public void setBrand(String brand){
        this._brand = brand;
    }
    public String getRam(){return this._ram;}
    public void setRam(String ram){
        this._ram = ram;
    }
    public ENUMforOS getOperatingSystem(){return this._operatingSystem;}
    public void setOperatingSystem(ENUMforOS operatingSystem){
        this._operatingSystem = operatingSystem;
    }

    public Electronics(){this("", "", 0.0, "", "" ,"" ,ENUMforOS.notSpecified, 0);}
    public Electronics(String articleName, String articleCategory, double price, String cpu, String brand, String ram, ENUMforOS operatingSystem, int articleNr){
        super(articleName, articleCategory, price, articleNr);
        this.setCPU(cpu);
        this.setBrand(brand);
        this.setRam(ram);
        this.setOperatingSystem(operatingSystem);
    }

    @Override
    public String toString(){
        return super.toString() + "Marke: " + this.getBrand() + "\n" + "CPU: " + this.getCPU() + "\n" + "Arbeitsspeicher (RAM): " + this.getRam()
                + "\n" + "Betriebssystem (OS): " + this.getOperatingSystem();
    }
}
