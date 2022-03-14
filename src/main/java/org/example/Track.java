package org.example;

public class Track implements Car{
    @Override
    public void info() {
        System.out.println("Это грузовик. Он перевозит грузы.");
    }
}
