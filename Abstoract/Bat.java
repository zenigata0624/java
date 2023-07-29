package Abstoract;

public class Bat extends FlyingMonster {
    public Bat(int HP,int MP,String name){
        super(HP, MP,name);
    }
    public void attack(){
        System.out.println("噛みつく");
    }
    
}
