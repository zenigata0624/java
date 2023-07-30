package practice5;

public class File {
    public String acount(String folder,String filing){
    if(!folder.endsWith("¥¥")){
        folder +="¥¥";
    }
    return folder+filing;
    }
}
