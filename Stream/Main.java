package Stream;
import java.io.*;

public class Main {
    public static void main(String[]args)throws Exception{

     try{
        FileReader fr = new FileReader("Data.txt");
        //文字となる数を変数inputで整数の数０として考えてー１になった場合まで繰り返しの処置を行う
        int input = fr.read();
        while(input != -1){
            System.out.println((char)input);
            input = fr.read();
        }
        fr.close();
    }catch(IOException e){
        e.printStackTrace();
    }
   }
}
