package homeworks.project.configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

public interface DatabasePaths {
    Path databasePath = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\database.txt");
    Path destroyersPath = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\destroyers.txt");
    Path trainsPath = Paths.get("C:\\Users\\User\\Desktop\\Java\\resources\\trains.txt");

}
