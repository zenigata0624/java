package practice1;

public abstract class Asset {

        private String name;
        private int price;

       public Asset(String name ,int price){
        this.name= name;
        this.price = price;
       }

       public String getsName() {return this.name;}
       public int getsprice() {return this.price;}
}
