package homeworks.inheritance.model;

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
        if(typeOfRails != null && !typeOfRails.isEmpty()) {
            this.typeOfRails = typeOfRails;
        } else {
            System.out.println("Invalid type of rails");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "type of rails: " + typeOfRails;
    }
}
