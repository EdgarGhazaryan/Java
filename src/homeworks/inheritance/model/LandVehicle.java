package homeworks.inheritance.model;

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
            System.out.println("Invalid count of wheels");
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
        return super.toString() + "\n" +
                "count of wheels: " + countOfWheels + "\n" +
                "automatic transmission: " + automaticTransmission;
    }
}
