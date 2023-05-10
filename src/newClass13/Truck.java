package newClass13;

public class Truck extends Vehicle {
    private boolean isFull;

    public Truck(int speed, int year, String color,boolean isFull) {
        super(speed, year, color);
        this.isFull = isFull;
    }

    @Override
    public void goToBase() {
        System.out.println("back to truck parking");
    }
}
