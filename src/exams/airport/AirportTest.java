package exams.airport;

import exams.airport.model.Plane;
import exams.airport.service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService ps = new PlaneService();
        System.out.println("Creating first plane");
        Plane plane1 = ps.create();
        System.out.println("Creating second plane");
        Plane plane2 = ps.create();
        System.out.println("Creating third plane");
        Plane plane3 = ps.create();
        Plane[] planes = {plane1, plane2, plane3};

        System.out.println("Task 1");
        ps.printPlaneInfo(plane1);
        System.out.println("Task 2");
        ps.printSomeInfo(plane2);
        System.out.println("Task 3");
        ps.printPlaneInfo(ps.getNewerPlane(plane2, plane3));
        System.out.println("Task 4");
        System.out.println(ps.getModelOfPlaneWithMoreWingspans(plane1, plane2));
        System.out.println("Task 5");
        ps.printPlaneInfo(ps.getMostExpensive(plane1, plane2, plane3));
        System.out.println("Task 6");
        ps.printCountryOfPlaneWithSmallestSeatsCount(plane1, plane2, plane3);
        System.out.println("Task 7");
        ps.printNotMilitaryPlanes(planes);
        System.out.println("Task 8");
        ps.printMilitariesWithMoreThan100Hours(planes);
        System.out.println("Task 9");
        ps.printPlaneInfo(ps.getPlaneWithMinimalWeight(planes));
        System.out.println("Task 10");
        ps.printPlaneInfo(ps.getCheapest(planes));
        System.out.println("Task 11");
        ps.printInAscendingByYear(planes);
        System.out.println("Task 12");
        ps.printNotMilitariesInDescendingBySeats(planes);
    }
}
