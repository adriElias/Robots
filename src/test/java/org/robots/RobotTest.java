package org.robots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {
    private RobotRegister robotRegister;

    @BeforeEach
    void setUp() {
        robotRegister = new RobotRegister();
        robotRegister.registerRobot(new TerrestrialRobot("TankBot", "RoboCorp", 2020, 40, TractionType.CATERPILLAR));
        robotRegister.registerRobot(new AquaticRobot("AquaRunner", "AquaTech", 2021, 500, PropulsionSystem.JET));
    }

    @Test
    @DisplayName("getAllRobots() returns all registered robots")
    void getAllRobotsReturnsAll() {
        assertEquals(2, robotRegister.getAllRobots().size());
    }

    @Test
    @DisplayName("getAllDescriptions() returns correct number of descriptions")
    void getAllDescriptionsHasCorrectSize() {
        assertEquals(2, robotRegister.getAllDescriptions().size());
    }

}
