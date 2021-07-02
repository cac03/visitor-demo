package com.caco3.visitor.java.visitor;

public class Unicorn implements Any {
    @Override
    public void accept(AnyVisitor anyVisitor) {
        anyVisitor.visitUnicorn(this);
    }
}
