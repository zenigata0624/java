package polymorphism;

import Abstoract.Goblin;
import Abstoract.Monster;

public class Main {
    public static void main(String[]args){
        Monster a = new Goblin(21, 20,"ゴブリン");
        a.attack();

        Life h = new Wizard();
        h.run();
        
        if(h instanceof Wizard){
            Wizard b = (Wizard)h;
            b.attack();
        }
    }

}
