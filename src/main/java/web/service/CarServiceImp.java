package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public Car show(int count) {
        return carDao.show(count);
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }
}
