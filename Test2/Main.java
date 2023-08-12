package Test2;

public class Main {
    public static void main(String[]args){
        int [] point = new int[4];
        double [] weight = new double[5];
        boolean [] answers = new boolean[3];
        String [] names = new String[4];
        int [] moneyList = {121902,8302,55100};

        System.out.println(point.length);
        System.out.println(weight.length);
        System.out.println(answers.length);
        System.out.println(names.length); 

        for(int i = 0; i<moneyList.length;i++){
            System.out.println(moneyList[i]);
        }
        
        for(int a : moneyList){
            System.out.println(a);
        }
        
        /* 
        int [] numbers = new int[]{3,4,9};
        System.out.println("数値を入力してください");
        for(int i :numbers){
         int imput = new java.util.Scanner(System.in).nextInt();
            if(i == imput){
                System.out.println("あたり！");
                break;
            }else{
                System.out.println("外れ");
            }
        }*/
    }
}
