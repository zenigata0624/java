package Test7;

public abstract class Asset implements Tangle,Thing {
    String name;
    int price;
    double weight;

    public Asset(String name, int price, double weight){
        this.name = name;
        this.price = price;
    }

    public String getName() {return this.name;}
    public int getPrice() {return this.price;}
    public double getweight(){return this.weight;}
    public void setweight(double weight){this.weight=weight;}
}