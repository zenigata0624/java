package summary08;

//抽象クラス
//インターフェースの継承はimplementsを使う
public  abstract class Character implements Creature{
    int HP;
    String name;
    
    //抽象メソッド
    public abstract void attack();

    //インターフェースの抽象メソッド
    public abstract void run();

}
