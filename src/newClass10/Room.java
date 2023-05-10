package newClass10;

public class Room {

    private int roomNumber;
    //1-regular,2-upgrade,3-suit
    private int type;
    private boolean available;


    public int floor(){
        return this.roomNumber/100;
    }
    public int calculatePrice(){
        int totalPrice = 2000;
        if (floor() > 10){
           totalPrice += (floor() - 10) * 100;
        }
        if (this.roomNumber % 10 < 5){
           totalPrice += 200;
        }
        if (this.type == 1){
            totalPrice *= 1.5;
        }
        if (this.type == 2){
            totalPrice *= 2.5;
        }


        return totalPrice;
    }
    public boolean isAvailable(){
        return this.available;
    }
    public int getType(){
        return this.type;
    }




}
