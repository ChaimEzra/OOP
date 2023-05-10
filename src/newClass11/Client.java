package newClass11;

public class Client {
    private String name;
    private Item[] toBuy;
    private int budget;

    public boolean hasEnoughBudget(){
        int howMuchHeNeed = 0;
        boolean haveEnough = false;
        for (int i = 0; i < toBuy.length; i++) {
            howMuchHeNeed += toBuy[i].getCost();
        }
        if (this.budget > howMuchHeNeed){
            haveEnough = true;
        }
        return haveEnough;
    }
    public int howMuchIsCost() {
        int hisAllCost = 0;
        for (int i = 0; i < toBuy.length; i++) {
            hisAllCost += toBuy[i].getCost();
        }
        return hisAllCost;
    }
}
