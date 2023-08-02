package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
  public static void main(String[]args){

    //コレクションクラスを使ったインスタンスの作成
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);

    for(int i:points){
        System.out.println(i);
    }

    //setを使った文字の入れ替え
    points.set(1,25);

    for(int i:points){
      System.out.println(i);
    }


    //for文を用いた文字列の取り出し
    ArrayList<String> names = new ArrayList<>();
    names.add("中村");
    names.add("しげき");
    names.add("こうま");

    //Iteretorを使った文字の取り出し
    Iterator<String>q = names.iterator();
    while (q.hasNext()){
      String a =q.next();
      System.out.println(a);
    }

    //普通のfor文を用いた文字列の取り出し
    for(int i = 0;i<names.size();i++){
        System.out.println(names.get(i));
    }

    //拡張forを用いた文の取り出し
        for(String s : names){
        System.out.println(s);
    }



    //特定の要素を獲得したいとき
    int a =points.get(2);
    System.out.println(a);
    

    //要素の数を出したいとき
    int b = points.size();
    System.out.println(b);

    //要素が0かの判断
    boolean c = points.isEmpty();
    System.out.println(c);

    //指定要素が含まれているか
    boolean d = points.contains(10);
    System.out.println(d);

    //何番目のいちにふくまれているか
    int e = points.indexOf(80);
    System.out.println(e);

    
    //clearやremove()は戻れ値がvoidなので他のクラスに書くこと

    // ArrayListの中身を表示
    System.out.println("ArrayList:");
    destroy.printList(points);

   // RemoveUtilsを使ってArrayListから要素を削除
    destroy.remove(points, 25);

    // 削除後のArrayListを表示
    System.out.println("ArrayList (After remove):");
    destroy.printList(points);
    

    // ClearAndRemoveUtilsを使ってArrayListをクリア
    destroy.clear(points);

    // クリア後のArrayListを表示
    System.out.println("ArrayList (After clear):");
    destroy.printList(points);


    //integerをint型に変えたいとき
    Integer l1 = Integer.valueOf(16);
    int l2 = l1.intValue();
    System.out.println(l2);

  }

}