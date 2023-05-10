package newClass10;

public class Main {
    public static void main(String[] args) {

    }
    public String mostProfitable(Hotel[] hotels){
        Hotel result = hotels[0];
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i].income() > result.income()){
                result = hotels[i];
            }
        }
        return result.getName();
    }


}
