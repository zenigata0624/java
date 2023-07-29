package Abstoract;

public abstract class Monster {
     private int HP;
     private int MP;
     private String name;
    public abstract void attack();
    public abstract void run();

    public Monster(int HP,int MP,String name){
      this.HP = HP;
      this.MP = MP;
      this.name = name;
    }

    public int getHP(){return this.HP;}
    public int getMP(){return this.MP;}
    public String getName(){return this.name;}
    public void setHP(int HP){this.HP = HP;}

}