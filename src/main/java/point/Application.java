package point;

public class Application {
    public static void main(String[] args) {
        Point point = new Point(2, 2);
        Point movablePoint = new MovablePoint(4, 5, 5, 7);

        System.out.println("point: " + point.toString());
        System.out.print("movable point: " + movablePoint.toString());
    }
}
