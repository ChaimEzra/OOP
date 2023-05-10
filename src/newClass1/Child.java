package newClass1;

public class Child {
    private String name ;
    private boolean boy ;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", boy=" + boy +
                ", year=" + year +
                ", month=" + month +
                '}';
    }

    private int year  ;
    private int month ;

    public boolean isOlder(Child other){
        if (year < other.year){
            return true ;
        }
        if(this.year == other.year ){
            return month < other.month;
        }
        return false ;
    }
    public int getYear(){
        return this.year ;
    }
    public int getMonth(){
        return this.month;
    }
    public boolean isBoy(){
        return this.boy;
    }
    public int age(){
        int currentYear = 2023;
        return currentYear - year;
    }

}
