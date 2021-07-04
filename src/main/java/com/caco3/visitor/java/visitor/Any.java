package com.caco3.visitor.java.visitor;

public interface Any {
    class Flower implements Any {
        @Override
        public void accept(AnyVisitor anyVisitor) {
            anyVisitor.visitFlower(this);
        }
    }

    class Ghost implements Any {
        @Override
        public void accept(AnyVisitor anyVisitor) {
            anyVisitor.visitGhost(this);
        }
    }

    class Unicorn implements Any {
        @Override
        public void accept(AnyVisitor anyVisitor) {
            anyVisitor.visitUnicorn(this);
        }
    }

    void accept(AnyVisitor anyVisitor);
}
