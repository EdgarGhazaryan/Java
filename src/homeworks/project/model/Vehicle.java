package homeworks.project.model;

import homeworks.project.interfaces.Transport;

import java.time.LocalDate;

public abstract class Vehicle implements Transport {
    private String name;
    private String owner;
    private String typeOfFuel;
    private int productionYear;
    private int maxSpeed;
    private double cost;

    public Vehicle(String name, String owner, String typeOfFuel, int productionYear, int maxSpeed, double cost) {
        setName(name);
        setOwner(owner);
        setTypeOfFuel(typeOfFuel);
        setProductionYear(productionYear);
        setMaxSpeed(maxSpeed);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid vehicle name");
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && !owner.isEmpty()) {
            this.owner = owner;
        } else {
            throw new IllegalArgumentException("Invalid owner name");
        }
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        if (typeOfFuel != null && !typeOfFuel.isEmpty()) {
            this.typeOfFuel = typeOfFuel;
        } else {
            throw new IllegalArgumentException("Invalid type of fuel");
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear >= 1886 && productionYear <= 2020) {
            this.productionYear = productionYear;
        } else {
            throw new IllegalArgumentException("Invalid production year");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Invalid max speed");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("Invalid vehicle cost");
        }
    }

    public abstract double fuelExpense();

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "owner: " + owner + "\n" +
                "type of fuel: " + typeOfFuel + "\n" +
                "production year: " + productionYear + "\n" +
                "max speed: " + maxSpeed + "\n" +
                "cost: " + cost;
    }

    @Override
    public void engineOn() {
        System.out.println("Engine start working.");
    }

    @Override
    public void engineOff() {
        System.out.println("Engine end working.");
    }

    @Override
    public int age() {
        return LocalDate.now().getYear() - productionYear;
    }
}
