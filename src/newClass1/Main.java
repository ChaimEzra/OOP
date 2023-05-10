package newClass1;

public class Main {
    public static void main(String[] args) {

    }
    public static void printYear (Child[] arr ,int year ){
        int counterBoy = 0 ;
        int counterGirl = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].getYear() == year){
                if (arr[i].isBoy()){
                    counterBoy++;
                }
                else {
                    counterGirl++;
                }
            }
        }
        System.out.println(counterBoy+","+counterGirl);
    }
    public static void biggestMonth(Child[] arr){
        int cBoy = 0;
        int maxBoy = 0;
        int monthBoy = 0;
        int cGirl = 0;
        int maxGirl = 0;
        int monthGirl = 0;
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].getMonth() == i){
                    if (arr[j].isBoy()){
                        cBoy++;
                    }
                    else {
                        cGirl++;
                    }
                }
            }
            if (cBoy > maxBoy){
                maxBoy = cBoy;
                monthBoy = i;
            }
            if (cGirl > maxGirl){
                maxGirl = cGirl;
                monthGirl = i;
            }
        }
        System.out.println(monthBoy + "," + monthGirl);
    }
    public static int avgYear(Child[] arr){
        int cBoy = 0;
        int boySum = 0;
        int cGirl = 0;
        int girlSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isBoy()){
                cBoy++;
                boySum += arr[i].age();
            }
            else {
                cGirl++;
                girlSum += arr[i].age();
            }
        }
        double avgBoy = (double) boySum / cBoy;
        double avgGirl = (double) girlSum / cGirl;

        if (avgBoy > avgGirl){
            return 1;
        }
        else if (avgGirl > avgBoy){
            return -1;
        }
        else {
            return 0;
    }    }
}