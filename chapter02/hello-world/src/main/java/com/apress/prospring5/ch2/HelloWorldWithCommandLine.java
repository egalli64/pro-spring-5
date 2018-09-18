package com.apress.prospring5.ch2;

public class HelloWorldWithCommandLine {

    public static void main(String... args) {
        System.out.println(args.length > 0 ? args[0] : "Hello World!");
    }
}
