package time0;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[]args)throws Exception{

        //DATE型を使った時間の表し方
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());

        //SimpleDateFormatを使ったわかりやすい日付の表し方
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date k =f.parse("2020/09/11 01:22:45");
        System.out.println(k);
        String e =f.format(now);
        System.out.println("現在時間は"+e+"です");

        //Calenderを使った、年や月、時間の値の表し方
        Calendar c = Calendar.getInstance();
        c.set(2019,8,22,1,23,45);
        c.set(Calendar.MONTH,10);

        Date d = c.getTime();
        System.out.println(d);

        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.printf("今年は%5d年です",y);
 
        //エポックを用いたDATE型での表し方
        Date past = new Date(1600705425827L); 
        System.out.println(past);
        
        //エポック状態でのAPIをつかった時間の表し方
        long start= System.currentTimeMillis();
        System.out.println("かかった時間は"+(start)+"です");
    }
}
