package time;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[]args)throws Exception{
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());

        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date k =f.parse("2020/09/11 01:22:45");
        System.out.println(k);

        String e =f.format(now);
        System.out.println("現在時間は"+e+"です");

        Calendar c = Calendar.getInstance();
        c.set(2019,8,22,1,23,45);
        c.set(Calendar.MONTH,10);

        Date d = c.getTime();
        System.out.println(d);


        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.printf("今年は%5d年です",y);
        

        Date past = new Date(1600705425827L); 
        System.out.println(past);
        
        long start= System.currentTimeMillis();
        long end =System.currentTimeMillis();
        System.out.println("かかった時間は"+(end-start)+"です");
    }
}
