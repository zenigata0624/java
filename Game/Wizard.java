package Game;

import Abstoract.Monster;

public class Wizard extends Caracter {
    int MP;


    public Wizard( String name, int HP,int MP){
        super(name,HP);
        this.MP= MP;
    }

    public void attack(Monster M){
     System.out.println(this.name+"の攻撃");
     System.out.println("敵に3ポイントのダメージを与えた");
     M.setHP(M.getHP()- 3);
    }

    public void fire_boll(Monster M){
     System.out.println(this.name+"の攻撃");
     System.out.println("敵に20ポイントのダメージを与えた");
     M.setHP(M.getHP()-20);
     this.MP -= 5;
    }

    
}
