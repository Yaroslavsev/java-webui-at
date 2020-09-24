package ru.geekbrains.java.webui.at.model.obstacles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.webui.at.model.participants.Cat;
import ru.geekbrains.java.webui.at.model.participants.Human;
import ru.geekbrains.java.webui.at.model.participants.Robot;

class TreadmillTest {

    @Test
    void isOvercomed() {
        Cat cat = new Cat();
        cat.setMaxRun(10);

        Human human = new Human();
        human.setMaxRun(5);

        Robot robot = new Robot();
        robot.setMaxRun(15);

        Treadmill treadmill = new Treadmill();
        treadmill.setLength(10);


        boolean actualCatRun = treadmill.isOvercomed(cat);
        boolean actualHumanRun = treadmill.isOvercomed(human);
        boolean actualRobotRun = treadmill.isOvercomed(robot);


        Assertions.assertTrue(actualCatRun);
        Assertions.assertFalse(actualHumanRun);
        Assertions.assertTrue(actualRobotRun);

    }
}