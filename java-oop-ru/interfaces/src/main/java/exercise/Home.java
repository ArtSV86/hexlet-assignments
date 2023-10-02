package exercise;

// BEGIN
public interface Home {


    double getArea();

     default int compareTo(Home another) {
         return 0;
     }

}
// END
