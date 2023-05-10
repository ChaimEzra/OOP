package newClass7;

public class Rectange {
    private int length;
    private int high;


    public int Scope(){
        return (this.length * 2) + (this.high * 2);
    }
    public int Area(){
        return this.length * this.high;

    }
    public Rectange (int length ,int high){
        this.length = length;
        this.high = high;
    }
    public String toString(){
        return "high: "+this.high+" length: "+this.length;
    }


}
