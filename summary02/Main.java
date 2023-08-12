package summary02;



/*p100~p140
 関係演算子について
 >=や==等の関係を決める演算子のこと p109参照

 論理演算子について
 &&や||等の複数の関係をつなげて決める演算子のこと p113参照

 否定演算について
 もし～でないならという状況で使うことの出来る演算子
 !で使うことができる　p114参照

 switch文について　p120 参照
　すべての条件式が一致するかを比較する状態であり
　比較する値が文字列、文字、整数の場合のみ使える

　前置判定はブロックの実行が行われないときもある（forやwhile文のelse処理）
　後置判定はブロックの実行が最低でも一回は行われる（do-while文はこちらに当てはまる)

  breakとcontinue文について p133参照
  
  breack文は繰り返し自体を中断をする処理
  continue文は部分的な周回だけを中断する処理
 */

public class Main{
    public static void main(String[]args){
        /* if文をつかった分岐の式
        else ifを使うことで条件分岐の追加も可能
        boolean型によるtrue,falseを使う分岐条件の使い方 
        条件分岐の部分としてelseが分かっている場合は省略もできるが推奨しない*/

        boolean a = true;
        String name = "名前";
        int age = 18;
        int mouth = 6;
        int count = 0;
        int ans = new java.util.Random().nextInt(4)+1;

        //普通の条件式
        if(a == true){
            System.out.println("条件があっている式");
        }
        else //省略可能
        {System.out.println("条件があわない式");}

        //複数の条件式
        if(mouth > 7 ){
          System.out.println("条件があっている式");
        }else if(mouth <= 6){
          System.out.println("条件があっている式");
        }{
          System.out.println("それ以外の式");
        }

        //switchを使った条件式
        //caseの後に入るのは＝で結びつく値
        System.out.println(ans);
        switch(ans){
            case 1:
            System.out.println("大吉");
            break;//処理の区切りをすることができる
                  //ここのbreakを消した場合に条件が当てはまるとcase2（breakのカイエあるところ）まで表示される
            case 2:
            System.out.println("凶");
            break;//breakを付け忘れると出力が続いて表示される
            case 3:
            System.out.println("吉");
            default:
            System.out.println("謎");
        }

        //continue文
        for(int i = 1; i<10; i++){
            if(i ==3){
                System.out.println("条件の時のみ表示" + i);
                continue;
            }
        }

        /*繰り返しを行うwhile文の式 */
        while(a == true&& count < 2 ){
            System.out.println("条件があうと回数指定がないのでループして表示される=>"+count);
            count++;
        }

        //do-while文による条件の初めの処理を先に行う方法
        do{
            age--;
            System.out.println("数値を一つ下げる=>"+ age);
        }while(age > 16);

        /*基本的なfor文  参照p130へ
         繰り返し処理の中にまた繰り返し処理を入れるネストについて　参照p131*/
        for(int i=1;i<3;i++){
            System.out.println("iの指定回数実行する=>"+i);
            for(int j=1; j<3; j++){
             System.out.print("jの指定回数実行する=>"+j);
             System.out.print(" ");
            }
            System.out.println("");
        }


        //論理演算子と比較演算子を使った式 

        if(age >= 20 && mouth >=7){
            System.out.println("条件があっている式");
        }else{
            System.out.println("条件があわない式");
        }

        if(name.equals("名前")||name.equals("間違い")){
            System.out.println("条件があっている式");
        }else{
            System.out.println("条件があわない式");
        }

        //否定演算子
        if(!(name.equals("斎藤"))){
            System.out.println("条件があっている式");
        }else{
            System.out.println("条件があわない式");
        }
        
    }
}