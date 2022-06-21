package org.example.app;

import java.util.function.Supplier;

@SuppressWarnings("ALL")
public class LazyApp {
    public static void main(String[] args) {
        testScore(90, () -> getName());
        testScore(60, () -> getName());

        // method reference
        testScore(60, LazyApp::getName);
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda Lulus!");
        } else {
            System.out.println("Coba lagi tahun depan");
        }
    }

    public static String getName() {
        System.out.println("method get name dipanggil");
        return "Arif";
    }
}
