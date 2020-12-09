package homeworks.inheritance.service;

import homeworks.inheritance.model.Vehicle;

import java.time.LocalDate;

public class VehicleService {
    public void printAll(Vehicle[] vehicles) {
        if(vehicles.length == 0) {
            System.out.println("There is no vehicle");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void printLessThanYears(Vehicle[] vehicles, int year) {
        if(vehicles.length == 0) {
            System.out.println("There is no vehicle");
            return;
        }
        if(year < 0) {
            System.out.println("Enter valid year");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getProductionYear() >= LocalDate.now().getYear() - 10) {
                System.out.println(vehicle);
            }
        }
    }

    public void printWithFuel(Vehicle[] vehicles, String fuel) {
        if(vehicles.length == 0) {
            System.out.println("There is no vehicle");
            return;
        }
        if(fuel == null || fuel.isEmpty()) {
            System.out.println("Enter valid fuel");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfFuel().equals(fuel)) {
                System.out.println(vehicle);
            }
        }
    }


    public void printExpensiveThat(Vehicle[] vehicles, double cost) {
        if(vehicles.length == 0) {
            System.out.println("There is no vehicle");
            return;
        }
        if(cost < 0) {
            System.out.println("Enter valid cost");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getCost() >= cost) {
                System.out.println(vehicle);
            }
        }
    }

}
