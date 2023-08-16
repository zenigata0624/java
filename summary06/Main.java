package summary06;

/* 
インスタンスとは p305参照
クラスの複製品であり
例えるなら
金型から作られた型の方で
金型自体はクラスと思われる
クラスからインスタンスを作り出す方法をインスタンス化という
newで作り出された数がインスタンスの数になる


javaのプログラムの基本　p308参照
mainメソッドがあるクラスの神様のクラスと
現実世界を模した、複数の登場人物のクラス

インスタンスをつくる
基本の形は
クラス名　変数名　＝　new演算子　クラス名（）

フィールドへの値の代入
基本の形
変数名.フィールド名  = 値

クラス型変数　p316参照
クラスに基づいた型を作ることができる
変数を付けるのは見分けるため
例えるのであれば作られたインスタンスの識別をするため



フィールドとメソッドを合わせた総称をmenber（メンバ）という
※クラスは別 p313参照

インスタンスにおけるメソッド定義
元の数値からインスタンス化した数値を変動させていくときにつかうのがgetter
元の数値のインスタンス化した数値自体をかえるのがsetter
数値自体の動きや操作を行うのがvoid

ヒープ p334参照
JVMが持っている大量の、コンピューターのメモリ領域
インスタンスのを作る時などに使用され、インスタンスはヒープの一部に過ぎない
初めにnew演算子によって使用が
行われてそこはインスタンスのために確保される先頭番地となる

参照
変数として設定された先頭番地の関連された入りきらない情報のこと

特別なString型　p347
String型はAPIリファレンスに登録されている型
使われる数が多いので特別に二重引用符（""）で文字を
囲めばその文字列情報を持ったStringインスタンスを利用できる


*/

public class Main{
    public static void main(String[]args){
        //インスタンスをつくる
        Hero h = new Hero("ダミー");
        //同じ型で新しいインスタンスを作れば、
        //新しい情報を持ったインスタンスが出来上がる
        Hero h2 = new Hero("ダミー");
        
        Sword w = new Sword();
        Kinoko a = new Kinoko();


        //フィールドに値を入れる
        h.HP = 200;
        h.name = "ひろ";
        h2.HP = 10;
        h2.name = "ぱろ";
        w.name ="炎剣";
        w.damage = 100;
        //インスタンスする前に定義した（もたせた）クラスと
        //インスタンスで当てはめた変数を結び付ける
        h.sword = w;

        //操作する
        a.attack(h);
        a.sleep(h);
        h.WeponAttack(a);
        h.attack(a);
        h.sleep();
        h.sit(20);
        //表示の仕方は
        //持っているインスタンス変数.インスタンスされる前に定義されたフィールド.そのフィールドの中にあるフィールド
        System.out.println(h.name+"の持っている剣は"+h.sword.name+"だ");

    }
}