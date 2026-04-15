package org.robots;

import java.time.LocalDate;
import java.time.Year;

public class AerialRobot extends Robot implements ResistanceEvaluable {
    public int altitudeMaxMeters;
    public int flightAutonomy;

    public AerialRobot(String name, String maker, Year creationDate, LocalDate dateRegistered, int altitudeMaxMeters, int flightAutonomy) {
        super(name, maker, creationDate, dateRegistered);
        this.altitudeMaxMeters = altitudeMaxMeters;
        this.flightAutonomy = flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return "AerialRobot{" +
                "altitudeMaxMeters=" + altitudeMaxMeters +
                ", flightAutonomy=" + flightAutonomy +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", creationDate=" + creationDate +
                ", dateRegistered=" + dateRegistered +
                '}';
    }

    private boolean isEligibleForResistanceCompetition() {
        return flightAutonomy > 60;
    }

    @Override
    public String getResistanceReport() {
        if (isEligibleForResistanceCompetition()) {
            return "AerialRobot " + name + " is eligible for the resistance competition with a flight autonomy of " + flightAutonomy + " minutes.";
        } else {
            return "AerialRobot " + name + " is not eligible for the resistance competition with a flight autonomy of only " + flightAutonomy + " minutes.";
        }
    }
}
