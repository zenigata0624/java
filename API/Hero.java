package API;

public class Hero {
    private String name;
    private int hp;
    private String job;
    private static int money;

    public String getjob(){
      return this.job;
    }

    public void setjob(String job){
      this.job = job;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int gethp(){
        return this.hp;
    }
    public void sethp(int hp){
        this.hp = hp;
    }    

    public static int getMoney(){
      return money;
    }

    public static void setRandomMoney(){
      Hero.money=(int)(Math.random()*1000);
    }    


    public String toString(){
        return "名前 " + this.name +" HP " + this.hp +" 職業 "+this.job;
    }

    public boolean equals(Object o){
        if(this == o){return true;}
        if (o instanceof Hero){
          Hero h = (Hero)o;
          if(this.name.equals(h.name)){
            return true;
          }
        }
        return false;
    }
}
