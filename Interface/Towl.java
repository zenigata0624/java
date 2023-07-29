package Interface;

public class Towl {
    int minutes;

    public Towl washTowl(Towl t){
        System.out.println("洗濯で"+t+"分洗います");

         return new Towl(minutes);
    }

    public Towl(int minutes){
        this.minutes = minutes;
    }
}
