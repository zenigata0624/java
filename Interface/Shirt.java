package Interface;

public class Shirt {
    int minutes;

    public Shirt washShirt(Shirt s){
          System.out.println("洗濯で"+s.minutes+"分洗います");
  
          return new Shirt(minutes);
      }
  
      public Shirt(int minutes){
          this.minutes = minutes;
      }
      
}
