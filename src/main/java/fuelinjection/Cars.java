package fuelinjection;

import java.util.Collections;
import java.util.List;

class Cars {
    private final List<Car> cars;

    Cars(List<Car> cars) {
        validateIsNotNull(cars);
        this.cars = cars;
    }

    void addCar(Car car) {
        validateIsNotNull(car);
        cars.add(car);
    }

    List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    private void validateIsNotNull(List<Car> cars) {
        if (cars == null) {
            throw new IllegalArgumentException("렌트카 목록은 null일 수 없습니다.");
        }
    }

    private void validateIsNotNull(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("렌트카가 null일 수 없습니다.");
        }
    }
}
