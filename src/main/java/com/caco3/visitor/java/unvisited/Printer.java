package com.caco3.visitor.java.unvisited;

public class Printer {
    public void print(Any any) {
        System.out.println("❓");
    }

    public void print(Child child) {
        System.out.println("👶");
    }

    public void print(Flower flower) {
        System.out.println("🌺");
    }

    public void print(Unicorn unicorn) {
        System.out.println("🦄");
    }
}
