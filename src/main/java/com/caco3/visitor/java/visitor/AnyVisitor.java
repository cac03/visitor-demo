package com.caco3.visitor.java.visitor;

import com.caco3.visitor.java.visitor.Any.Flower;
import com.caco3.visitor.java.visitor.Any.Ghost;
import com.caco3.visitor.java.visitor.Any.Unicorn;

public interface AnyVisitor {
    void visitGhost(Ghost ghost);

    void visitFlower(Flower flower);

    void visitUnicorn(Unicorn unicorn);
}
