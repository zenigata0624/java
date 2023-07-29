package polymorphism;

public class Wizard implements Life {
    public void run(){
        System.out.println("空を浮いて逃げる");
    }
    public void attack(){
        System.out.println("魔法で攻撃する");
    }
}
