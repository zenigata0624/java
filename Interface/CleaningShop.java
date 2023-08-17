package Interface;

public class CleaningShop implements Cleaning {
    String name;
    String address;
    String phone;
    int minutes = 10;
    
    public void run() {
        // runメソッドの実装
        System.out.println("CleaningShopが稼働中です。");
    }


    public int washShirt(int s) {
        // 洗濯処理の実装
        System.out.println("Shirtを洗濯します");
        System.out.println("洗濯時は"+s+"分です");
        // 洗濯にかかる時間などの処理を実装
        return s;
    }

    public int washTowl(int t) {
        // 洗濯処理の実装
        System.out.println("Towlを洗濯します");
        System.out.println("洗濯時は"+t+"分です");
        return t;
    }

    public int washCoat(int c) {
        // 洗濯処理の実装
        System.out.println("Coatを洗濯します");
        // 洗濯にかかる時間などの処理を実装
         System.out.println("洗濯時は"+c+"分です");
        return c;
    }
}
