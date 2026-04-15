package org.robots;

import java.time.LocalDate;
import java.time.Year;

public class TerrestrialRobot extends Robot implements ResistanceEvaluable {
    public int speedMaxKmH;
    public TractionType tractionType;

    public TerrestrialRobot(String name, String maker, Year creationDate, LocalDate dateRegistered, int speedMaxKmH, TractionType tractionType) {
        super(name, maker, creationDate, dateRegistered);
        this.speedMaxKmH = speedMaxKmH;
        this.tractionType = tractionType;
    }

    public int getSpeedMaxKmH() {
        return speedMaxKmH;
    }

    @Override
    public String getTechnicalDescription() {
        return "TerrestrialRobot{" +
                "speedMaxKmH=" + speedMaxKmH +
                ", tractionType=" + tractionType +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", creationDate=" + creationDate +
                ", dateRegistered=" + dateRegistered +
                '}';
    }

    private boolean isEligibleForResistanceCompetition() {
        return tractionType == TractionType.CATERPILLAR;
    }

    @Override
    public String getResistanceReport() {
        if (isEligibleForResistanceCompetition()) {
            return "TerrestrialRobot " + name + " is eligible for the resistance competition with a caterpillar traction type.";
        } else {
            return "TerrestrialRobot " + name + " is not eligible for the resistance competition with a " + tractionType + " traction type.";
        }
    }
}
