package Game;

import Abstoract.Monster;

public class Hero extends Caracter {

    public Hero(){
        super("悟",100);
    }


    public void attack(Monster M){
        System.out.println(this.name+"の攻撃");
        System.out.println("敵にダメージを与えた");
        M.setHP(M.getHP()-10);
        System.out.println(M.getName()+"のhpは"+M.getHP()+"が残りだ");
    }

}
