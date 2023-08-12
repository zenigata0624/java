package practice02;

public class PoisonMatango extends Matango {

    public PoisonMatango(char suffix,int hp){
    super(suffix,hp);
    }

    int Poison_Point = 5 ;

    public void attack(Hero h){
        super.attack(h);
        if ( this.Poison_Point > 0 );
        System.out.println("毒の胞子をばらまいた");
       int dmg = h.HP/5;
       h.HP -= dmg;
       System.out.println("勇者に"+dmg+"のダメージ");
       System.out.println("勇者の体力は"+h.HP+"だ");
       this.Poison_Point--;
    }
}
