package homeworks.project.menu;

import homeworks.project.service.DestroyerService;
import homeworks.project.service.TrainService;

import java.util.Scanner;

public class VehicleMenu {
    private static final Scanner s = new Scanner(System.in);

    public static void startMenu() {
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("******Start menu******");
            System.out.println("1. Train menu");
            System.out.println("2. Destroyer menu");
            System.out.println("3. Exit");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    trainMenu();
                    break;
                case 2:
                    destroyerMenu();
                    break;
                case 3:
                    isMenuActive = false;
                    exit();
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }

    private static void trainMenu() {
        TrainService trainService = TrainService.getInstance();
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("******Train menu******");
            System.out.println("1. Create new train");
            System.out.println("2. Print all trains");
            System.out.println("3. Print all trains sorted by production year");
            System.out.println("4. Print all trains sorted by cost");
            System.out.println("5. Print all trains with mentioned fuel");
            System.out.println("6. Print all trains with automatic transmission");
            System.out.println("7. Print all trains and their fuel expense");
            System.out.println("8. Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    trainService.create();
                    break;
                case 2:
                    trainService.printAll(trainService.getAllTrains());
                    break;
                case 3:
                    trainService.printByYear(trainService.getAllTrains());
                    break;
                case 4:
                    trainService.printByCost(trainService.getAllTrains());
                    break;
                case 5:
                    s.nextLine();
                    String fuel = s.nextLine();
                    trainService.printWithFuel(trainService.getAllTrains(), fuel);
                    break;
                case 6:
                    trainService.printWithAutomaticTransmission(trainService.getAllTrains());
                    break;
                case 7:
                    trainService.printVehicleAndFuelExpense(trainService.getAllTrains());
                    break;
                case 8:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }

    private static void destroyerMenu() {
        DestroyerService destroyerService = DestroyerService.getInstance();
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("******Train menu******");
            System.out.println("1. Create new destroyer");
            System.out.println("2. Print all destroyers");
            System.out.println("3. Print all destroyers sorted by age");
            System.out.println("4. Print all destroyers sorted by cost");
            System.out.println("5. Print all destroyers with mentioned fuel");
            System.out.println("6. Print all destroyers with maximal height and range of hitting");
            System.out.println("7. Print all destroyers and their fuel expense");
            System.out.println("8. Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    destroyerService.create();
                    break;
                case 2:
                    destroyerService.printAll(destroyerService.getAllDestroyers());
                    break;
                case 3:
                    destroyerService.printByYear(destroyerService.getAllDestroyers());
                    break;
                case 4:
                    destroyerService.printByCost(destroyerService.getAllDestroyers());
                    break;
                case 5:
                    s.nextLine();
                    String fuel = s.nextLine();
                    destroyerService.printWithFuel(destroyerService.getAllDestroyers(), fuel);
                    break;
                case 6:
                    double height = s.nextDouble();
                    double range = s.nextDouble();
                    destroyerService.printWithMaxHeightAndRangeOfHitting(destroyerService.getAllDestroyers(), height, range);
                    break;
                case 7:
                    destroyerService.printVehicleAndFuelExpense(destroyerService.getAllDestroyers());
                    break;
                case 8:
                    isMenuActive = false;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }

    private static void exit() {
        System.out.println("Thanks for using me. Bye");
    }
}
