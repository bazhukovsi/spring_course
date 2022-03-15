package org.example;

import org.springframework.stereotype.Component;

@Component("idTrack")
public class Track implements Car{
    public Track() {
        System.out.println("Это конструктор Track");
    }

    @Override
    public void info() {
        System.out.println("Это грузовик. Он перевозит грузы.");
    }
}
