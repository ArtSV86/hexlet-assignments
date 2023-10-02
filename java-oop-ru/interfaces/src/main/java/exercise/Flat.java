package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    Flat flat = new Flat(area, balconyArea, floor);

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
        if (flat.getArea() > another.getArea()) {
            return 1;
        } else if (flat.getArea() > another.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static String toString(Flat flat) {
        String infoObject = "Квартира площадью " + flat.getArea() + " метров на " + flat.floor + " этаже";
        return infoObject;

    }
}
// END
