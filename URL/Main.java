package URL;
import java.io.InputStream;
import java.net.URL;


public class Main {
        public static void main(String[]args)throws Exception{
        //ネットワークを使った呼び出し
        //InputStreamについて　webソースには自動的に閉じるシステムがあるのでclose()はいらない
        URL u = new URL("https://www.google.com/");
        //ネットワークに接続と、ソースの読み取り（Stream）を参照

        InputStream is = u.openStream();
        int i = is.read();
        while(i != -1){
            char c = (char)i;
            System.out.print(c);
            i = is.read();
        }

        }
}
