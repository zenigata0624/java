package Story;

import practice02.Matango;


public class Hero {
    private String name;
    private int hp;
    Sword sword;
    
    public void attack(Matango m){
    System.out.println(this.name + "は攻撃した。");
    System.out.println("敵に５ポイントのダメージを与えた");
    System.out.println("モンスターの反撃"+m.suffix+"から２のダメージをうけた");
    this.hp -= 2;
    System.out.println("今のhpは"+this.hp+"だ");
    if(this.hp <= 0){
        this.die();
    }
    
    }

    public void bye() {
    System.out.println("勇者は別れを告げた");
    }

    private void die(){
        System.out.println("勇者は死んでしまった");
        System.out.println("GAME OVER");
    
    }

     void Sleep(){
        this.hp += 100;
        System.out.println(this.name+"は眠って回復した");
        System.out.println("今のhpは"+this.hp+"だ");
    }


    public Hero(String name){
     this.name =name;
     this.hp = 100;
    }

    public Hero(){
        this("ダミー");
    }

    public  String getname(){
        return this.name;
    } 

    public void  setname(String name){
        this.name = name;
    }

    public int gethp(){
        return this.hp;
    }

    public void sethp(int hp){
        this.hp = hp;
    }
    
    public void setName(String name){
            if(name == null){
                throw new IllegalArgumentException
                ("名前無しと判断");
            }
    
            if(name.length() <= 1){
                throw new IllegalArgumentException
                ("名前が短いと判断");
            }
    
            if(name.length() >= 8){
                throw new IllegalArgumentException
                ("名前が長いと判断");
            }
            this.name = name;
        }
}
