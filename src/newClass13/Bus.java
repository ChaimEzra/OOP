package newClass13;

public class Bus extends Vehicle {
    private int number;

    public Bus(int speed, int year, String color,int number) {
        super(speed, year, color);
        this.number = number;
    }

    @Override
    public void goToBase() {
        System.out.println("back to public station");
    }

}
