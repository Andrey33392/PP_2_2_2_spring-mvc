package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import web.dao.CarDao;



@Controller
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String list(Model model) {
        model.addAttribute("cars", carDao.listCars());
        return "index1";
    }


    @GetMapping("/cars/{count}")
    public String show(@PathVariable("count") int count, Model model) {
        model.addAttribute("car", carDao.show(count));

        return "cars";
    }
}
