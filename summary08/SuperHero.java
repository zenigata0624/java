package summary08;

import summary06.Hero;
import summary06.Kinoko;


public class SuperHero extends Hero{


    //superを使ったコンストラクタの引継ぎ
    public SuperHero(String name){
    super(name);
    }

    boolean Flying;

    public void attack(Kinoko h){

        super.attack(h);
        //boolean型の場合this.Flyingだけでも
        //this.Flying==trueと同じことになる
        if(this.Flying){
            super.attack(h);
        }
    }

    public void fly(){
      int i = new java.util.Random().nextInt(2)+1;
        if(i==1){
            System.out.println("飛んだ");
            this.Flying=true;
            //this.land();
        }else{
            System.out.println("失敗した");
            this.land();
        //特定の条件を満たした場合にメソッドの実行を中断したい場合、メソッド内で return ステートメントを使用する
        //ループやswitchの場合はbreak；を使う
            return;
        }
    }

     //superを使ったフィールドの呼び出し
     //ただし、呼び出す場所にアクセス修飾子がかかっていると呼び出せない
    public void land(){
        System.out.println(super.name+"は着地した");
        this.Flying =false;
    }


    //親クラスの元にあるメソッドから再度定義すると
    //オーバーライド（上書き）される
    public void run(){
        System.out.println("オーバーライドしている");
    }



}
