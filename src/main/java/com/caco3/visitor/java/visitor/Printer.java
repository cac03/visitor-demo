package com.caco3.visitor.java.visitor;

import java.util.List;

import static com.caco3.visitor.java.visitor.Any.Flower;
import static com.caco3.visitor.java.visitor.Any.Ghost;
import static com.caco3.visitor.java.visitor.Any.Unicorn;

public class Printer implements AnyVisitor {
    @Override
    public void visitGhost(Ghost ghost) {
        System.out.println("👻 - Ghost");
    }

    @Override
    public void visitFlower(Flower flower) {
        System.out.println("🌺 - Flower");
    }

    @Override
    public void visitUnicorn(Unicorn unicorn) {
        System.out.println("🦄 - Unicorn");
    }

    public static void main(String[] args) {
        List<Any> list = List.of(
                new Ghost(),
                new Flower(),
                new Unicorn()
        );

        Printer printer = new Printer();

        for (Any any : list) {
            any.accept(printer);
        }
    }
}
