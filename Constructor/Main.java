package Constructor;

public class Main {
    public static void main(String[]args){
        Thief t = new Thief("アサカ");

        System.out.println("名前は"+t.name+"、体力は"+t.Hp+"、MPは"+t.mp);
    }
}
