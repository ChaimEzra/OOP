package newClass7;

public class Circle {
     private int XCenter;
     private int YCenter;
     private int radius;

    public double calculatePerimeter () {
        return Math.PI * 2 * this.radius;
    }
    public double calculateArea () {
        return Math.PI * this.radius * this.radius;
    }
    public String toString(){
        return "Radius: "+ this.radius + ", Center:" +
                " (" + this.XCenter + "" +
                "," + this.YCenter + ")";
    }
    public void print(){
        System.out.println("radius: "+this.radius+" Center: ("+this.XCenter+","+this.YCenter+")");
    }

    public Circle(int XCenter, int YCenter, int radius) {
        this.XCenter = XCenter;
        this.YCenter = YCenter;
        this.radius = radius;
    }

    public int getXCenter() {
        return XCenter;
    }

    public int getYCenter() {
        return YCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void setXCenter(int XCenter) {
        this.XCenter = XCenter;
    }

    public void setYCenter(int YCenter) {
        this.YCenter = YCenter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public boolean isLarger(Circle other){
        return this.calculateArea() > other.calculateArea();
    }
}
