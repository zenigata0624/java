package practice02;

public class Hero {
    String name = "みなと";
    int HP = 100;
    public void attack(Matango m) {
        System.out.println(this.name+"の攻撃");
        m.hp -= 5;
        System.out.println("5ポイントのダメージを与えた");
    }

    public final void  slip(){
        this.HP -= 5;
        System.out.println("5ポイントのダメージを受けた");
    }

    public void run(){
        System.out.println(this.name+"は、逃げ出した");
    }

    
    public Hero(){
        System.out.println("Heroのコントラクタが起動");   
    }
}
