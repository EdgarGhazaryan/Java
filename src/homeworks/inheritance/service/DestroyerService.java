package homeworks.inheritance.service;

import homeworks.inheritance.model.Destroyer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class DestroyerService extends VehicleService {
    public void create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter destroyer name");
        String name = s.nextLine();
        System.out.println("Enter destroyer owner");
        String owner = s.nextLine();
        System.out.println("Enter destroyer type of fuel");
        String fuel = s.nextLine();
        System.out.println("Enter destroyer production year");
        int year = s.nextInt();
        System.out.println("Enter destroyer max speed");
        int maxSpeed = s.nextInt();
        System.out.println("Enter destroyer cost");
        double cost = s.nextDouble();
        System.out.println("Enter destroyer max height");
        double height = s.nextDouble();
        System.out.println("Enter destroyer number of counts");
        int pilots = s.nextInt();
        System.out.println("Enter destroyer type of rockets");
        s.nextLine();
        String rockets = s.nextLine();
        System.out.println("Enter destroyer range of hitting");
        double range = s.nextDouble();

        Destroyer d = new Destroyer(name, owner, fuel, year, maxSpeed, cost, height, pilots, rockets, range);
        String data = String.join(",", d.getName(), d.getOwner(), d.getTypeOfFuel(), Integer.toString(d.getProductionYear()),
                Integer.toString(d.getMaxSpeed()), Double.toString(d.getCost()), Double.toString(d.getMaxHeight()),
                Integer.toString(d.getCountOfPilots()), d.getTypeOfRockets(), Double.toString(d.getRangeOfHitting())) + "\n";
        try {
            Files.write(Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\destroyers.txt"), data.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Destroyer[] getAllDestroyers() {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\destroyers.txt");
        String[] lines = new String[0];
        try {
            lines = Files.readAllLines(path).toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Destroyer[] destroyers = new Destroyer[lines.length];
        for (int i = 0; i < lines.length; ++i) {
            String[] s = lines[i].split(",");
            destroyers[i] = new Destroyer(s[0], s[1], s[2], Integer.parseInt(s[3]), Integer.parseInt(s[4]), Double.parseDouble(s[5]),
                    Double.parseDouble(s[6]), Integer.parseInt(s[7]), s[8], Double.parseDouble(s[9]));
        }
        return destroyers;
    }

    public void printWithMaxHeightAndRangeOfHitting(Destroyer[] destroyers, double height, double range) {
        if(destroyers.length == 0) {
            System.out.println("There is no destroyer");
            return;
        }
        if(height < 0 || range < 0) {
            System.out.println("Enter valid height and range");
            return;
        }
        for(Destroyer destroyer : destroyers) {
            if(destroyer.getMaxHeight() >= height && destroyer.getRangeOfHitting() >= range) {
                System.out.println(destroyer);
            }
        }
    }
}
