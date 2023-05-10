package newClass4;

public class Store {
    private Delivery[] deliveries;
    private CityDelivery[] cityDeliveries;

    public String cityMostExpensiveDelivery(){
        CityDelivery result = this.cityDeliveries[0];
        for (int i = 0; i < cityDeliveries.length; i++) {
            if (cityDeliveries[i].arriveTo() > result.arriveTo()){
                result = cityDeliveries[i];
            }
        }
        return result.getCityName();
    }
    public String[] namesClientsWithExpensiveDelivery(int price){
        String[] result = new String[deliveries.length];
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i].getCost() > price){
                result[i] = deliveries[i].getClientName();
            }
        }
        return result;
    }
}
