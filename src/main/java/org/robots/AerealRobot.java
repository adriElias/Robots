package org.robots;

public class AerealRobot extends Robot {
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
    public String toString() {
        return "AerealRobot{" +
                "altitudeMaxMeters=" + altitudeMaxMeters +
                ", flightAutonomy=" + flightAutonomy +
                ", name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                ", creationDate=" + creationDate +
                ", dateRegistered=" + dateRegistered +
                '}';
    }
}
