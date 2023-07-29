package Abstoract;

public abstract class WalkingMonster extends Monster {
    
    public WalkingMonster(int HP, int MP,String name){
    super(HP,MP,name);
    }

    public abstract void attack();

    public void run(){
        System.out.println(this.getName()+"は、とことこ歩いて逃げる");
    }
}
