package practice4;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[]args){
        Date d1 = new Date();
        Calendar d2 =  Calendar.getInstance();

        d2.setTime(d1);
        int day = d2.get(Calendar.DAY_OF_MONTH);
        day +=100;
        Date d =d2.getTime();
        System.out.println(d);
        System.out.println(day);

        Date ans = d2.getTime();
        SimpleDateFormat f = new SimpleDateFormat("yyyy年/MM月/dd日 HH:mm:ss");
        System.out.println(f.format(ans));
    }
}
