package homeworks.project.model;

import homeworks.project.interfaces.MilitaryAirForce;

import java.util.List;

public class Destroyer extends AirVehicle implements MilitaryAirForce {
    private String typeOfRockets;
    private double rangeOfHitting;
    private List<String> aimsToShoot;

    public Destroyer(String name, String owner, String typeOfFuel, int productionYear, int maxSpeed, double cost, double maxHeight, int countOfPilots, String typeOfRockets, double rangeOfHitting) {
        super(name, owner, typeOfFuel, productionYear, maxSpeed, cost, maxHeight, countOfPilots);
        setTypeOfRockets(typeOfRockets);
        setRangeOfHitting(rangeOfHitting);
    }

    public String getTypeOfRockets() {
        return typeOfRockets;
    }

    public void setTypeOfRockets(String typeOfRockets) {
        if (typeOfRockets != null && !typeOfRockets.isEmpty()) {
            this.typeOfRockets = typeOfRockets;
        } else {
            throw new IllegalArgumentException("Invalid type of rockets");
        }
    }

    public double getRangeOfHitting() {
        return rangeOfHitting;
    }

    public void setRangeOfHitting(double rangeOfHitting) {
        if (rangeOfHitting > 0) {
            this.rangeOfHitting = rangeOfHitting;
        } else {
            throw new IllegalArgumentException("Invalid range of hitting");
        }
    }

    public List<String> getAimsToShoot() {
        return aimsToShoot;
    }

    public void setAimsToShoot(List<String> aimsToShoot) {
        this.aimsToShoot = aimsToShoot;
    }

    @Override
    public void shoot(String coordinate) {
        System.out.println("Opened fire to target with coordinate " + coordinate);
    }

    @Override
    public void shootLastAim() {
        shoot(aimsToShoot.remove(aimsToShoot.size() - 1));
    }

    @Override
    public void giveCoordinateTo(String coordinate, Destroyer destroyer) {
        destroyer.addAim(coordinate);
        System.out.println("Coordinate " + coordinate + "was given to destroyer: " + destroyer.getName());
    }

    @Override
    public void addAim(String coordinate) {
        aimsToShoot.add(coordinate);
    }

    @Override
    public double fuelExpense() {
        return ((double) (1 / getProductionYear())) * getMaxSpeed() * 99;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\ntype of rockets: ")
                .append(typeOfRockets)
                .append("\nrange of hitting: ")
                .append(rangeOfHitting)
                .append("\naims to shoot: ")
                .append(aimsToShoot)
                .append("\n")
                .toString();
    }
}
