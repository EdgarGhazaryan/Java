package homeworks.inheritance.service;

import homeworks.inheritance.model.Train;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class TrainService extends VehicleService {
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

        Train t = new Train(name, owner, fuel, year, maxSpeed, cost, wheels, transmission, rails);
        String data = String.join(",", t.getName(), t.getOwner(), t.getTypeOfFuel(), Integer.toString(t.getProductionYear()),
                Integer.toString(t.getMaxSpeed()), Double.toString(t.getCost()), Integer.toString(t.getCountOfWheels()),
                Boolean.toString(transmission), rails) + "\n";
        try {
            Files.write(Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\trains.txt"), data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Train[] getAllTrains() {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\trains.txt");
        String[] lines = new String[0];
        try {
            lines = Files.readAllLines(path).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Train[] trains = new Train[lines.length];
        for (int i = 0; i < lines.length; ++i) {
            String[] s = lines[i].split(",");
            trains[i] = new Train(s[0], s[1], s[2], Integer.parseInt(s[3]), Integer.parseInt(s[4]), Double.parseDouble(s[5]),
                    Integer.parseInt(s[6]), Boolean.parseBoolean(s[7]), s[8]);
        }
        return trains;
    }

    public void printWithAutomaticTransmission(Train[] trains) {
        if(trains.length == 0) {
            System.out.println("There is no train");
            return;
        }
        for(Train train : trains) {
            if(train.isAutomaticTransmission()) {
                System.out.println(train);
            }
        }
    }
}
