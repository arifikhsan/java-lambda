package org.example.app;

import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings({"Convert2MethodRef", "Convert2Diamond", "Convert2Lambda", "Anonymous2MethodRef"})
public class ForEachApp {
    public static void main(String[] args) {
        List<String> names = List.of("Arif", "Ikhsan", "Udin");

        // for loop
        for (String name : names) {
            System.out.println(name);
        }

        // for each anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // for each lambda expression
        Consumer<String> lambda = value -> System.out.println(value);
        names.forEach(lambda);
        names.forEach(s -> System.out.println(s));

        // lambda method reference
        names.forEach(System.out::println);
    }
}
