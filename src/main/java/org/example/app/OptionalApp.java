package org.example.app;

import java.util.Optional;

@SuppressWarnings("ALL")
public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Arif");

        // tidak dieksekusi
        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
        // pake optional
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(String::toUpperCase);
//        optionalNameUpper.ifPresent(value -> System.out.println("Hello " + value));

        // satu baris saja
        // Optional.ofNullable(name).map(String::toUpperCase).ifPresent(value -> System.out.println("Hello " + value));

        // or present
        // Optional.ofNullable(name).map(String::toUpperCase).ifPresentOrElse(
        //        value -> System.out.println("Hello " + value),
        //        () -> System.out.println("Hello Guest")
        // );

        // or else
        String nameupper = Optional.ofNullable(name).map(String::toUpperCase).orElse("Guest");
        System.out.println("Hello " + nameupper);
    }
}
