package homeworks.project.interfaces;

import homeworks.project.model.Destroyer;

public interface MilitaryAirForce {
    void shoot(String coordinate);

    void giveCoordinateTo(String coordinate, Destroyer destroyer);

    void addAim(String coordinate);

    void shootLastAim();
}
