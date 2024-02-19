package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (Method method : Address.class.getDeclaredMethods()) {

            // Проверяем, есть ли у метода аннотация @Inspect
            if (method.isAnnotationPresent(Inspect.class)) {

                try {
                    // Выполняем метод с аннотацией Inspect
                    method.invoke(address);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (method.getName().equals("getCity")) {
                    String type = "String";
                    System.out.println("Method " + method.getName() + " returns a value of type " + type);
                }
                if (method.getName().equals("getPostalCode")) {
                    String type = "int";
                    System.out.println("Method " + method.getName() + " returns a value of type " + type);
                }
            }
        }
        // END
    }
}
