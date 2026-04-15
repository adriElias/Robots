package org.robots;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotRegisterTest {
    private RobotRegister robotRegister;
    private static final LocalDate LOCAL_DATE = LocalDate.of(2024, 1, 1);

    @BeforeEach
    void setUp() {
        robotRegister = new RobotRegister();
        robotRegister.registerRobot(new TerrestrialRobot("TankBot", "RoboCorp", Year.of(2020), LOCAL_DATE, 55, TractionType.CATERPILLAR));
        robotRegister.registerRobot(new AquaticRobot("AquaRunner", "AquaTech", Year.of(2021), LOCAL_DATE, 500, PropulsionSystem.JET));
        robotRegister.registerRobot(new TerrestrialRobot("CaterpillarBot", "RoboCorp", Year.of(2021), LOCAL_DATE, 45, TractionType.CATERPILLAR));
        robotRegister.registerRobot(new AerialRobot("SkyDancer", "AereoDynamics", Year.of(2022), LOCAL_DATE, 300, 60));
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
        List<TerrestrialRobot> fast = robotRegister.getTerrestrialRobotsFasterThan(50);

        assertEquals(1, fast.size());
        assertEquals("TankBot", fast.get(0).getName());
    }

    @Test
    @DisplayName("getRobotsFindByMaker() returns correct robots")
    void getRobotsFindByMaker() {
        List<Robot> found = robotRegister.getRobotsFindByMaker("RoboCorp");

        assertEquals(2, found.size());
        assertTrue(found.stream().allMatch(r -> r.getMaker().equalsIgnoreCase("RoboCorp")));
    }

    @Test
    @DisplayName("getRobotsFindByMakerNotFound() returns empty list when no robots found")
    void getRobotsFindByMakerNotFound() {
        List<Robot> result = robotRegister.getRobotsFindByMaker("pepito");
        assertTrue(result.isEmpty());
    }

}
