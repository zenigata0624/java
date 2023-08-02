package map;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //mapを使った定義
        Map<String,Integer> pref = new HashMap<>();
        pref.put("東京都",255);
        pref.put("京都府",1365);
        pref.put("熊本県",181);

        //linkedHashmapを使った定義 
        Map<String,Integer> pref2 = new LinkedHashMap<>();
        pref2.put("愛知",255);
        pref2.put("愛媛",1365);
        pref2.put("北海道",181);

        //treemapを使った定義 
        Map<String,Integer> pref3 = new TreeMap<>();
        pref3.put("和歌山",255);
        pref3.put("大阪",1365);
        pref3.put("鳥取",181);

        //呼び出すために変数に定義
        int Tokyo = pref.get("東京都");
        System.out.println("東京の人口は"+Tokyo);

        //一つ削除
        pref.remove("京都府");

        //数値の変更、書き換え
        pref.put("熊本県",183);
        int kumamoto = pref.get("熊本県");
        System.out.println("熊本の人口は"+kumamoto);

        System.out.println("登録数は"+pref.size());

        for(String key : pref.keySet()){
            int ans =pref.get(key);
            System.out.println(key+"の人口は"+ans+"です");
        }

        for(String key : pref2.keySet()){
            int ans =pref2.get(key);
            System.out.println(key+"の人口は"+ans+"です");
        }

        for(String key : pref3.keySet()){
            int ans =pref3.get(key);
            System.out.println(key+"の人口は"+ans+"です");
        }

    }
}
