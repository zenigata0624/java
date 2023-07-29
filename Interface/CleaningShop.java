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

    public Shirt washShirt(Shirt s) {
        // 洗濯処理の実装
        System.out.println("Shirtを洗濯します");
        System.out.println("洗濯時は"+minutes+"分です");
        // 洗濯にかかる時間などの処理を実装
        return new Shirt(minutes);
    }

    public Towl washTowl(Towl t) {
        // 洗濯処理の実装
        System.out.println("Towlを洗濯します");
        // 洗濯にかかる時間などの処理を実装
        int minutes = 10;
        return new Towl(minutes);
    }

    public Coat washCoat(Coat c) {
        // 洗濯処理の実装
        System.out.println("Coatを洗濯します");
        // 洗濯にかかる時間などの処理を実装
        int minutes = 20;
        return new Coat(minutes);
    }
}
