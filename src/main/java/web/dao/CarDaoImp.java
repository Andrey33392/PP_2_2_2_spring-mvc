package web.dao;

import org.springframework.stereotype.Component;

import web.model.Car;


import java.util.ArrayList;
import java.util.List;


@Component
public class CarDaoImp implements DaoCar {
    private static int ID;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++ID, "Citroen", "eloy", 123894));
        cars.add(new Car(++ID, "Kia", "black", 365987));
        cars.add(new Car(++ID, "Ford", "cian", 951357));
        cars.add(new Car(++ID, "Volvo", "red", 491367));
        cars.add(new Car(++ID, "Lada", "white", 369852));
    }


    @Override
    public List<Car> LIST_CARS() {
        return cars;
    }

    @Override
    public Car show(int count) {

        return cars.stream().filter(car -> car.getCount() == count).findAny().orElse(null);
    }

}
