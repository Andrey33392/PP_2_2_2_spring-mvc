package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import web.service.CarService;


@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String list(Model model) {
        model.addAttribute("cars", carService.listCars());
        return "index1";
    }


    @GetMapping("/cars/{count}")
    public String show(@PathVariable("count") int count, Model model) {
        model.addAttribute("car", carService.show(count));

        return "cars";
    }
}
