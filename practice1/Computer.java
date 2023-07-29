package practice1;

public class Computer extends TangibleAsset {
     
    String makerName;

    public Computer(String name ,int price,String color,String makerName,double Weight){
      super(name, price, color);
      this.makerName = makerName;
      setWeight(Weight);
    }
    public String getsMakerName() {return this.makerName;}
    public double getWeight() {
      return super.getsWeight();
  }
}
