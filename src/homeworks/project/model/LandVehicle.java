package homeworks.project.model;

public abstract class LandVehicle extends Vehicle {
    private int countOfWheels;
    private boolean automaticTransmission;

    public LandVehicle(String name, String owner, String typeOfFuel, int productionYear, int maxSpeed, double cost, int countOfWheels, boolean automaticTransmission) {
        super(name, owner, typeOfFuel, productionYear, maxSpeed, cost);
        setCountOfWheels(countOfWheels);
        this.automaticTransmission = automaticTransmission;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        if (countOfWheels > 0) {
            this.countOfWheels = countOfWheels;
        } else {
            throw new IllegalArgumentException("Invalid count of wheels");
        }
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\ncount of wheels: ")
                .append(countOfWheels)
                .append("\nautomatic transmission: ")
                .append(automaticTransmission)
                .toString();
    }
}
