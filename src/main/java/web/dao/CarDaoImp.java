package web.dao;

import org.springframework.stereotype.Component;

import web.model.Car;


import java.util.ArrayList;
import java.util.List;


@Component
public class CarDaoImp implements CarDao {
    private  int id;
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++id, "Citroen", "eloy", 123894));
        cars.add(new Car(++id, "Kia", "black", 365987));
        cars.add(new Car(++id, "Ford", "cian", 951357));
        cars.add(new Car(++id, "Volvo", "red", 491367));
        cars.add(new Car(++id, "Lada", "white", 369852));
    }


    @Override
    public List<Car> listCars() {
        return cars;
    }

    @Override
    public Car show(int count) {

        return cars.stream().filter(car -> car.getCount() == count).findAny().orElse(null);
    }

}
