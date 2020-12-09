package homeworks.inheritance.interfaces;

import homeworks.inheritance.model.Destroyer;

public interface MilitaryAirForce {
    void shoot(String coordinate);
    void giveCoordinateTo(String coordinate, Destroyer destroyer);
}
