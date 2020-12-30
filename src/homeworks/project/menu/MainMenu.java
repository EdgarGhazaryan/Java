package homeworks.project.menu;

public class MainMenu {

    public static void main(String[] args) {
        if (LoginMenu.loginMenu()) {
            VehicleMenu.startMenu();
        }
    }
}
