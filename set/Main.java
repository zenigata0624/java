package set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
    public static void main(String[]args){
        //重なった物は重複しない
        Set<String>colors = new HashSet<>();
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤");
        System.out.println("色は"+colors.size()+"種類です");

        //setは順番が決まっていない
       for(String i : colors){
        System.out.println(i+"->");
       }

       //辞書順の並べ方(abc順)
       Set<String> words = new TreeSet<>();
       words.add("dog");
       words.add("cat");
       words.add("wolf");
       words.add("panda");
       
       for(String i: words){
       System.out.println(i+"=>");
       }

       //値を格納した順序に整列

       LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana"); 

        // 要素の数を表示
        System.out.println("LinkedHashSetの要素数: " + linkedHashSet.size());

        // 要素を表示
        System.out.println("LinkedHashSetの要素:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }

        // イテレータを使って要素を表示
        System.out.print("LinkedHashSetの要素: ");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
         System.out.print(iterator.next() + " ");
        }
         System.out.println();
    }
}
