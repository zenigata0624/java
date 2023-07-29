package party;

public class Main {
 public static void main(String[] args) {
        Cleric party = new Cleric();
       party.name = "リン";
    System.out.println("戦闘開始");
       party.selfAid();
       party.pray(1);
    System.out.println("戦闘終わり");
    }
}
