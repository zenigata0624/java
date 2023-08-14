package summary05;

 //FQCN
//import summary05.Math.Calc;
import summary05.Math.Calc2;

/*クラスを使ってファイルをわけ
　わかりやすいメソッドかく p224 詳細

　JDKでの開発をしてみる　p229ページ
　自分のPCにコンパイラとインタプリンタをインストールする
　javaコマンド構文に関してはユニコードの変更により
　コマンドが変わるので別のファイルに記載　p241ページ参照

　パッケージ内での処理として扱う場合コンパイラとクラスローダーの自動判断のおかげでimportはいらなけど
　同じファイル内では自動判断を通さないのでimportが必要

　完全限定クラス、完全修飾クラス名（FQCN） p237 参照
 あるクラスから別パッケージのクラスを使用するために使う
 完全一致したクラス名を指定すること

 　FQCN　基本の形　
 　パッケージ名.クラス名
 
 javacコマンドについて　p250参照
 どのソースファイルをコンパイルするかファイルを指定して実行する
 javaコマンドについて
 どのクラスのmainメソッドを起動するかをFQCNで指定して実行する。

 FQCNでの区別のためパッケージ名自体の衝突は避けるp252参照
 javaは自社が保有しているインターネットドメインを前後逆転したものから始めるパッケージ名を
 使用することを推奨している
 パッケージ名の基本型
 例　foo.example.com　=> for.example.com
 java -verbose:class Mainについて
 java: Java ランタイムを実行するためのコマンドです。
 -verbose:class: このオプションを指定することで、クラスのロード情報を詳細に表示するように設定します。
 Main: これは実行する Java プログラムのメインクラスです。プログラムのエントリーポイントとなるクラスです。

APIを使うことでjavaの標準クラスを呼び出すことができる
javaAPIのクラスはjavaまたはjavaxがある、主な種類は　p258参照
java.lang～はimport文はいらづ自動的にimportされる
*/


public class Main{
    public static void main(String[]args){
        //入れる変数に数値を代入する
        int a = 60;
        int b = 30;
        int[] height = {122,133,455,666};

        
        //APIを使うことでjavaの標準クラスを呼び出すことができる
        java.util.Arrays.sort(height);

        for(int i : height){
            System.out.println(i);
        }

        //下の記載でメソッドを呼び出している
        //FQCNで指定もできるが省略も可能
        //int ans1 = summary05.Math.Calc.hiku(a,b);
        //省略した形

        int ans2 = Calc2.tasu(a,b);
        //System.out.println(ans1);
        System.out.println(ans2);
        //System.out.println(ans1*ans2);
        
                
    }
} 