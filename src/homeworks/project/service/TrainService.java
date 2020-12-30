package homeworks.project.service;

import homeworks.project.configuration.DatabasePaths;
import homeworks.project.model.Train;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainService extends VehicleService implements DatabasePaths {

    private static final TrainService instance = new TrainService();

    private TrainService() {
    }

    public static TrainService getInstance() {
        return instance;
    }

    public void create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter train name");
        String name = s.nextLine();
        System.out.println("Enter train owner");
        String owner = s.nextLine();
        System.out.println("Enter train type of fuel");
        String fuel = s.nextLine();
        System.out.println("Enter train production year");
        int year = s.nextInt();
        System.out.println("Enter train max speed");
        int maxSpeed = s.nextInt();
        System.out.println("Enter train cost");
        double cost = s.nextDouble();
        System.out.println("Enter train count of wheels");
        int wheels = s.nextInt();
        System.out.println("Is train transmission automatic. Enter true or false");
        boolean transmission = s.nextBoolean();
        System.out.println("Enter train type of rails");
        s.nextLine();
        String rails = s.nextLine();

        Train t;
        try {
            t = new Train(name, owner, fuel, year, maxSpeed, cost, wheels, transmission, rails);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        String data = String.join(",", t.getName(), t.getOwner(), t.getTypeOfFuel(), Integer.toString(t.getProductionYear()),
                Integer.toString(t.getMaxSpeed()), Double.toString(t.getCost()), Integer.toString(t.getCountOfWheels()),
                Boolean.toString(transmission), rails) + "\n";
        try {
            Files.write(trainsPath, data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Can`t write the train in database");
        }
    }

    public List<Train> getAllTrains() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(trainsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Train> trains = new ArrayList<>();
        for (String line : lines) {
            String[] s = line.split(",");
            trains.add(new Train(s[0], s[1], s[2], Integer.parseInt(s[3]), Integer.parseInt(s[4]), Double.parseDouble(s[5]),
                    Integer.parseInt(s[6]), Boolean.parseBoolean(s[7]), s[8]));
        }
        return trains;
    }

    public void printWithAutomaticTransmission(List<Train> trains) {
        if (trains.isEmpty()) {
            System.out.println("There is no train");
            return;
        }
        for (Train train : trains) {
            if (train.isAutomaticTransmission()) {
                System.out.println(train);
            }
        }
    }
}
