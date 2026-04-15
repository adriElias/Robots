package org.robots;

public class AquaticRobot extends Robot {
    public int depthMaxMeters;
    public PropulsionSystem propulsionSystem;

    public AquaticRobot(String name, String maker, int creationDate, int depthMaxMeters, PropulsionSystem propulsionSystem) {
        super(name, maker, creationDate, null);
        this.depthMaxMeters = depthMaxMeters;
        this.propulsionSystem = propulsionSystem;
    }

    public int getDepthMaxMeters() {
        return depthMaxMeters;
    }

    public void setDepthMaxMeters(int depthMaxMeters) {
        this.depthMaxMeters = depthMaxMeters;
    }

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(PropulsionSystem propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    @Override
    public String toString() {
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
