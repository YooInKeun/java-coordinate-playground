import java.util.ArrayList;

class RentCompany {
    private final Cars rentCars;

    private RentCompany(Cars rentCars) {
        this.rentCars = rentCars;
    }

    static RentCompany create() {
        return new RentCompany(createEmptyRentCars());
    }

    private static Cars createEmptyRentCars() {
        return new Cars(new ArrayList<>());
    }

    void addCar(Car car) {
        rentCars.addCar(car);
    }

    String generateReport() {
        return CarReport.of(rentCars).generateReport();
    }
}
