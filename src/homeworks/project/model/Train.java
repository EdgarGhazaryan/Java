package homeworks.project.model;

public class Train extends LandVehicle {
    private String typeOfRails;

    public Train(String name, String owner, String typeOfFuel, int productionYear, int maxSpeed, double cost, int countOfWheels, boolean automaticTransmission, String typeOfRails) {
        super(name, owner, typeOfFuel, productionYear, maxSpeed, cost, countOfWheels, automaticTransmission);
        setTypeOfRails(typeOfRails);
    }

    public String getTypeOfRails() {
        return typeOfRails;
    }

    public void setTypeOfRails(String typeOfRails) {
        if (typeOfRails != null && !typeOfRails.isEmpty()) {
            this.typeOfRails = typeOfRails;
        } else {
            throw new IllegalArgumentException("Invalid type of rails");
        }
    }

    @Override
    public double fuelExpense() {
        return ((double) (1 / getProductionYear())) * getMaxSpeed() * 77;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\ntype of rails: ")
                .append(typeOfRails)
                .append("\n")
                .toString();
    }
}
