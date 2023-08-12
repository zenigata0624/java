package summary03;


/*
配列について　p146参照
沢山の変数をまとめて処理をしたい場合は配列を使うこと
同一種類の複数データを並び順で格納するデータ構造のこと
配列でつくるnew演算子を呼び出すと
要素がまとめて呼び出されることではなく
最初の要素のアドレスが参照される　p164　参照

要素について　p147参照
配列の一つ一つのデータのこと

添え字について　p175参照
配列から要素を呼び出す時に使われる配列変数の[]の中に入る数値


new演算子について　p149参照
　指定された型に新たに要素を作り出す

拡張forについて　p163ページ参照
配列の要素を取り出すループを簡単に書くためのもの
基本の形　for(要素の型　任意の変数名 : 配列の変数名)

ガベージコレクションについて　p168参照
配列の要素はnew演算子で作った時点では消えず
ブロックを終了しても消えないがガベージコレクションによって
どの変数からも参照されていないメモリ領域を消してくれる

nullについて　p170参照
配列変数にnullを代入した場合は配列の数と結びつかなく
なるので残された配列要素はガベージコレクションとなる

二次元配列について p172参照
要素を縦と横に並ばせたもの
基本の形は
要素の型　[] [] 配列変数名　 = new 要素の型[縦の行数][横の列数]

要素の利用は
配列変数名[行の添え字][列の添え字]

補足　配列ではないlength()で文字の数を表せる p171参照
        String lng = "文字の数を表すよ";
        System.out.println(lng.length());
 */

public class Main {
    public static void main(String[]args){

        //基本的な配列の形　
        //要素の型 [] 変数名　＝　new演算子
                int[]scores  = new int[5];
        //省略した形 p153　参照
        int[] math1 = new int[]{20,30,40,50,60};
        int[] math2 = {20,40,50};

        int[] sam = new int[10];
        int ans = 0;
        int count = 0;

        //二次元配列
        int [][] dw = new int[1][2];
        dw [0][0] = 20;
        dw [0][1] = 30;
        System.out.println("要素の獲得"+dw[0][1]);

        int[][] da = {{20,30,40},{40,50,60}};
        
        //行の要素数の表示
        System.out.println(da.length);
        //列の行数の表示
        System.out.println(da[0].length);

        System.out.println("要素の獲得"+math1[1]);
        System.out.println("要素の獲得"+math2[2]);

        //要素数の獲得方法
        int num = scores.length;
        System.out.println("要素数"+num);

        //要素の代入　デフォルトは0となっている　p153参照
        scores[1] = 30;
        System.out.println("要素の獲得"+scores[0]);
        System.out.println("要素の獲得"+scores[1]);

        //for文を使うことで配列を動かしやすくする
        //拡張forも使うことができる
         System.out.println("要素をすべて表示");
        for(int i : math1){
            System.out.println(i);
            ans += i;
            if( i >= 50 ){
                count++;
            }
        }
        int avg = ans/math1.length;
         System.out.println("合計数"+ans);
         System.out.println("平均値"+avg);
         System.out.println("50以上の数"+count);
         
         for(int i = 0; i<sam.length; i++){
            sam[i] =new java.util.Random().nextInt(4);
         }

         //拡張forはループ変数や配列の添え字を記述する必要がない
         for(int a :sam){
            switch(sam[a]){
                case 0:
                System.out.print("A ");
                break;
                case 1:
                System.out.print("B ");
                break;
                case 2:
                System.out.print("C ");
                break;
                case 3:
                System.out.print("S ");
                break;
            }
         }


    }
    
}
