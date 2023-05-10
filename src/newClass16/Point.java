package newClass16;

public class Point {
    private int x ;
    private int y ;

    public Point (int x , int y){
        this.x = x;
        this.y = y;
    }

    public void print(){
        System.out.print("("+this.x+","+this.y+")");
    }
    public int distanceFromOrigin(){
        int x1 = 0;
        int y1 = 0;

        return (int) Math.sqrt((this.y - y1)*(this.y - y1)+(this.x - x1)*(this.x - x1));
    }

    public int distanceFromPoint(Point point1, Point point2){
        return (int) Math.sqrt((point1.getY() - point2.getY())*(point1.getY() - point2.getY())+
                (point1.getX() - point2.getX())*(point1.getX() - point2.getX()));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
