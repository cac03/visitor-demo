package com.caco3.visitor.java.visitor;

public class Flower implements Any {
    @Override
    public void accept(AnyVisitor anyVisitor) {
        anyVisitor.visitFlower(this);
    }
}
