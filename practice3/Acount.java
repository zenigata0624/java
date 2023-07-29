package practice3;

public class Acount{
    String acountNumber;
    int balance;

    public String toString(){
        return  "￥"+ this.acountNumber+
        "口座番号：" + this.balance;
    }

    public boolean equals(Object c){
        if(this == c){return true;}
        if(c instanceof Acount){
            Acount a = (Acount)c;
            String a1 = this.acountNumber.trim();
            String a2 = a.acountNumber.trim();
        if(a1.equals(a2)){return true;}
        }
     return false;
    }


}