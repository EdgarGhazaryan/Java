package exams.airport.model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private String engineType;
    private double weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.length() != 0) {
            this.model = model;
        }
        else {
            System.out.println("Invalid model name");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.length() != 0) {
            this.country = country;
        }
        else {
            System.out.println("Invalid country name");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1903 && year <= 2020) {
            this.year = year;
        }
        else {
            System.out.println("Invalid publishing year");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours <=  10000) {
            this.hours = hours;
        }
        else {
            System.out.println("Invalid hours count");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean millitary) {
        this.military = millitary;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(engineType.length() != 0) {
            this.engineType = engineType;
        }
        else {
            System.out.println("Invalid engine type");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 1000 && weight <= 160000) {
            this.weight = weight;
        }
        else {
            System.out.println("Invalid weight");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if(wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        }
        else {
            System.out.println("Invalid wingspan");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
        else {
            System.out.println("Invalid top speed");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats >= 0) {
            this.seats = seats;
        }
        else {
            System.out.println("Invalid seats count");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0) {
            this.cost = cost;
        }
        else {
            System.out.println("Invalid cost");
        }
    }
}
