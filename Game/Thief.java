package Game;

import Abstoract.Monster;

public class Thief extends Caracter{

    public Thief(String name,int HP){
        super(name, HP);
    }

    public void attack(Monster M){
        System.out.println("相手を切り付けた");
    }

} 
