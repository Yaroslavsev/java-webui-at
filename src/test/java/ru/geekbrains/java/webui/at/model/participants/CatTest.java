package ru.geekbrains.java.webui.at.model.participants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void run() {
        Cat cat = new Cat();
        cat.setMaxRun(10);

        int actualCat = cat.run();

        Assertions.assertEquals(10, actualCat);
    }

    @Test
    void jump() {
        Cat cat = new Cat();
        cat.setMaxJump(3);

        int actualCat = cat.jump();

        Assertions.assertEquals(3, actualCat);
    }
}