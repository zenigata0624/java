package API1;

public class jadge {

    private String name;


    public String getname(){
        return this.name;
    }

    public void setname(String name){
        if(PlayerName(name)){
      this.name = name;
        }else{
            System.out.println("なまえが当てはまりません");
        }
    } 

    //省略後のコード
    //[A-Z]の部分が頭文字を表していて
    //[A-Z0-9]{6}の部分が残り６文字の整合性をチェックしている
    public boolean PlayerName(String name){
        return name.matches("[A-Z][A-Z0-9]{7}");
    }

     //省略前のコード
    public boolean playername(String name){
     if(name.length() != 8){
        return false;
     }
     char first = name.charAt(0);
     if(!(first>= 'A' && first<='Z')){
        return false;
     }
     for(int i=1; i<8; i++){
     char c = name.charAt(i);
     if(!((c >= 'A'&&c<='Z')||(c >= 1 && c <= 8))){
        return false;
     }
     }
     return true;
    }
    
}
