package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public  class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> result = new LinkedHashMap<>();
        if(data1.isEmpty()) {
            for(Map.Entry<String, Object> elementData2 : data2.entrySet()) {
                result.put(elementData2.getKey(), "added");
            }
        }
        if(data2.isEmpty()) {
            for(Map.Entry<String, Object> elementData1 : data1.entrySet()) {
                result.put(elementData1.getKey(), "deleted");
            }
        }
        for (Map.Entry<String, Object> elementData1 : data1.entrySet()) {
            for (Map.Entry<String, Object> elementData2 : data2.entrySet()) {
                if (elementData1.getKey().equals(elementData2.getKey()) && elementData1.getValue().equals(elementData2.getValue())) {
                    result.put(elementData1.getKey(), "unchanged");
                } else if (elementData1.getKey().equals(elementData2.getKey()) && !elementData1.getValue().equals(elementData2.getValue())) {
                    result.put(elementData1.getKey(), "changed");
                } else if (!elementData1.getKey().equals(elementData2.getKey())) {
                    if (!result.containsKey(elementData1.getKey())) {
                        result.put(elementData1.getKey(), "deleted");
                    }
                    if (!result.containsKey(elementData2.getKey())) {
                        result.put(elementData2.getKey(), "added");
                    }
                }

            }
        }
        return result;
    }
}
//END
