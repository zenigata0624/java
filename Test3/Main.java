package Test3;



public class Main {
    public static void main(String[]args){
        mail();
        introduceOneself("aki",20,181.5,'虎');  
        email("aaa@ccc","頑張って","応援してるよ");
        email("bbb@nnn","別わくだよ");
        System.out.println( calcTriangleArea(10, 5));
        double ans = calcCircleArea(5.0);
        System.out.println(ans);
    }

    public static void email(String addres,String title, String text){
    System.out.println(addres +"にメールがとどいたよ");
    System.out.println(title);
    System.out.println(text);
    }

    public static void email(String addres, String text){
    System.out.println(addres +"にメールがとどいたよ");
    System.out.println("無題");
    System.out.println(text);
    }

    public static void mail(){
    String title = "こんにちは";
    String addres = "aaa@bbb";
    String text = "元気？";
    System.out.println(addres +"にメールがとどいたよ");
    System.out.println(title);
    System.out.println(text);
 }

        public static void introduceOneself(String x,int y, double a, char z){

            System.out.println("名前は"+x+"です");
            System.out.println("年齢は"+y+"です");
            System.out.println("身長は"+a+"です");
            System.out.println("干支は"+z+"です");
        }

        public static double calcTriangleArea(double bottom,double height){
            double ans = bottom*height/2;
            return ans;
        }

        public static double calcCircleArea(double redius){
            double ans = redius*redius*3.14;
            return ans;
        }
}