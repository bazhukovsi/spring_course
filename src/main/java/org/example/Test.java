package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Car> cars = new ArrayList<>();
        Car car1 = new Sedan();
        Car car2 = new Track();
        cars.add(car1);
        cars.add(car2);

        for (Car car: cars) {
            car.info();
        }
    }
}
