package Story;

public class Wizard {
    String name;
    int hp;
    public void heal(Hero h){
      int currentHP = h.gethp();
    currentHP += 10;
    h.sethp(currentHP);
    System.out.println(h.getname()+"のhpを10回復した");
    System.out.println("今のhpは"+h.gethp()+"だ");
    }
}
