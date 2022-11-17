package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import web.dao.CarDaoImp;


@Controller
public class CarController {
    private final CarDaoImp carDaoImp;

    public CarController(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @GetMapping("/cars")
    public String list(Model model) {
        model.addAttribute("cars", carDaoImp.LIST_CARS());
        return "index1";
    }


    @GetMapping("/cars/{count}")
    public String show(@PathVariable("count") int count, Model model) {
        model.addAttribute("car", carDaoImp.show(count));

        return "cars";
    }
}
