package time1;
import java.time.*;
import java.time.format.*;

public class Main {
    public static void main(String[]args){

        //時刻、年の間隔等の標準API
        LocalDate a1 = LocalDate.of(2020,1,1);
        LocalDate a2 = LocalDate.of(2020,1,4);

        //三日間を表す二通りの方法
        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(a1, a2);
        LocalDate a3 = a2.plus(p2);

        System.out.println(p1);
        System.out.println(a3);

        //文字列よりlocalDateTimeの作成
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2020/09/22",fmt);


        //1000日後の計算
        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000日後は"+str);


        //現在時刻との比較
        LocalDate now = LocalDate.now();
        if(now.isAfter(ldatep)){
            System.out.println("1000日後は過去日付です");
        }

        //インスタントを使った時間の表し方
        Instant i1 = Instant.now();   
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l);


        //ZonedDatetimeの作成
        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2020,1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
        
        System.out.println(z1);
        System.out.println("東京："+z2.getYear()+z2.getMonth()+z2.getDayOfMonth());
        System.out.println("ロンドン"+z3.getYear()+z3.getMonth()+z3.getDayOfMonth());

        if(z2.isEqual(z3)){
            System.out.println("これらは同じ瞬間を示しています");

        }

       //LocalDatetimeを使ったあいまいな時間の表し方
       LocalDateTime l1 = LocalDateTime.now();
       LocalDateTime l2 = LocalDateTime.of(2002,1,1,9,5,0,0);
       ZonedDateTime z4 = l2.atZone(ZoneId.of("Europe/London"));
       LocalDateTime l3 = z4.toLocalDateTime();

       System.out.println(l1);
       System.out.println(l3);

    }
}
