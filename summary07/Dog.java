package summary07;

public class Dog{
    String name;
    int HP;

    //newされた直後にこの情報が入る
    //mainメソッドの方で定義をきめさせる方法
    public Dog(String name){
        this.HP = 100;
        this.name = name;
    }

    //新しくコンストラクタをつくることで条件の精査もできる
    // コンストラクタを作る際に重複する内容がある場合の処理
    //変わる必要のある物の方を定義する
    public Dog(){
        //this.HP = 100;
        //this.name = "ダミー";
        this("ダミー");
    }

}