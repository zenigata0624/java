package Test7;

public class Book extends Asset {
    String isbn;
    String color;
    public Book(String name,int price, String color,double weight,String isbn){
        super(name, price,weight);
        this.color = color;
        this.isbn = isbn;
    }

    public String getColor() {return this.color;}
    public String getisbn() {return this.isbn;}
}
