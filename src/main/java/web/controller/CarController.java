package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping(value = "/cars")
    public String sayCar(@RequestParam(value = "count",defaultValue = "5")int count, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW",5,500000));
        list.add(new Car("Audi",7,1000000));
        list.add(new Car("Mersedes",222,200000));
        list.add(new Car("Lada",5,50000));
        list.add(new Car("Porshe",2,800000));
        list = carService.getCarsList(list,count);
        model.addAttribute("list",list);
        return "cars";
    }
}
