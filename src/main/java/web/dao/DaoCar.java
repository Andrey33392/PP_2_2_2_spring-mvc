package web.dao;

import web.model.Car;

import java.util.List;

public interface DaoCar {


    List<Car> LIST_CARS();

    public Car show(int count);

}
