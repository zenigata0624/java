package practice02;

public class Matango {
    public int hp;
    public char suffix;
    public void run(){
        System.out.println("お化けキノコ"+this.suffix+"逃げ出した");
    }


    public Matango(char suffix, int hp){
        this.suffix = suffix;
        this.hp = hp;
    } 

    public void attack(Hero h){
     System.out.println("キノコ"+this.suffix+"の攻撃");
     System.out.println("10のダメージ");
     h.HP -= 10;
    }

}
