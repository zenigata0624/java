package practice2;

import Story.Hero;

public class Wizard {
    private int HP;
    private int MP;
    private String name;
    private Wand wepon ;

    void heal(Hero h){
        int basePoint= 10;
        int recovPoint =
        (int)(basePoint*this.wepon.getPower());
        h.sethp(h.gethp()+recovPoint);
        System.out.println(h.getname()+"の、HPを"+recovPoint+"回復した");
    }

    public int GetHP(){
     return this.HP;
    }

    public int GetMP(){
     return this.MP;
    }

    public String GetName(){
     return this.name;
    }

    public void setHP(int HP){
        if(HP < 0){
        HP = 0 ;
        }else
        {this.HP = HP;}
    }

    public void setMP(int MP){
        if(MP < 0){
        throw new IllegalArgumentException
        ("MPが、0以下です");
        }
        this.MP = MP;
    }

    public void setName(String name){
     if(name == null ||name.length() < 3){
        throw new IllegalArgumentException
        ("三文字以下は制限されています");
    }
    this.name = name;
    }

    public Wand getWepon(){
        return this.wepon;
    }
    
    public void setWepon(Wand wepon){
        if(wepon == null){
         throw new IllegalArgumentException
        ("武器が装備されていません");
        }
        this.wepon = wepon;
    }
}
