package newClass13;

public abstract class  Vehicle {
    private String color;
    private int speed;
    private int year;


    public void accelerate(){
        this.speed++;
    }
    public void slowDown(){
        this.speed--;
    }
    public abstract void goToBase();

    public Vehicle(int speed,int year,String color){
        this.speed = speed;
        this.year = year;
        this.color = color;
    }

}
