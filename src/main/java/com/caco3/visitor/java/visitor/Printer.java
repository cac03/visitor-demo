package com.caco3.visitor.java.visitor;

public class Printer implements AnyVisitor {
    @Override
    public void visitChild(Child child) {
        System.out.println("👶");
    }

    @Override
    public void visitFlower(Flower flower) {
        System.out.println("🌺");
    }

    @Override
    public void visitUnicorn(Unicorn unicorn) {
        System.out.println("🦄");
    }
}
