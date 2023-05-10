package newClass11;

public class Item {
    private String name;
    private double cost;
    private int countAvailable;

    public double getCost(){
        return this.cost;
    }

    public boolean existsInInventory(){
        boolean exists = false;
        if (this.countAvailable > 0){
            exists = true;
        }
        return exists;
    }

    public int decrementCount(int amount){
        int result = 0;
        if (existsInInventory()){
            if (amount < this.countAvailable){
                result = this.countAvailable - amount;
                this.countAvailable = result;
            } else if (amount > this.countAvailable) {
                result = amount - this.countAvailable;
                this.countAvailable = 0;
            }
        }
        return result;
    }

}
