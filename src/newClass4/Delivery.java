package newClass4;

public class Delivery {
    private int cost ;
    private String address ;
    private String clientName;


    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName(){
        int index = this.address.indexOf(",");
        String city = this.address.substring(index+2);
        return city;
    }
    public int getCost(){
        return this.cost;
    }
    public String getClientName(){
        int in = this.clientName.indexOf(" ");
        char ln = this.clientName.charAt(in+1);
        char fn = this.clientName.charAt(0);

        return String.valueOf(fn+ln);
    }


}
