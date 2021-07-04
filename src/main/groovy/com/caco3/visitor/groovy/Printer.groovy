package com.caco3.visitor.groovy

import static com.caco3.visitor.groovy.Any.Ghost
import static com.caco3.visitor.groovy.Any.Flower
import static com.caco3.visitor.groovy.Any.Unicorn

class Printer {
    void print(Any any) {
        System.out.println("❓ - Any");
    }

    void print(Ghost ghost) {
        System.out.println("👻 - Ghost");
    }

    void print(Flower flower) {
        System.out.println("🌺 - Flower");
    }

    void print(Unicorn unicorn) {
        System.out.println("🦄 - Unicorn");
    }

    static void main(String[] args) {
        List<Any> list = [new Ghost(), new Flower(), new Unicorn()]

        def printer = new Printer()

        for (Any any : list) {
            printer.print(any);
        }
    }
}
