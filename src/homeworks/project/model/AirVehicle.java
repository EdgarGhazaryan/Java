package homeworks.project.model;

public abstract class AirVehicle extends Vehicle {
    private double maxHeight;
    private int countOfPilots;

    public AirVehicle(String name, String owner, String typeOfFuel, int productionYear, int maxSpeed, double cost, double maxHeight, int countOfPilots) {
        super(name, owner, typeOfFuel, productionYear, maxSpeed, cost);
        setMaxHeight(maxHeight);
        setCountOfPilots(countOfPilots);
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(double maxHeight) {
        if (maxHeight > 0) {
            this.maxHeight = maxHeight;
        } else {
            throw new IllegalArgumentException("Invalid max weight");
        }
    }

    public int getCountOfPilots() {
        return countOfPilots;
    }

    public void setCountOfPilots(int countOfPilots) {
        if (countOfPilots >= 0) {
            this.countOfPilots = countOfPilots;
        } else {
            throw new IllegalArgumentException("Invalid count of pilots");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "max height: " + maxHeight + "\n" +
                "count of pilots: " + countOfPilots;
    }
}
