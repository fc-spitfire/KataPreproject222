package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;
    public CarServiceImpl() {
        cars = Arrays.asList(
                new Car(1, "Audi", 2014),
                new Car(2, "BMW", 2017),
                new Car(3, "MB", 2009),
                new Car(4, "Lexus", 2013),
                new Car(5, "Acura", 2020));
    }
    @Override
    public List<Car> getCars(int count) {
        List<Car> output = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            output.add(cars.get(i));
        }
        return output;
    }
}
