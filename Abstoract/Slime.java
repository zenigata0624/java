package Abstoract;

public class Slime extends Monster {

    public Slime(int HP ,int MP,String name){
        super(HP,MP,name);
    }

    public void attack(){
     System.out.println("体当たりをした");
    }

    public void run(){
     System.out.println(this.getName()+"は、ジャンプして逃げ出した");
    }
    
}
