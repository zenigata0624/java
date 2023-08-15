package Test4;



public class Cleric{
    String name;
    int HP = 50;
    final int MaxHP = 50;
    int MP = 10;
    final int MaxMP = 10;

    public void selfAid(){
        this.MP -= 5;
        this.HP = this.MaxHP;
        System.out.println("HPをMAXにしました"+"今のMPは"+this.MP+"です");
    }

    public void Pray(int sec){
        //（）は初期に設定したい数を０として,そこから足して上限にした数値
        //＋数値　は初期に設定したい０となる数
      int rnd = new java.util.Random().nextInt(3)+sec;
        if(this.MP==this.MaxMP){
            System.out.println("MPがMAXで回復しませんでした");
        }else{
        this.MP+=rnd;
         if(this.MaxMP>=this.MP){
        System.out.println("MPを"+rnd+"ポイント回復しました"+"今のMPは"+this.MP+"です");
        }else{
            this.MP = this.MaxMP;
        System.out.println("MPを最大まで回復しました"+"今のMPは"+this.MP+"です");}
        }
    }

    public int play(int a){
        System.out.println(a+"秒祈った");
        int i = new java.util.Random(3).nextInt(a);
        //Math.min（）で比較し、比較した小さい数をansに足している
        int ans = Math.min((this.MaxMP-this.MP),i);
        this.MP += ans;
        System.out.println("MPが"+ans+"回復した");
        System.out.println("MPを"+this.MP+"ポイントになりました");
        return ans;
    }
}
