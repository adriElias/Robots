package org.robots;

import java.time.LocalDate;
import java.time.Year;

public class AquaticRobot extends Robot {
    public int depthMaxMeters;
    public PropulsionSystem propulsionSystem;

    public AquaticRobot(String name, String maker, Year creationDate, LocalDate dateRegistered, int depthMaxMeters, PropulsionSystem propulsionSystem) {
        super(name, maker, creationDate, dateRegistered);
        this.depthMaxMeters = depthMaxMeters;
        this.propulsionSystem = propulsionSystem;
    }

    @Override
    public String getTechnicalDescription() {
        return "AquaticRobot{" +
                "depthMaxMeters=" + depthMaxMeters +
                ", propulsionSystem=" + propulsionSystem +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", creationDate=" + creationDate +
                ", dateRegistered=" + dateRegistered +
                '}';
    }
}
