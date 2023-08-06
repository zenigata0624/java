package TryCatch;

import java.io.FileWriter;

//close()を自動的にしてくれるコード

public class Main {
    public static void main(String[]args){
        try(FileWriter fw = new FileWriter("data.txt");){
            fw.write("hello");
        }catch(Exception e){
            System.out.println("何らかの例外が発生しました");
        }

        //例外敵状況　値が間違っている時に使う
        Person p = new Person();

        p.setAge(-23);

        //オリジナルでつくった例外の使用
        
        try{
            throw new UnsupporttedMusicException
            ("未対応のファイルでです");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
