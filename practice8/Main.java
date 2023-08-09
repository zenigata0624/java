package practice8;

import java.io.IOException;

public class Main {
    public static void main(String[]args) throws Exception{
        try{
        String s = "あいうえお";   
        System.out.println(s.length());
        }catch(Exception e){
            System.out.println("NullPointerException 例外を検知しました");
            System.out.println("ーースタックトレースーーここから");
            e.printStackTrace();
            System.out.println("ーースタックトレースーーここまで");
        }

        
        try{
        int i = Integer.parseInt("123");
        System.out.println(i);
        }catch(NumberFormatException a){
            System.out.println("NumberFormatException 例外を検知しました");
            System.out.println("ーースタックトレースーーここから");
            a.printStackTrace();
            System.out.println("ーースタックトレースーーここまで");
        }

        System.out.println("プログラムが起動しました");
        throw new IOException();
    }
}
