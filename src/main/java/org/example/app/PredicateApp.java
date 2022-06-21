package org.example.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 0;
            }
        };

//         simplePredicate = (String s) -> s.isEmpty();

        System.out.println(predicate.test("Hello world!"));
        System.out.println(predicate.test(""));
    }
}
