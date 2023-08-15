package summary07;

/*
 * コントラクタについて p351
 * インスタンスが生まれた直後（newした時）に
 * 情報を持った状態で生み出すことのできるもの
 * 
 * コンストラクタ自体を直接呼び出すことは出来ない
 * 直接呼び出すのではなくあらかじめ決められた定義のようなもの
 * 
 * コンストラクタの定義の基礎
 * public class クラス名｛
 * public クラス名（）{
 * 　　実行する処理}
 * }
 * 複数のコンストラクタが定義された場合は
 * 引数の型、数、順番に一致する一つのものが選ばれる
 * 
 * コンストラクタは必ず定義する必要がある
 * 処理内容がなくても動くようになっているのは
 * 定義がなければデフォルトとして空のコンストラクタが
 * 入るようになっているから、ただ定義を一つでもしたら
 * その定義が採用されるので注意
 * 
 * コンストラクタを作る際に重複する内容がある場合の処理　　p363
 * コンストラクタを呼び出すのはＪＶＭだけなので
 * 処理の際に直接呼び出すことはできません
 * そういう時は特別にJVMを起動させることにできるコードがある
 * 
 * 同一クラスのコンストラクタの呼び出しをJVMに依頼する
 * this(引数);
 * ※コンストラクタの先頭に必要
 * 
 */



public class Main {
    public static void main(String[] args) {

    //コンストラクタによって定義をmainメソッドで行うことができる
        Dog i = new Dog("太郎");
    //定義がいらない場合はコンストラクタの条件を変えておくと
    //その条件にあったものに合わせてくれる
       Dog i1 =new Dog();
        System.out.println(i.HP);
        System.out.println(i1.HP);
        System.out.println(i.name);
        System.out.println(i1.name);
    }
}
