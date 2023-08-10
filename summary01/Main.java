
//出力するファイル名をここに記入

package summary01;


/*p1~p50までのまとめ
javaの動きの基本として
ソースコードの書き込み
コンパイルをしてclassファイル(バイトコード)を作る
インタプリンタ（JVM）でバイトコードから出力する
class名はファイル名と同一ではないとエラーが出るので注意*/


/*p60~p83
★文字や数字の単語を一つ一つ分けたものをオペランドという
例　y = a+5 なら a,y,5みたいなもののこと、p63参照
★　＋、ー、＝のような物は演算子と呼ぶ、p63参照
★計算に使われるものは算術演算子という、p72参照
★リテラルとは型の種類の具体的なもののことを表す、p64参照
★エスケープシーケンスは二重引用符に使われるもの、p67参照*/

/*
★ 一つだけ増やしたい場合と一つだけ減らしたい場合は
インクリメント、デクリメント演算子を使う、p74参照
★補足として後置インクリメント演算子 (a++) は、
変数 a の値を使用した後に 1 を増加させます。
つまり、評価の際には増加前、使用され、その後に増加が行われます。 
★代入時の型の自動型変換が行われる
例　long=>int型へ　float => double型へ、p80参照
キャスト演算子による強制的な型の代入することも可能だが
情報の欠落が生まれるので注意、p83参照*/


//基本の形
public class Main {
    public static void main(String[]args){
        /*フィールドに変数を入れる
        変数の形の基本は、型名 変数名 ;
        様々な型の種類はp49にかいてある*/

        char a = '因';
        String b = "複数の文字";
        String msg = b+"を合体させて表示する";
        int  x;
        x = 18;
        int y = x + 8 ;

        //変わらない数や文字にはfinalを利用する
        final double c = 3.14;

        //math.max(a,b)で比較ができる p89参照
        int d = Math.max(x,y);

        //Integer.parseInt()で文字列を数値に変換 p90参照
        String e = "30";
        int f = Integer.parseInt(e);

        //乱数の発生方法 new java.util.Random().nextInt();　p92参照
        int g = new java.util.Random().nextInt(90);
        
        //入力を受けとる方法 整数と文字列  p93参照
        System.out.println("あなたの名前は?");
         String h = new java.util.Scanner(System.in).nextLine();
         System.out.println("年齢は?");
         int i = new java.util.Scanner(System.in).nextInt();

        //ここで出力する
        System.out.println("あなたの名前は=>"+ h);
        System.out.println("年齢は=>"+i);
        System.out.println(a);
        System.out.println(b);
        System.out.println("ここで出力する");
        System.out.println(x+6);
        System.out.println(y);
        System.out.println("円周率は"+c+"です");
        System.out.println(msg);
        System.out.println("私の年齢は"+x+"です");
        //変数の書き換えも可能
        x = 20;
        System.out.println("本当の年齢は"+(x+y)+"です");

        System.out.println("大きい数字は"+d+"です");
        System.out.println("ランダムの数値を表示=>"+g);

        //System.out.printで改行せず行を繋げることが可能 p88参照
        System.out.print("私の年齢は");
        System.out.print(f);
        System.out.print("じゃない");
    }
}
