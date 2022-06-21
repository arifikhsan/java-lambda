package org.example.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings("ALL")
public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Arif", "Ikhsan", "Udin"));

        // remove if anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        });

        // remove if lambda expression
        names.removeIf(s -> s.startsWith("A"));
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
