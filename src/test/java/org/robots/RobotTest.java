package org.robots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotTest {
    private RobotRegister robotRegister;

    @BeforeEach
    void setUp() {
        robotRegister = new RobotRegister();
        robotRegister.registerRobot(new TerrestrialRobot("TankBot", "RoboCorp", 2020, 55, TractionType.CATERPILLAR));
        robotRegister.registerRobot(new AquaticRobot("AquaRunner", "AquaTech", 2021, 500, PropulsionSystem.JET));
        robotRegister.registerRobot(new TerrestrialRobot("CaterpillarBot", "RoboCorp", 2021, 45, TractionType.CATERPILLAR));
        robotRegister.registerRobot(new AerealRobot("SkyDancer", "AereoDynamics", 2022, 300, 60));
    }

    @Test
    @DisplayName("getAllRobots() returns all registered robots")
    void getAllRobotsReturnsAll() {
        assertEquals(4, robotRegister.getAllRobots().size());
    }

    @Test
    @DisplayName("getAllDescriptions() returns correct number of descriptions")
    void getAllDescriptionsHasCorrectSize() {
        assertEquals(4, robotRegister.getAllDescriptions().size());
    }

    @Test
    @DisplayName("getTerrestrialRobotsFasterThan50() returns correct robots")
    void filterFasterThan50() {
        List<TerrestrialRobot> fast = robotRegister.getTerrestrialRobots(50);

        assertEquals(1, fast.size());
        assertEquals("TankBot", fast.get(0).getName());
    }

    @Test
    @DisplayName("findByMaker() returns correct robots")
    void findByMaker() {
        List<Robot> found = robotRegister.findByMaker("RoboCorp");

        assertEquals(2, found.size());
        assertTrue(found.stream().allMatch(r -> r.getMaker().equalsIgnoreCase("RoboCorp")));
    }

    @Test
    @DisplayName("findByManufacturer() returns empty list when no robots found")
    void findByManufacturerNotFound() {
        List<Robot> result = robotRegister.findByMaker("pepito");
        assertTrue(result.isEmpty());
    }


}
