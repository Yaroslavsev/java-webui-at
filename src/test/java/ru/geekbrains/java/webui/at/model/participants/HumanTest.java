package ru.geekbrains.java.webui.at.model.participants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void run() {
        Human human = new Human();
        human.setMaxRun(5);

        int actualHuman = human.run();

        Assertions.assertEquals(5, actualHuman);
    }

    @Test
    void jump() {
        Human human = new Human();
        human.setMaxJump(2);

        int actualHuman = human.jump();

        Assertions.assertEquals(2, actualHuman);
    }
}