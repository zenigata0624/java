package practice6;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[]args){
        LocalDate a1 = LocalDate.of(2020,9,24);
        LocalDate now = LocalDate.now();
        LocalDate a2 = a1.plusDays(100);
        System.out.println("現在は"+ a1);
        System.out.println("100日後は"+a2);
        DateTimeFormatter  fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("100日後は"+a2.format(fmt));
        System.out.println("現在は"+ now);
    }
}
