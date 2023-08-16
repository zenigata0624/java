package Test6;

import summary06.Hero;

public class Poison extends Matango {
    public Poison(char a){
        super(a);
    }
    int posnAttack = 5;
    
    public void attack(Hero h){
        super.attack(h);
        if(posnAttack > 0){
            System.out.println("さらに攻撃");
            int dmg = h.HP / 5;
            System.out.println(dmg+"ポイントのダメージ");
            posnAttack--;
            int HP = h.HP - dmg;
            System.out.println("勇者のＨＰは"+HP+"だ");
        }
    }
}
