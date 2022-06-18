package Collect;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "three");

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println(map.get(10));
    }
}
