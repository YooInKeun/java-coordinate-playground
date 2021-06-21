class Avante extends Car {
    private static final double DISTANCE_PER_LITER = 15;
    private static final String CAR_NAME = "Avante";

    Avante(double tripDistance) {
        this.tripDistance = new TripDistance(tripDistance);
    }

    @Override
    double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    double getTripDistance() {
        return tripDistance.getDistance();
    }

    @Override
    String getName() {
        return CAR_NAME;
    }
}
