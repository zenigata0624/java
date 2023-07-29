package API2;
import API.Hero;
public class Main {
    public static void main(String[]args){
        Hero h  = new Hero();
        h.setName("みなと");
        h.sethp(100);
        h.setjob("勇者1");
        Hero.setRandomMoney();

        final String FORMAT = "%-9s %-13s 所持金%,6d";
        String a = String.format
        (FORMAT,h.getName(),h.getjob(),Hero.getMoney());
        System.out.println(a);

        System.out.printf("製品番号 %s-%02d","SJV",3);

        String s = "abc,def,ghi";
        String[] word = s.split("[,:]");
        for(String w : word){
            System.out.println(w+"->");
        }

        String x = s.replaceAll("[beh]", "X");
        String y = s.replaceFirst("c","buy");
            System.out.println(x);
            System.out.println(y);
        
    }


}
