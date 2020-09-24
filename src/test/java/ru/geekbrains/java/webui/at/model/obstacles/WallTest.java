package ru.geekbrains.java.webui.at.model.obstacles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.webui.at.model.participants.Cat;
import ru.geekbrains.java.webui.at.model.participants.Human;
import ru.geekbrains.java.webui.at.model.participants.Robot;

class WallTest {

    @Test
    void isOvercomed() {
        Cat cat = new Cat();
        cat.setMaxJump(3);

        Human human = new Human();
        human.setMaxJump(2);

        Robot robot = new Robot();
        robot.setMaxJump(1);

        Wall wall = new Wall();
        wall.setHeight(2);


        boolean actualCatJump = wall.isOvercomed(cat);
        boolean actualHumanJump = wall.isOvercomed(human);
        boolean actualRobotJump = wall.isOvercomed(robot);


        Assertions.assertTrue(actualCatJump);
        Assertions.assertTrue(actualHumanJump);
        Assertions.assertFalse(actualRobotJump);
    }
}