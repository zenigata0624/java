package practice02;

public class SuperHero extends Hero {
    boolean  flying;

    public void fly(){
      this.flying = true;
      System.out.println("とびあがった");
    }

    public void land(){
        this.flying = false;
        System.out.println("着地した");
    }

    public void attack(Matango m){
        super.attack(m);
        if (this.flying){
            super.attack(m);
        } 
    }

    public void run(){
        System.out.println(this.name+"は、撤退した");
    }

    public SuperHero(){
        System.out.println("SuperHeroのコントラクタが起動"); 
    }
}
