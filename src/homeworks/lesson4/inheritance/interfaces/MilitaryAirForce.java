package homeworks.lesson4.inheritance.interfaces;

import homeworks.lesson4.inheritance.model.Destroyer;

public interface MilitaryAirForce {
    void shoot(String coordinate);
    void giveCoordinateTo(String coordinate, Destroyer destroyer);
}
