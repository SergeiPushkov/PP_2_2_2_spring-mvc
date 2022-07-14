package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Dao.CarDaoImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImp implements CarService{

    private final CarDaoImp carDaoImp;
    @Autowired
    public CarServiceImp(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    @Override
    public List<Car> getCarsList(int count) {
        List<Car> cars = carDaoImp.getCarsList();
        if(count > 0 && count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
