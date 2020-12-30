package homeworks.project.service;

import homeworks.project.model.Vehicle;

import java.util.List;

public class VehicleService {

    public void printAll(List<? extends Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("There is no vehicle");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void printByYear(List<? extends Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("There is no vehicle");
            return;
        }

        vehicles.sort((o1, o2) -> o1.getProductionYear() - o2.getProductionYear());

        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void printWithFuel(List<? extends Vehicle> vehicles, String fuel) {
        if (vehicles.isEmpty()) {
            System.out.println("There is no vehicle");
            return;
        }
        if (fuel == null || fuel.isEmpty()) {
            System.out.println("Enter valid fuel");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfFuel().equals(fuel)) {
                System.out.println(vehicle);
            }
        }
    }

    public void printByCost(List<? extends Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("There is no vehicle");
            return;
        }

        vehicles.sort((o1, o2) -> (int) (o1.getCost() - o2.getCost()));

        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public void printVehicleAndFuelExpense(List<? extends Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("There is no vehicle");
            return;
        }
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle + "` fuel expense is: " + vehicle.fuelExpense() + "\n");
        }
    }
}
