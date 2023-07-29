package Game;

import Abstoract.*;

public class Main {
    public static void main(String[]args){
        //配列の作り方は
        //型名[]　配列変数名　＝　型名[配列数]
        Caracter[] c = new Caracter[5];
        c[0] = new Hero();
        c[1] = new Hero();
        c[2]= new Thief("真偽", 100);
        c[3] = new Wizard("マナ", 100, 50);
        c[4] = new Wizard("マに", 100, 50);
        
        //拡張for文
        //for(型名　変数名 : 配列変数名)
        for (Caracter ch : c){
            ch.HP += 50;
        }

        Monster[] monsters = new Monster[3];
        monsters[0] = new Goblin(200, 20,"ゴブリン");
        monsters[1] = new Bat(100, 30,"バット");
        monsters[2] = new Slime(100, 30,"スライム");

        for(Monster g : monsters){
            g.run();
        }

        for(Monster a : monsters){
            c[0].attack(a);
           }

    }
    
}
