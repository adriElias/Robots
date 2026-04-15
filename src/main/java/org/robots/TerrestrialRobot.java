package org.robots;

public class TerrestrialRobot extends Robot {
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
}
