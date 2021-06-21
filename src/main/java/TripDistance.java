class TripDistance {
    private static final double MIN_DISTANCE = 0;
    private static final String UNIT = "km";

    private double distance;

    TripDistance(double distance) {
        validateMinDistance(distance);
        this.distance = distance;
    }

    private void validateMinDistance(double distance) {
        if (distance < MIN_DISTANCE) {
            throw new IllegalArgumentException(String.format("여행 이동 거리는 %d(%s) 이상이어야 합니다.", MIN_DISTANCE, UNIT));
        }
    }

    double getDistance() {
        return distance;
    }
}
