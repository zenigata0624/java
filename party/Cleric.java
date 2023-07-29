package party;
import java.util.Random;

public class Cleric {
     String name;
     int hp = 50;
     final int fullHp = 50;
     int magicPoint = 10;
     final int fullMagicPoint = 10;

     public void selfAid(){
        System.out.println(this.name+"は、呪文を唱えた");
        this.hp = fullHp;
        this.magicPoint -= 5;
        System.out.println(this.name+"は、hpを回復した");    
     }

     public int pray(int sec){
        System.out.println(this.name+"は"+sec+"秒祈った");
     int point = new Random().nextInt(3) + sec;
     int recover = Math.min(this.fullMagicPoint - this.magicPoint,point);

     this.magicPoint += recover;
      System.out.println("MPが"+recover+"回復した。");
      return recover;
     }
}
