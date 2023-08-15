package Test5;

/*
 * 値渡し（プリミティブ型）:

メソッド内での計算や操作によって引数の値は変更可能ですが、元の変数の値は変わりません。
代入演算子（=）を使用してメソッドの戻り値を元の変数に代入することで、変更を反映させることができます。
参照渡し（参照型）:

メソッドに参照型の変数を渡す場合、メソッド内で変数の値が変更されると、呼び出し元の変数も変更されます。
これは参照型変数が実際のオブジェクトへの参照を保持しているためです。
フィールド内での変数は直接変更できませんが、フィールドが参照しているオブジェクト内部の値は変更可能です。
まとめ:

プリミティブ型の場合、値渡しによって元の変数の値を変えることはできません。変更したい場合は代入演算子を使用して変更を反映させる必要があります。
参照型の場合、メソッド内でオブジェクト内部の値を変更することができます。また、メソッドに参照型の変数を渡すことで、変更が呼び出し元にも反映されます。
 */

public class Main {

    //返り値で引数の数値を戻す
    public static int heal(int hp){
        hp +=20;
        return hp;
    }

    public static void heal(Thief a){
        a.hp += 10;
    }

    public static void main(String[]args){
         int baseship = 200;
        Thief i = new Thief("アサカ",baseship);
        //ここで引数として渡しているが
        //メソッド（引数）値渡しのため数は変わらない
        //変えたい場合は代入演算子をつかう（＝）
        heal(baseship);
        System.out.println(baseship+":"+i.hp);
        baseship = heal(baseship);
        System.out.println(baseship+":"+i.hp);
        heal(i);
        System.out.println(baseship+":"+i.hp);
    }
}
