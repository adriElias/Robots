package org.robots;

public class TerrestrialRobot extends Robot implements ResistanceEvaluable {
    public int speedMaxKmH;
    public TractionType tractionType;

    public TerrestrialRobot(String name, String maker, int creationDate, int speedMaxKmH, TractionType tractionType) {
        super(name, maker, creationDate, null);
        this.speedMaxKmH = speedMaxKmH;
        this.tractionType = tractionType;
    }

    public int getSpeedMaxKmH() {
        return speedMaxKmH;
    }

    public void setSpeedMaxKmH(int speedMaxKmH) {
        this.speedMaxKmH = speedMaxKmH;
    }

    public TractionType getTractionType() {
        return tractionType;
    }

    public void setTractionType(TractionType tractionType) {
        this.tractionType = tractionType;
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

    @Override
    public boolean isEligibleForResistanceCompetition() {
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
