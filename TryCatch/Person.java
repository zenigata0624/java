package TryCatch;

public class Person {
    int age;
    public void setAge(int age){
        if(age<0){
            //エラーメッセージの表示
            //IllegalArgumentExceptionは、引数が不適切な場合にスローされる例外のこと
            throw new IllegalArgumentException
                ("年齢は0以上の数を指定すべきです"+age);
        }
        this.age = age;
    }
}
