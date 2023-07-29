package practice1;

public  class Book extends TangibleAsset {

    String isbn;

    public Book(String name ,int price,String color,String isbn,double weight){
    super (name,price,color);
    this.isbn = isbn;
    setWeight(weight);
    }
    
    public String getsIsbn() {return this.isbn;}
    
    public double getWeight() {
        return super.getsWeight();
    }
}
