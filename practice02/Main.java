package practice02;

public class Main{
 public static void main(String[]args){
    SuperHero sh = new SuperHero();
    sh.run();
    Hero h = new Hero();
    h.run();
    Wepon k = new Wepon();
    k.move();
    PoisonMatango pm = new PoisonMatango('A',200);
    pm.attack(h);
 }   
}