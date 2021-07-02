package com.caco3.visitor.groovy

class Main {
    static void main(String[] args) {
        def printer = new Printer()
        def list = [new Child(), new Unicorn(), new Flower()]

        for (Any any : list) {
            printer.print(any)
        }
    }
}
