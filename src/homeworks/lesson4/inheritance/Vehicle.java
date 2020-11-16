package homeworks.lesson4.inheritance;

public class Vehicle {
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
            System.out.println("Invalid vehicle name");
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && !owner.isEmpty()) {
            this.owner = owner;
        } else {
            System.out.println("Invalid owner name");
        }
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        if (typeOfFuel != null && !typeOfFuel.isEmpty()) {
            this.typeOfFuel = typeOfFuel;
        } else {
            System.out.println("Invalid type of fuel");
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear >= 1886 && productionYear <= 2020) {
            this.productionYear = productionYear;
        } else {
            System.out.println("Invalid production year");
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println("Invalid max speed");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Invalid cost");
        }
    }

    @Override
    public String toString() {
        return  "name='" + name + "\n" +
                ", owner='" + owner + "\n" +
                ", typeOfFuel='" + typeOfFuel + "\n" +
                ", productionYear=" + productionYear + "\n" +
                ", maxSpeed=" + maxSpeed + "\n" +
                ", cost=" + cost;
    }
}
