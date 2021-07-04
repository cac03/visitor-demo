package com.caco3.visitor.java.unvisited;

import com.caco3.visitor.java.unvisited.Any.Flower;
import com.caco3.visitor.java.unvisited.Any.Ghost;
import com.caco3.visitor.java.unvisited.Any.Unicorn;

import java.util.List;

public class Printer {
    public void print(Any any) {
        System.out.println("❓ - Any");
    }

    public void print(Ghost ghost) {
        System.out.println("👻 - Ghost");
    }

    public void print(Flower flower) {
        System.out.println("🌺 - Flower");
    }

    public void print(Unicorn unicorn) {
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
            printer.print(any);
        }
    }
}
