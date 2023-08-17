package summary08;

import summary06.Hero;
import summary06.Kinoko;

/*継承について　p370参照
 * 以前と似通ったクラスを新しく作りたい、
 * 同じ内容の持ったクラスを残したまま
 * 追加したクラスを作りたいときに使われるもの
 * 一般的であいまいなもの（没化）から具体的なもの（特化）なものにしていく
 * （これを継承ツリーという）
 * 二つのクラスの関係を表す物ともいえる
 * 
 * 
 * 継承の基本定義　p374
 * 
 * public class 任意のクラス名　extends 親となるクラス名{
 * 親クラスとの差分メンバ（フィールドやメソッドのこと）
 * }
 * 
 * 継承をしたクラスの名前　p376
 * 元のクラスは親クラス
 * 親から引き継いだクラスは子クラスという
 * 
 * javaは　p377
 * 親クラスが複数の子クラスを持つことは許可しているが
 * 子クラスが複数の親クラスを持つ多重継承を許可していない
 * 
 * 親クラスの元にあるメソッドから再度定義すると
 * オーバーライド（上書き）される
 * 逆に定義が被らなければ追加される
 * 呼び出しをしたときは子クラスの方から
 * 呼び出しがされるようになっている p384
 * 
 * 親クラスのフィールドを継承した時に
 * フィールドの値を利用したい場合
 * superを使うと
 * 今より一つ内側のインスタンス部分を表す予約語となる
 * 
 * 
 *　基本構文
 　親インスタンス部分のフィールドを利用する
 *  super.フィールド名
 * 親インスタンス部分のメソッドを呼び出す
 * super.メソッド名（引数）
 * 
 *  全てのコンストラクタはその先頭で親クラスのコンストラクタ
 * を呼び出す必要がある
 * 親クラスのコンストラクター＞子クラスのコンストラクタと読み込んでいく
 * 子クラスのコンストラクタで親クラスのコンストラクタの定義をしないと
 * 引継ぎができておらずエラーになるので注意
 * ※定義していないのならばデフォルトが引き継がれるだけなので大丈夫
 * 基本構文
 * super(引数);
 * 
 * 
 * finalをつけたものはオーバーライド、継承できない　p380
 * クラスやメソッド自体のオーバーライド、継承をさせたくないときはfinalをつけてれば
 * オーバーライド、継承を禁止にできる、これは継承された時のヒューマンエラーを防ぐためである
 * 
 * finalのメソッドの場合は
 *メソッド自体の呼び出しは出来るけど
 *それを継承したところでのオーバーライドはできない

 *finalをつかったclassの方は
 *継承でクラス自体の継承を禁止にする

 * 例　これはオーバーライド、継承をさせないようにしている
 * public final class~~
 * public final void ~~
 * 
 * is-aの関係
 * 基本敵には継承はこの関係に当てはまるものである
 * 子クラスis-a親クラス(子クラスは、親クラスの一種である)
 * 現実世界との矛盾を生み出してしまう可能性と多様性の利用ができなく
 * なるのでis-aの関係に当てはめる事をしなければならない
 * 
 * 
 */


public class Main {
    public static void main(String[]args){
        Hero i = new Hero("まい");
        SuperHero i2 = new SuperHero("あい");
        Kinoko h = new Kinoko();
        Wepon a = new Wepon();
        Dancer b = new Dancer();

        i.run();
        //継承されたものは元のメソッドをも呼び出すことができる
        i2.run();
        i2.sit(5);
        i2.fly();
        i2.attack(h);
        System.out.println(a.name);
        b.Dance();
        b.run();
    }
}
