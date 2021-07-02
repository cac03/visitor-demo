package com.caco3.visitor.java.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Any> list = List.of(new Child(), new Flower(), new Unicorn());
        Printer printer = new Printer();
        for (Any any : list) {
            any.accept(printer);
        }
    }
}
