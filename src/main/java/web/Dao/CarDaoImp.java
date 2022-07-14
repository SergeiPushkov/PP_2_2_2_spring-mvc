package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {

    public List<Car> getCarsList() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 5, 500000));
        cars.add(new Car("Audi", 7, 1000000));
        cars.add(new Car("Mersedes", 222, 200000));
        cars.add(new Car("Lada", 5, 50000));
        cars.add(new Car("Porshe", 2, 800000));
        return cars;
    }

}
