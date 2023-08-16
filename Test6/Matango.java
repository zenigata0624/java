package Test6;

import summary06.Hero;

public class Matango {
    int hp = 50;
    char suffix;
    public Matango(char a){
        this.suffix = a ;
    }

    public void attack(Hero h){
        System.out.println("きのこ"+this.suffix+"の攻撃");
        System.out.println("10のダメージ");
        h.HP-=10;        
    }
}
