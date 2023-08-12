package Story;

import practice02.Matango;

public class Main {
  public static void main(String[]args){

    Sword s = new Sword();
    s.name = "緑の剣";
    s.damage = 10;

    Matango m= new Matango('w', 200);

    Hero h1 = new Hero("湊");
    h1.sethp(2);
    h1.sword = s;

    Hero h2 = new Hero();
    h2.sethp(100);

    Wizard w = new Wizard();
    w.name = "アサカ";
    w.hp = 50;

    String a = new String("こんにちは");

    System.out.println(a);

    System.out.println("現在の武器は"+h1.sword.name);
    System.out.println(h1.getname()+"は"+h1.sword.name+"で攻撃した");
    
    w.heal(h2);
    w.heal(h2);
    System.out.println(h1.getname()+"のhpは"+h1.gethp());
    System.out.println(h2.getname()+"のhpは"+h2.gethp());
  
    h1.Sleep();
    
    h1.attack(m);
    
    h1.setName("");

  }
}