package org.example.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Arif";
            }
        };

        Supplier<String> simpleSupplier = () -> "Arif";

        System.out.println(supplier.get());
        System.out.println(simpleSupplier.get());
    }
}
