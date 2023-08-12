package summary04;

import summary04.Mai;
import summary04.San;
import summary04.Hello;
/*
メソッド p183
複数コードをまとめてそれを一つの処理として名前を付けるもの
基本の形
public static 戻り値の型　メソッド名（引数リスト）｛
メソッドが呼び出された時の具体的な処理}

メソッドの呼び出し（基本）
メソッド名（引数リスト）

引数リストについて
リストの中身は値が入るが何も渡さなくても
（）は書く必要があるので気を付ける

　ローカル変数について　参照p199
　メソッド内で宣言した変数のこと
　その変数が属するメソッドないだけ有効な存在

　戻り値について　p200参照
 呼び出されたメソッドから、呼び出し元のメソッドへ値を返すこと
 returnはメソッドの終了も表すのでその後の処理はエラーになる
 戻り値は一つしか用意出来ないので注意

 基本の形
 public static 戻り値の型　メソッド名（引数リスト){
    メソッドが実行された時に動く処理
    return　戻り値；
 }
 　呼び出しの仕方
 　型　変数　＝メソッド名（引数リスト）;

オーバーロード　p205ページ参照
メソッドに同じ名前を付けることは基本的に許されていない、
その事をオーバーロードと呼ぶ
ただし、仮引数が異なれば同じ名前のメソッドの複数定義が
許されている、呼び出し元の実引数をみて判断してくれる

シグネチャ　p208　参照
メソッド名、引数の個数や型の並び順等の情報全てをシグネチャという
戻り値は含まれない
オーバーロードはシグネチャが重複しなければできる
仮引数はメソッド内部で使用される変数であり、
シグネチャはメソッドの名前と引数の型を含むものです。

参照渡し　p212　参照
引数をアドレスとして渡すこと
呼び出し先で加えた変更が呼び出し元にも影響する

コマンドライン引数　p215
java起動時の追加情報のこと
コマンドライン引数を使用した　基本の形
java プログラム名　引数リスト

プログラム起動時に指定したコマンドライン引数がJVMによって配列に返還
mainメソッド起動時に渡される
 */

public class Main {
    public static void main(String[]args){
        Hello h = new Hello();
        int[] a = {1,2,3};

        //メソッドの呼び出しが可能
        Hello.hello("テン");
        San.add(200, 100);

        //配列を渡すと先頭要素以降もコピーされて渡される
        Array.printArray(a);
        //参照渡しの例
        for(int i:a){
            System.out.println(i);
        }

        //戻り値に配列を用いる
        int[] array = Array.make(5);
        for(int i : array){
        System.out.println(i);
        }

        //返り値の場合
        System.out.println(Mai.add(300,200));
        System.out.println(Mai.add(1.5,2.0));
        System.out.println(Mai.add("返り値","呼び出します"));
        //インスタンス変数を使った呼び出しとインスタンスを作った呼び出し
        h.goodbye();
        new Hello().goodbye();
    }
}


/*
 * package-private（アクセス修飾子を指定しない場合）:
 *  クラスにアクセス修飾子を指定しない場合、
 * そのクラスは同じパッケージ内からのみアクセス可能となります。
 * クラス宣言の前にアクセス修飾子を書かないことで、デフォルトの可視性が設定されます。
*/

class Hello{
    //staticは独立したメソッドとして成り立つので
    //インスタンス化もする必要はない
public static void hello(String name){
    System.out.println(name+"さんおはよう");
}

  //staticがない場合独立はできていないので
  //呼び出すにはインスタンス化をする必要が生まれる
public void goodbye(){
    System.out.println("お休み");
}
}

//引数リストの数値を計算させる
class San{
    public static void add(int x,int y){
        int ans = x + y;
        System.out.println(x+"と"+y+"足すと"+ans);
    }
}

//戻り値を使った計算,オーバーロード
class Mai{
    public static int add(int x,int y){
        int ans = x*y;
        return ans;
    }
    public static double add(double x,double y){
        double ans = x*y;
        return ans;
    }
    public static String add(String x,String y){
        String ans = x+y;
        return ans;
    }
}

    //配列を使った戻り値
    //(int[] arrayはアドレス情報のみを渡している状態だが返り値がなくても呼び出し元に影響する
    //これが参照渡しである
    class Array{
        public static void printArray(int[] array){
            for(int i=0; i<array.length;i++){
                System.out.println(i);
                array[i]++;
            }
        }

        //配列の中身をint sizeとして
        //変数makeArrayの中身をiとし要素を一つずつ取り出し戻り値とする
        public static int[] make(int size){
            int [] makeArray = new int[size];
            for(int i = 0;i<makeArray.length;i++){
                makeArray[i] = i;
            }
            return makeArray;
        }
    }