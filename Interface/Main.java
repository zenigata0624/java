package Interface;


public class Main{
public static void main(String[]args){
    Shirt a= new Shirt(15);
    CleaningShop h = new CleaningShop();
    
    h.run();
    h.washShirt(a);
    a.washShirt(a);
    h.name = "ここ";
    h.address = "111@111";
    h.phone = "0909909";
}

}
