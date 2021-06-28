package fuelinjection;

class CarReport {
    private static final String SPACE = " ";
    private static final String COLON = ":";
    private static final String LITER = "리터";
    private static final String NEWLINE = System.getProperty("line.separator");

    private Cars cars;

    private CarReport(Cars cars) {
        this.cars = cars;
    }

    static CarReport of(Cars cars) {
        return new CarReport(cars);
    }

    String generateReport() {
        StringBuffer report = new StringBuffer();
        for (Car car : cars.getCars()) {
            report.append(generateCarInfo(car));
        }
        return report.toString();
    }

    private static String generateCarInfo(Car car) {
        return car.getName() + SPACE + COLON + SPACE + (int) car.getChargeQuantity() + LITER + NEWLINE;
    }
}
