package newClass13;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(50,2005,"black",7);
        Truck truck = new Truck(40,2011,"blue",true);
        Ship ship = new Ship(60,2010,"green",30);

        bus.goToBase();
        truck.goToBase();
        ship.goToBase();
    }
}
