package Game;

import Abstoract.Monster;

public abstract class Caracter {
    String name;
    int HP;
    public void run(){
        System.out.println(this.name+"は、逃げた");
    }

    public abstract void attack(Monster M);

    
    public Caracter(String name , int HP){
        this.name = name;
        this.HP = HP;
    }

}
