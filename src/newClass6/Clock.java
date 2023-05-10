package newClass6;

public class Clock {
    private int seconds;
    private int minutes;
    private int hours;

    public void print(){
        if (this.hours < 10){
            System.out.print("0");
        }
        System.out.print(this.hours + ":");
        if (this.minutes < 10){
            System.out.print("0");
        }
        System.out.print(this.minutes + ":");
        if (this.seconds < 10){
            System.out.print("0");
        }
        System.out.print(this.seconds);
    }
    public boolean isValid(){
        if (this.hours < 24 && this.hours > 0 ){
            if (this.minutes < 60 && this.minutes > 0){
                if (this.seconds < 60 && this.seconds > 0){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isEarlier(Clock other){
       return this.hours < other.hours;
    }
}
