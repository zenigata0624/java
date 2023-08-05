package Exception;

import java.io.FileWriter;
import java.io.IOException;

//省略されない例外を表すコード

public class Main {
    public static void main(String[] args) {
        // FileWriterオブジェクトの作成はtryブロックの外で行う
        FileWriter fw = null;

        try {
            // FileWriterオブジェクトの作成
            fw = new FileWriter("data.txt");
            fw.write("Hello"); // データの書き込み

            // ここで意図的に例外をスローしてエラーを発生させる
            throw new IOException("意図的なエラー発生");
        } catch (IOException e) {
            System.out.println("エラーが発生しました,"+e.getMessage());
            
            //エラー内容の表示
            e.printStackTrace();
        } finally {
            // ファイルをクローズする必要があるので、finallyブロックでクローズ処理を行う
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                System.out.println("ファイルのクローズに失敗しました");
            }
        }
    }
}