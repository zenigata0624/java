package API;


public class Main {
    public static void main(String[]args){
        Hero h1 = new Hero();
        h1.setName("みなと");
        h1.sethp(100);
        h1.setjob("勇者1");
        
        Hero h2 = new Hero();
        h2.setName("叶");
        h2.sethp(100);
        h2.setjob("勇者2");
        

        Hero.setRandomMoney();

        int heroMoney = Hero.getMoney();

        if(h1.equals(h2)==true){
            System.out.println("同じです");
        }else{
            System.out.println("違います");
        }

        System.out.println(Hero.getMoney());
        System.out.println(heroMoney);

        String hero = h1.toString();
        System.out.println(hero);
        System.out.println(h2);
        

        Object o1 = new Empty();
        Object o2 = "こんにちは";

        String b = o1.toString();
        System.out.println(b);

        Empty a = new Empty();
        String s = a.toString();

        System.out.println(s);
        System.out.println(o2);
    }
}
