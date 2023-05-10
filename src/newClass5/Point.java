package newClass5;

public class Point {
    private int x;
    private int y;

    public boolean isOrigin(int x,int y){
        return this.x == 0 && this.y == 0;
    }
    public void print(int x,int y){
        System.out.println("("+this.x+","+this.y+")");
    }
    public double distance(Point other){
        return Math.sqrt(Math.pow(this.x-other.x,2)+Math.pow(this.y-other.y,2));
    }
}
