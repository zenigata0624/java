package mon;

public class Matango {
    public int hp;
    final int LEVEL = 10;
    public char suffix;
    public void run(){
        System.out.println("お化けキノコ"+this.suffix+"逃げ出した");
    }

    public int getHP(){
        return hp;
    }

    public char getSuffix(){
        return suffix;
    }
}
