package TryCatch;


//Exceptionを継承し、オリジナルの例外を作り出す

public class UnsupporttedMusicException extends Exception {
    public UnsupporttedMusicException(String msg){
        super(msg);
    }
}
