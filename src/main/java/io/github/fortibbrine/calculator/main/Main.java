package io.github.fortibbrine.calculator.main;

import io.github.fortibbrine.calculator.application.Application;

public class Main {

    private static Application application;

    public static void main(String[] args) {
        application = new Application(args);
    }
}