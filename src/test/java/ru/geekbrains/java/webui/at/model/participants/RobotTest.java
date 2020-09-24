package ru.geekbrains.java.webui.at.model.participants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void run() {
        Robot robot = new Robot();
        robot.setMaxRun(15);

        int actualRobot = robot.run();

        Assertions.assertEquals(15, actualRobot);
    }

    @Test
    void jump() {
        Robot robot = new Robot();
        robot.setMaxJump(1);

        int actualRobot = robot.jump();

        Assertions.assertEquals(1, actualRobot);
    }
}