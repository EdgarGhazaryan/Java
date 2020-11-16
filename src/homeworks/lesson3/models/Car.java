package homeworks.lesson3.models;

public class Car {
    private String ownerName;
    private String model;
    private double price;
    private String color;
    private int maxSpeed;
    private int countOfDoors;
    private boolean leftRudder;
    private boolean mechanical;

    public Car(String ownerName, String model, double price, String color, int maxSpeed, int countOfDoors, boolean leftRudder, boolean mechanical) {
        this.ownerName = ownerName;
        this.model = model;
        this.price = price;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.countOfDoors = countOfDoors;
        this.leftRudder = leftRudder;
        this.mechanical = mechanical;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public boolean isLeftRudder() {
        return leftRudder;
    }

    public void setLeftRudder(boolean leftRudder) {
        this.leftRudder = leftRudder;
    }

    public boolean isMechanical() {
        return mechanical;
    }

    public void setMechanical(boolean mechanical) {
        this.mechanical = mechanical;
    }
}
