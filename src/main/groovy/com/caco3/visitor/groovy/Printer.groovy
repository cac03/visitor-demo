package com.caco3.visitor.groovy

class Printer {
    void print(Any any) {
        System.out.println("❓");
    }

    void print(Child child) {
        System.out.println("👶");
    }

    void print(Flower flower) {
        System.out.println("🌺");
    }

    void print(Unicorn unicorn) {
        System.out.println("🦄");
    }
}
