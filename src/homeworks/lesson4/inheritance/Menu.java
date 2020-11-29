package homeworks.lesson4.inheritance;

import homeworks.lesson4.inheritance.service.DestroyerService;
import homeworks.lesson4.inheritance.service.TrainService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
        boolean isActiveMenu = true;
        while (isActiveMenu) {
            System.out.println("******Start menu******");
            System.out.println("1. Train menu");
            System.out.println("2. Destroyer menu");
            System.out.println("3. Exit");
//            int n;
//            try {
//                n = s.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Enter valid number");
//                continue;
//            }
            int n = s.nextInt();
            switch (n) {
                case 1:
                    trainMenu();
                    break;
                case 2:
                    destroyerMenu();
                    break;
                case 3:
                    System.out.println("Thanks for using me. Bye");
                    isActiveMenu = false;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }

    private static void trainMenu() {
        TrainService trainService = new TrainService();
        boolean isActiveMenu = true;
        while (isActiveMenu) {
            System.out.println("******Train menu******");
            System.out.println("1. Create new train");
            System.out.println("2. Print all trains");
            System.out.println("3. Print all trains with maximal age");
            System.out.println("4. Print all trains with mentioned fuel");
            System.out.println("5. Print all trains expensive that mentioned");
            System.out.println("6. Print all trains with automatic transmission");
            System.out.println("7. Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    trainService.create();
                    break;
                case 2:
                    trainService.printAll(trainService.getAllTrains());
                    break;
                case 3:
                    int year = s.nextInt();
                    trainService.printLessThanYears(trainService.getAllTrains(), year);
                    break;
                case 4:
                    s.nextLine();
                    String fuel = s.nextLine();
                    trainService.printWithFuel(trainService.getAllTrains(), fuel);
                    break;
                case 5:
                    double cost = s.nextDouble();
                    trainService.printExpensiveThat(trainService.getAllTrains(), cost);
                    break;
                case 6:
                    trainService.printWithAutomaticTransmission(trainService.getAllTrains());
                    break;
                case 7:
                    isActiveMenu = false;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }

    private static void destroyerMenu() {
        DestroyerService destroyerService = new DestroyerService();
        boolean isActiveMenu = true;
        while (isActiveMenu) {
            System.out.println("******Train menu******");
            System.out.println("1. Create new destroyer");
            System.out.println("2. Print all destroyers");
            System.out.println("3. Print all destroyers with maximal age");
            System.out.println("4. Print all destroyers with mentioned fuel");
            System.out.println("5. Print all destroyers expensive that mentioned");
            System.out.println("6. Print all destroyers with maximal height and range of hitting");
            System.out.println("7. Go to start menu");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    destroyerService.create();
                    break;
                case 2:
                    destroyerService.printAll(destroyerService.getAllDestroyers());
                    break;
                case 3:
                    int year = s.nextInt();
                    destroyerService.printLessThanYears(destroyerService.getAllDestroyers(), year);
                    break;
                case 4:
                    s.nextLine();
                    String fuel = s.nextLine();
                    destroyerService.printWithFuel(destroyerService.getAllDestroyers(), fuel);
                    break;
                case 5:
                    double cost = s.nextDouble();
                    destroyerService.printExpensiveThat(destroyerService.getAllDestroyers(), cost);
                    break;
                case 6:
                    double height = s.nextDouble();
                    double range = s.nextDouble();
                    destroyerService.printWithMaxHeightAndRangeOfHitting(destroyerService.getAllDestroyers(), height, range);
                    break;
                case 7:
                    isActiveMenu = false;
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
    }


}
