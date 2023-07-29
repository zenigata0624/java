package practice2;

public class Wand {
    private String name;
    private double power;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name == null || name.length() < 3){
            throw new IllegalArgumentException
            ("三文字以下は制限されています");
        }
        this.name = name;
    }

    public double getPower(){
        return this.power;
    }

    public void setPower(double math){
        if(math < 0.5||math < 100){
        throw new IllegalArgumentException
            ("0.5以上で１００以下でないと制限されます");    
        }
        this.power = math;
    }
    

}
