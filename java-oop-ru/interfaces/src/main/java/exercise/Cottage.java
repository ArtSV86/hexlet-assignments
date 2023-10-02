package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
   private int floorCount;

    Cottage cottage = new Cottage(area, floorCount);

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
        }

    @Override
    public double getArea() {
        double result = area;
        return result;
    }

    @Override
    public int compareTo(Home another) {
        if (cottage.getArea() > another.getArea()) {
            return 1;
        } else if (cottage.getArea() > another.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static String toString(Cottage cottage) {
        String infoObject =cottage.floorCount + " этажный коттедж площадью " + cottage.getArea() + " метров";
        return infoObject;

    }
}

// END
