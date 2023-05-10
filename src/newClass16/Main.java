package newClass16;

public class Main {
    public static void main(String[] args) {
        Point point =new Point(2,2);
        Point point1 = new Point(40,40);

        point.print();
        System.out.println(point.distanceFromOrigin());
        System.out.print(point.distanceFromPoint(point,point1));
    }
}
