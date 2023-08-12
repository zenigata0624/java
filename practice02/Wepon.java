package practice02;

public class Wepon extends Item {
    public Wepon() {
        super("名無しの剣",300);
    }

    public void move(){
        System.out.println("名前は,"+this.name+",値段は"+this.price);
    }

}
