package newClass13;

public class Ship extends Vehicle{
    private int capacity;

    public Ship(int speed, int year, String color,int capacity) {
        super(speed, year, color);
        this.capacity = capacity;
    }

    @Override
    public void goToBase() {
        System.out.println("return to deck");
    }
}
