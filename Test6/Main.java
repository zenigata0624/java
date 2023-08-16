package Test6;

import summary06.Hero;

public class Main{
    public static void main(String[]args){
        Hero i = new Hero("ひろ", 200);
        Poison a = new Poison('a');
        a.attack(i);
    }
}