package org.example.app;

import org.example.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Hello world!"));
        System.out.println(predicateIsLowerCase.test("HELLO WORLD!"));
        System.out.println(predicateIsLowerCase.test("hello world"));
    }
}
