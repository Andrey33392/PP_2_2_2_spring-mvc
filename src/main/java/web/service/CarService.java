package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    Car show(int count);

    List<Car> listCars();

}
