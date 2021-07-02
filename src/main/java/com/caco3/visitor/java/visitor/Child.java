package com.caco3.visitor.java.visitor;

public class Child implements Any {
    @Override
    public void accept(AnyVisitor anyVisitor) {
        anyVisitor.visitChild(this);
    }
}
