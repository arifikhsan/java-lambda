package org.example;

public class SimpleActionApp {
    public static void main(String[] args) {
        var simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "Hello world!";
            }
        };

        System.out.println(simpleAction.action());

        SimpleAction actionLambda = () -> "Hello world!";
        System.out.println(actionLambda.action());
    }
}
