package Constructor;

public class Thief {
    String name;
    int Hp;
    int mp;
    
    public Thief(String name,int Hp,int mp){
     this.name = name;
     this.Hp = Hp;
     this.mp = mp;
    }

    public Thief(String name,int Hp){
      this(name,Hp,5);
    }

     public Thief(String name){
      this(name,40,5);
    }

}
