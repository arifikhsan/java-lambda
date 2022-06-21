package org.example.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

@SuppressWarnings("ALL")
public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("first", "Arif");
        map.put("middle", "Ikhsan");
        map.put("last", "Udin");

        // for loop
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // for each anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ": " + value);
            }
        });

        // lambda
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
