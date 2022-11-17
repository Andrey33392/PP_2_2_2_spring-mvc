package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {



    public Car show(int count);

    List<Car> listCars();
}
