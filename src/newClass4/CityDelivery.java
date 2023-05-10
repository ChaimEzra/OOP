package newClass4;

public class CityDelivery {
    private String cityName;
    private double distance;

    public CityDelivery(String city,double distance, int count){
        this.cityName = city;
        this.distance = distance;
    }
    public double arriveTo(){
        return this.distance * 4.5;
    }
    public String getCityName(){
        return this.cityName;
    }
}
