package DataBase;

import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    //H2データベースのJDBCドライバをロードしています。これにより、JavaプログラムからH2データベースに接続できるようになります。
    Class.forName("org.h2.Driver");
    //データベースの接続先の指定
    String dburl = "jdbc:h2:~/test";
    //実行するSQLクエリを指定しています。この例では、"EMPLOYEES" テーブルに "NAME" 列に値 'aoki' を挿入するクエリを指定しています。
    String sql = "INSERT INTO EMPLOYEES(NAME) VALUES('aoki')";
    //データベースへ接続の確立、DriverManager.getConnection() メソッドを使用して、指定された接続URLに基づいてデータベースに接続しています。
    Connection conn = DriverManager.getConnection(dburl);
    //SQLに送信、conn.createStatement() メソッドを使用して、データベースへのステートメントを作成し、
    //それに対して executeUpdate() メソッドを呼び出してSQLクエリを実行しています。
    //executeUpdate() はUPDATE文やINSERT文などを実行するために使用されます。
    //データベースにステートメントを作ってクエリの文章をそこに代入しているようなイメージ
    conn.createStatement().executeUpdate(sql);
    //データベースを閉じる
    conn.close();
  }
}
