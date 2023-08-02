package CollectionFramework;
import java.util.List;

public class destroy {

    //ワイルドカード（<?>）が使われており、List型のリストの要素の型は特定の型に限定されていません。
    //つまり、List型であれば、どんな型のリストでもこのメソッドに渡すことができます。
    public static void clear(List<?> list) {
        list.clear();
    }

 
    //List<T>型のリストと要素Tを受け取り、リストから指定した要素を削除する処理を行います。
    public static <T> void remove(List<T> list, T element) {
        list.remove(element);
    }

      
    public static void printList(List<Integer> list) {
    for (int i : list) {
        System.out.println(i);
    }
}
}
