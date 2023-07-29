package show;

public class Hero {
    private String name;
    public int hp;
  
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した");
    }

    public void sit(int sec){
     this.hp += sec;
     System.out.println(this.name+"は、"+sec+"秒座った");
     System.out.println("hpが、"+sec+"ポイント回復した");
    }

   public void slip(){
        this.hp -= 5;
        System.out.println(this.name + "は転んだ");
        System.out.println("hpに5のダメージ");
   }

   public void run(){
    System.out.println(this.name + "は逃げ出した");
    System.out.println("成功");
    System.out.println(this.name + "の、現在のHPは"+this.hp+"です");
    }

    public int getHp() {
        return hp;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

