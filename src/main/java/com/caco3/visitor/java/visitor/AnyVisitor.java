package com.caco3.visitor.java.visitor;

public interface AnyVisitor {
    void visitChild(Child child);

    void visitFlower(Flower flower);

    void visitUnicorn(Unicorn unicorn);
}
