package summary08;


public class Dancer extends Character{

    public void Dance(){
        System.out.println("踊る");
    }
    
    //定義した場合はエラーにならない
    public void attack(){
        System.out.println("戦う");
    }

    public void run(){
        System.out.println("逃げる");
    }
}