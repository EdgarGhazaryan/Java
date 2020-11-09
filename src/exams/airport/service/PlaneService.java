package exams.airport.service;
import exams.airport.model.Plane;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlaneService {

    public void printPlaneInfo(Plane plane) {
        System.out.println("Model: " + plane.getModel() + "\n" +
                            "Country: " + plane.getCountry() + "\n" +
                            "Publishing year: " + plane.getYear() + "\n" +
                            "Hours in air: " + plane.getHours() + "\n" +
                            "Is military: " + plane.isMilitary() + "\n" +
                            "Type of engine: " + plane.getEngineType() + "\n" +
                            "Weight: " + plane.getWeight() + " KG" + "\n" +
                            "Wingspan: " + plane.getWingspan() + "\n" +
                            "Top speed: " + plane.getTopSpeed() + " km/h"+ "\n" +
                            "Number of seats: " + plane.getSeats() + "\n" +
                            "Cost: " + "$" + plane.getCost());
    }

    public void printSomeInfo(Plane plane) {
        if(plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost() + "\n" + "Top speed: " + plane.getTopSpeed());
        }
        else {
            System.out.println("Model: " + plane.getModel() + "\n" + "Country: " + plane.getCountry());
        }
    }

    public Plane getNewerPlane(Plane plane1, Plane plane2) {
        return (plane1.getYear() >= plane2.getYear()) ? plane1 : plane2;
    }

    public String getModelOfPlaneWithMoreWingspans(Plane plane1, Plane plane2) {
        return (plane1.getWingspan() > plane2.getWingspan()) ? plane1.getModel() : plane2.getModel();
    }

    public Plane getMostExpensive(Plane plane1, Plane plane2, Plane plane3) {
        if(plane1.getCost() >= plane2.getCost() && plane1.getCost() >= plane3.getCost()) {
            return plane1;
        }
        else if(plane2.getCost() >= plane1.getCost() && plane2.getCost() >= plane3.getCost()) {
            return plane2;
        }
        else {
            return plane3;
        }
    }

    public void printCountryOfPlaneWithSmallestSeatsCount(Plane plane1, Plane plane2, Plane plane3) {
        if(plane1.getSeats() <= plane2.getSeats() && plane1.getSeats() <= plane2.getSeats()) {
            System.out.println(plane1.getCountry());
        }
        else if(plane2.getSeats() <= plane1.getSeats() && plane2.getSeats() <= plane3.getSeats()) {
            System.out.println(plane2.getSeats());
        }
        else {
            System.out.println(plane3.getSeats());
        }
    }

    public void printNotMilitaryPlanes(Plane[] planes) {
        for(Plane p : planes) {
            if(!p.isMilitary()) {
                printPlaneInfo(p);
            }
        }
    }

    public void printMilitariesWithMoreThan100Hours(Plane[] planes) {
        for(Plane p : planes) {
            if(p.isMilitary() && p.getHours() > 100) {
                printPlaneInfo(p);
            }
        }
    }

    public Plane getPlaneWithMinimalWeight(Plane[] planes) {
        Plane result = planes[0];
        for(int i = 1; i < planes.length; ++i) {
            if(planes[i].getWeight() >= result.getWeight()) {
                result = planes[i];
            }
        }
        return result;
    }

    public Plane getCheapest(Plane[] planes) {
        Plane result = planes[planes.length - 1];
        for(int i = planes.length - 2; i >= 0; --i) {
            if(planes[i].getCost() <= result.getCost()) {
                result = planes[i];
            }
        }
        return result;
    }

    public void printInAscendingByYear(Plane[] planes) {
        boolean flag = true;
        int i = 0;
        while(flag) {
            flag = false;
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getYear() > planes[j].getYear()) {
                    Plane tmp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = tmp;
                    flag = true;
                }
            }
            ++i;
        }

        for(Plane p : planes) {
            printPlaneInfo(p);
        }
    }

    public void printNotMilitariesInDescendingBySeats(Plane[] planes) {
        boolean flag = true;
        int i = 0;
        while(flag) {
            flag = false;
            for (int j = i + 1; j < planes.length; j++) {
                if (planes[i].getSeats() > planes[j].getSeats()) {
                    Plane tmp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = tmp;
                    flag = true;
                }
            }
            ++i;
        }

        for(int k = planes.length - 1; k >= 0; --k) {
            if(!planes[k].isMilitary()) {
                printPlaneInfo(planes[k]);
            }
        }
    }

    public Plane create() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("Enter model");
        plane.setModel(s.nextLine());
        s.nextLine();
        System.out.println("Enter country");
        plane.setCountry(s.nextLine());
        s.nextLine();
        System.out.println("Enter publishing year");
        plane.setYear(s.nextInt());
        System.out.println("Enter hours in air");
        plane.setHours(s.nextInt());
        System.out.println("Enter true if plane is military, otherwise enter false");
        plane.setMilitary(s.nextBoolean());
        s.nextLine();
        System.out.println("Enter engine type");
        plane.setEngineType(s.nextLine());
        System.out.println("Enter weight");
        plane.setWeight(s.nextDouble());
        System.out.println("Enter wingspan");
        plane.setWingspan(s.nextInt());
        System.out.println("Enter top speed");
        plane.setTopSpeed(s.nextInt());
        System.out.println("Enter count of seats");
        plane.setSeats(s.nextInt());
        System.out.println("Enter cost");
        plane.setCost(s.nextDouble());
        return plane;
    }
}
