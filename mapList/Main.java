package mapList;

import java.util.*;

class Hero {
public String name;
}

//自分のつくったクラスの変更について
public class Main {
    public static void main(String[]args){
        Hero h = new Hero();
        h.name = "minato";
        List<Hero> ans = new ArrayList<>();
        ans.add(h);
        //ここで上書きしてしまっているので注意が必要
        h.name = "hiroshi";
        System.out.println(ans.get(0).name);
    }
}

//HashSetやHashMapなどは正しくオーバーライドしていないと
//動かないのでequals()やhashCode()に正しい定義をすること