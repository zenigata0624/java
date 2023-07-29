package API1;

public class Main {
    public static void main(String[]args){

        jadge a =new jadge();

        a.setname("MASA1771");
        System.out.println(a.getname());
        
        String s1 = "すっきり、java";
        String s2 = "java";
        String s3 = "Java";
        String s4 = "java and javaScript";
        String s5 = "Java Programming";
        String s6 = "JAVA CREAN";
        String s7 = " java main ";

        System.out.println("文字列s6の大文字を小文字にする"+s6.toLowerCase());
        System.out.println("文字列s6の小文字を大文字にする"+s7.toUpperCase());
        System.out.println("空白を削除する"+s7.trim());
        System.out.println("文字列を置き換える"+s7.replace("java",s4));

        System.out.println("文字列s5の一文字を切り出す"+s5.charAt(2));
        System.out.println("文字列s5の4文字目以降は"+s5.substring(3));
        System.out.println("文字列s5の4~8文字目以降は"+s5.substring(3,8));



        if(s4.contains("Java")){
            System.out.println("文字列s1はjavaを含んでいます");
        }

        if(s4.startsWith("java")){
          System.out.println("頭文字がjavaです。");
        }

        if(s4.endsWith("java")){
          System.out.println("javaが、末尾にあります。");
        }

        System.out.println("文字列s1で最初にjavaを含んでいる位置は"+s4.indexOf("java")+"です");
        System.out.println("文字列s1で最後にjavaを含んでいる位置は"+s4.lastIndexOf("java")+"です");

        //内容が等しいかくらべる
        if(s2.equals(s3)){
            System.out.println("s2とs3は等しい");
        }

        //大文字、小文字区別しない状態で比べる
        if(s2.equalsIgnoreCase(s3)){
            System.out.println("s2とs3のケースを区別しなければ等しい");
        }
            System.out.println("s1の長さは"+s1.length()+"です");

        //空文字でないかを調べる
        if(s1.isEmpty()){
            System.out.println("s1は空文字です");
        }
    }
}
