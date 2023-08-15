package summary06;

//もう一つのインスタンスを作る

public class Kinoko {

    //フィールドはあらかじめ設定することも可能
    //値の固定化したフィールドの属性を定数フィールドと呼ぶ
    int HP = 200;
    
    //定数フィールドは値を変えることができない
    final String name ="マタンゴ";

    //引数内（）でクラス名と任意の変数を与えると
    //そのクラスを変数として扱える
    public void attack(Hero a){
        a.HP-=10;
        System.out.println(this.name+"の攻撃"+a.name+"に10のダメージ");
        System.out.println(a.name+"の残りのHPは"+a.HP+"です");
    }

    public void sleep(Hero a){
       System.out.println(this.name+"の睡眠攻撃");   
       if(a.HP<=100)
       { System.out.println(a.name+"は眠ってしまった");}
       else{
        System.out.println(a.name+"は眠らなかった");}
    }
}
