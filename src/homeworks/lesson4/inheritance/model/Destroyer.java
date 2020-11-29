package homeworks.lesson4.inheritance.model;

import homeworks.lesson4.inheritance.interfaces.MilitaryAirForce;

public class Destroyer extends AirVehicle implements MilitaryAirForce {
    private String typeOfRockets;
    private double rangeOfHitting;

    public Destroyer(String name, String owner, String typeOfFuel, int productionYear, int maxSpeed, double cost, double maxHeight, int countOfPilots, String typeOfRockets, double rangeOfHitting) {
        super(name, owner, typeOfFuel, productionYear, maxSpeed, cost, maxHeight, countOfPilots);
        setTypeOfRockets(typeOfRockets);
        setRangeOfHitting(rangeOfHitting);
    }

    public String getTypeOfRockets() {
        return typeOfRockets;
    }

    public void setTypeOfRockets(String typeOfRockets) {
        if(typeOfRockets != null && !typeOfRockets.isEmpty()) {
            this.typeOfRockets = typeOfRockets;
        } else {
            System.out.println("Invalid type of rockets");
        }
    }

    public double getRangeOfHitting() {
        return rangeOfHitting;
    }

    public void setRangeOfHitting(double rangeOfHitting) {
        if(rangeOfHitting > 0) {
            this.rangeOfHitting = rangeOfHitting;
        } else {
            System.out.println("Invalid range of hitting");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "type of rockets: " + typeOfRockets + "\n" +
                "range of hitting: " + rangeOfHitting;
    }

    @Override
    public void shoot(String coordinate) {
        System.out.println("Opened fire to target with coordinate " + coordinate);
    }

    @Override
    public void giveCoordinateTo(String coordinate, Destroyer destroyer) {
        System.out.println("Coordinate " + coordinate + "was given to destroyer: " + destroyer.getName());
    }
}
