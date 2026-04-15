package org.robots;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RobotRegister {
    private final List<Robot> robots = new ArrayList<>();

    public void registerRobot(Robot robot) {
        robots.add(robot);
    }

    public List<Robot> getAllRobots() {
        return Collections.unmodifiableList(robots);
    }

    public List<String> getAllDescriptions() {
        return robots.stream()
                .map(Robot::getTechnicalDescription)
                .collect(Collectors.toList());
    }

    public List<TerrestrialRobot> getTerrestrialRobots(double minSpeedKmh) {
        return robots.stream()
                .filter(r -> r instanceof TerrestrialRobot)
                .map(r -> (TerrestrialRobot) r)
                .filter(r -> r.getSpeedMaxKmH() > minSpeedKmh)
                .collect(Collectors.toList());
    }

    public List<Robot> findByMaker(String maker) {
        return robots.stream()
                .filter(r -> r.getMaker().equalsIgnoreCase(maker))
                .collect(Collectors.toList());
    }
}
