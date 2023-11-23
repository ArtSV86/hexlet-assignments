package exercise;

import exercise.MinLength;
import exercise.NotNull;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

public  class Validator {
    public static List<String> validate(Object instance) {

        List<Field> fields = List.of(instance.getClass().getDeclaredFields());
        return fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class))  // отфильтровали поля с аннотацией NotNull
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);     //открываем доступ к полям
                        value = field.get(instance);
                        field.setAccessible(false);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .collect(Collectors.toList());
            }
}


