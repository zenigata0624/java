package Test7;

public class Computer extends Asset{
    String MakerName;
    String color;
    public Computer(String name,int price, String color,double weight,String MakerName){
        super(name, price,weight);
        this.MakerName = MakerName;
        this.color = color;
        setweight(weight);
    }

    public String getColor() {return this.color;}
    public String getMakerName() {return this.MakerName;}
}
