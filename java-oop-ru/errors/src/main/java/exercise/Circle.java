package exercise;

// BEGIN
public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public int getSquare() {
        int square = (int) Math.round(Math.PI * Math.pow(radius, 2));
        return square;
    }
}
// END
