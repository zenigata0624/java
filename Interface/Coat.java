package Interface;

public class Coat {
      int minutes;

  public Coat washCoat(Coat c){
        System.out.println("洗濯で"+c+"分洗います");

        return new Coat(minutes);
    }

    public Coat(int minutes){
        this.minutes = minutes;
    }

}
