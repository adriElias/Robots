package org.robots;

public class AerealRobot extends Robot implements ResistanceEvaluable {
    public int altitudeMaxMeters;
    public int flightAutonomy;

    public AerealRobot(String name, String maker, int creationDate, int altitudeMaxMeters, int flightAutonomy) {
        super(name, maker, creationDate, null);
        this.altitudeMaxMeters = altitudeMaxMeters;
        this.flightAutonomy = flightAutonomy;
    }

    public int getAltitudeMaxMeters() {
        return altitudeMaxMeters;
    }

    public void setAltitudeMaxMeters(int altitudeMaxMeters) {
        this.altitudeMaxMeters = altitudeMaxMeters;
    }

    public int getFlightAutonomy() {
        return flightAutonomy;
    }

    public void setFlightAutonomy(int flightAutonomy) {
        this.flightAutonomy = flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return "AerealRobot{" +
                "altitudeMaxMeters=" + altitudeMaxMeters +
                ", flightAutonomy=" + flightAutonomy +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", creationDate=" + creationDate +
                ", dateRegistered=" + dateRegistered +
                '}';
    }

    @Override
    public boolean isEligibleForResistanceCompetition() {
        return flightAutonomy > 60;
    }

    @Override
    public String getResistanceReport() {
        if (isEligibleForResistanceCompetition()) {
            return "AerealRobot " + name + " is eligible for the resistance competition with a flight autonomy of " + flightAutonomy + " minutes.";
        } else {
            return "AerealRobot " + name + " is not eligible for the resistance competition with a flight autonomy of only " + flightAutonomy + " minutes.";
        }
    }
}
