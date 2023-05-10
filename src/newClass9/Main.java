package newClass9;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Shai","pps",3000,16);
        Worker w2 = new Worker("Shai","pps",3000,16);
        Worker w3 = new Worker("Chai","pps",3000,16);
        Worker w4 = new Worker("Whai","pps",3000,16);
        Worker w5 = new Worker("Wai","pps",3000,16);
        Worker w6 = new Worker("Chai","pps",3000,16);

        Worker[] arr = {w1,w2,w3,w4,w5,w6};
        Company C1 = new Company("www",arr);
        System.out.println(C1.mostUseName());
    }
    public String highestPayment(Company[] companies){
        Company result = companies[0];
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].totalPayments() > result.totalPayments()){
                result = companies[i];
            }
        }
        return result.getName();
    }
}
