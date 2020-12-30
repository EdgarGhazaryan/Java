package homeworks.project.menu;

import homeworks.project.service.UserService;

import java.util.Scanner;

public class LoginMenu {
    private static final Scanner s = new Scanner(System.in);

    public static boolean loginMenu() {
        boolean isMenuActive = true;
        UserService userService = UserService.getInstance();
        while (isMenuActive) {
            System.out.println("******Login menu******");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    if (userService.login()) {
                        return true;
                    }
                    break;
                case 2:
                    userService.register();
                    break;
                case 3:
                    isMenuActive = false;
                    exit();
                    break;
                default:
                    System.out.println("Enter valid number");
            }
        }
        return false;
    }

    private static void exit() {
        System.out.println("Thanks for using me. Bye");
    }
}
