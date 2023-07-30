package practice5;

public class Main {
    public static void main(String[]args){
        StringBuilder sa = new StringBuilder();
        
        for(int i= 0 ; i<100; i++){
            sa.append(i+1).append(",");
        }

        String ans = sa.toString();
        String[] a = ans.split(",");
        String [] all = {ans};
        System.out.println(a[0]);
        System.out.println(all[0]);
    }
}
