package Stringbuilder;

    public class Main {
     public static void main(String[]args){
        StringBuilder sb = new StringBuilder();
        //メソッドチェーン
        for(int i = 0; i<5; i++){
         sb.append("java").append(" hello").append(" world ");
        }

        String s = sb.toString();
        System.out.println(s);

        String str = "こんにちは、java";
        char[] data1 = str.toCharArray();
        str.getBytes();
        char math = data1[4];
        System.out.println(math);

        char[] data4 = {'H', 'e', 'l', 'l', 'o'};
        String str1 = new String(data4);
        System.out.println(str1); // "Hello"

    
        byte[] data2 = {72, 101, 108, 108, 111};
        String str2 = new String(data2); 
        System.out.println(str2); // "Hello"
    }
}