package com.calculadora;

import java.util.Vector;

public class PostfixCalculator implements Stack<String>, Calculator{

    Vector<String> data;

    PostfixCalculator() {
        data = new Vector<String>();
    }

    @Override
    public void add(String item) {
        data.add(item);
    }

    @Override
    public String remove() {
        return data.remove(size() - 1);
    }

    @Override
    public String peek() {
        return data.get(size() - 1);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public double calculate(String operation) {
        do {

        } while (data.size() > 0);
        return 0;
    }
}
