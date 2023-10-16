package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) throws NegativeRadiusException {
        if (circle.getRadius() < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь\nВычисление окончено");
        }
        System.out.println((int) circle.getSquare() + "\nВычисление окончено");
    }
}
// END
