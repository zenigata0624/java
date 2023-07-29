package practice1;

public abstract class TangibleAsset extends Asset implements Thing {

    private String color;
    private double Weight;

    public TangibleAsset(String name ,int price,String color){
        super(name,price);
        this.color = color;
    }

    public String getsColor() {return this.color;}
    public double getsWeight() {return this.Weight;}
    public void setWeight(double weight) { this.Weight = weight; }
}
