package Abstoract;

public class Goblin extends WalkingMonster {
    public Goblin(int HP, int MP,String name){
        super(HP, MP,name);
    }
    public void attack(){
        System.out.println("ナイフできり付ける");
    }
}
