package homeworks.Lesson3.models;

public class Laptop {
    private String userName;
    private String model;
    private double price;
    private int ram;
    private int memory;
    private String OS;
    private String color;

    public Laptop(String userName, String model, double price, int ram, int memory, String OS, String color) {
        this.userName = userName;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.memory = memory;
        this.OS = OS;
        this.color = color;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }
}
