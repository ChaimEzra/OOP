package newClass10;

public class Hotel {
    private String name;
    private Room[] rooms;

    public Room[] roomsForYou(int type,int budget){
        Room[] result = new Room[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isAvailable() && rooms[i].getType() == type && rooms[i].calculatePrice() < budget){
                result[i] = rooms[i];
            }

        }
        return result;
    }
    public int income(){
        int result = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].isAvailable()){
                result += rooms[i].calculatePrice();
            }
        }
        return result;
    }
    public String getName(){
        return this.name;
    }
}
