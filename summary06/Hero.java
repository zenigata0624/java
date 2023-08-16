package summary06;

/*呼び出されるインスタンスの中身の部分
　補足
  オブジェクト指向の場合のメソッド部分にstaticは基本つかない
  なぜならインスタンスをよびださなくても呼び出せるようにできてしまうので
  オブジェクト指向に向いていない
  
  staticをつかう特殊な条件
　１　インスタンスと結びついてない事
　２　共通で使える範囲であること

　インスタンスでつかうthisは自分自身を表す変数
　日本語でいう「の」にあたる

　has-aの関係　p343　参照
　あるクラスが別のクラスをフィールドとして利用している状態
　　～は～を持っているの関係
 基本の形
 クラス名　任意の変数名;

*/
public class Hero {
    //フィールド(属性)
    //他のファイルで呼び出すので
    //publicでアクセス修飾子をかえています
    public String name;
    public int HP = 200;
    final int Level = 100;
    
    //他のクラスからの定義を持ってくる
    Sword sword;

    //メソッド（操作）
    public void attack(Kinoko h){
        h.HP-=20;
        System.out.println(this.name+"は攻撃した、"+h.name+"の残りのHPは、"+h.HP+"だ");
    }

    public void WeponAttack(Kinoko h){
         h.HP -= this.sword.damage;
        System.out.println(this.name+"は"+this.sword.name+"で攻撃した、"+h.name+"の残りのHPは、"+h.HP+"だ");
    }

    public int sleep(){
      System.out.println(this.name+"は休憩をした");

      //thisは自分自身をあらわす
      //自分自身のインスタンスのフィールド変数に～を与える　になる。   
      this.HP+=10;
      System.out.println(this.name+"は10回復した、今のHPは"+HP+"です");
      return HP;
    }

    //そのままの数値でかえしているので実際は回復していない
    public final void sit(int sec){
        this.HP += sec;
        System.out.println(this.name+"は"+sec+"秒座った");
        System.out.println(this.name+"は"+sec+"ポイント回復した");
        System.out.println(this.name+"のHPは"+this.HP+"だ");
    }

    public void run(){
      System.out.println("逃げ出した");
    }

    public Hero(String name){
      this.name =name;
    }

    public Hero(String name,int HP){
      this.name =name;
      this.HP =HP;
    }
}
