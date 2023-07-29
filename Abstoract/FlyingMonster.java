package Abstoract;

public abstract class FlyingMonster extends Monster {
    public FlyingMonster(int HP,int MP,String name){
        super(HP, MP,name);
    }

    public void run(){
        System.out.println(this.getName()+"は、バサバサ逃げた");
    }

    public abstract void attack();
}
