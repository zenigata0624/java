package practice7;

import java.util.*;

public class Main {
    public static void main(String[]args){
        Hero a = new Hero("斎藤");
        Hero b = new Hero("鈴木");
        

        ArrayList<Hero> h1 = new ArrayList<>();
        h1.add(a);
        h1.add(b);
        for(Hero i : h1){
            System.out.println(i.getname());
        }
        Map<Hero,Integer> h2 = new HashMap<>();
        h2.put(a,3);
        h2.put(b,7);
        for(Hero i : h2.keySet()){
            int ans = h2.get(i);
            System.out.println(i.getname()+"が倒した敵＝"+ans);
        }

    }
}
