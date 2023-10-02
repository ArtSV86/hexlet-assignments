package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

//    Flat flat = new Flat(area, balconyArea, floor);

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        double result = balconyArea + area;
        return result;
    }

    @Override
    public int compareTo(Home another) {
        double thisArea = this.getArea();
        double otherArea = another.getArea();
        if (thisArea > otherArea) {
            return 1;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "Квартира площадью " + String.valueOf(getArea()) + " метров на " + String.valueOf(floor) + " этаже";

    }
}
// END
