package ru.geekbrains.java.webui.at.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoxTest {

    Apple apple = new Apple(1f);
    Orange orange = new Orange(1.5f);

    @Test
    void getWeight() {
        Box<Apple> appleBox = getAppleBox(apple);
        Box<Apple> smallAppleBox = getSmallAppleBox(apple);

        Box<Orange> orangeBox = getOrangeBox(orange);
        Box<Orange> smallOrangeBox = getSmallOrangeBox(orange);

        Box<Apple> emptyAppleBox = getEmptyAppleBox();
        Box<Orange> emptyOrangeBox = getEmptyOrangeBox();



        Assertions.assertEquals(5, appleBox.getWeight());
        Assertions.assertEquals(3, smallAppleBox.getWeight());
        Assertions.assertEquals(4.5, orangeBox.getWeight(), 0.00);
        Assertions.assertEquals(3, smallOrangeBox.getWeight());
        Assertions.assertEquals(0, emptyAppleBox.getWeight());
        Assertions.assertEquals(0, emptyOrangeBox.getWeight());
    }

    @Test
    void compare() {
        Box<Apple> appleBox = getAppleBox(apple);
        Box<Orange> orangeBox = getOrangeBox(orange);

        Box<Apple> smallAppleBox = getSmallAppleBox(apple);
        Box<Orange> smallOrangeBox = getSmallOrangeBox(orange);



        Assertions.assertFalse(appleBox.compare(orangeBox));
        Assertions.assertTrue(smallAppleBox.compare(smallOrangeBox));
    }

    @Test
    void addToBox() {
        Box<Apple> smallAppleBox = getSmallAppleBox(apple);
        Box<Orange> smallOrangeBox = getSmallOrangeBox(orange);
        Box<Apple> emptyAppleBox = getEmptyAppleBox();
        Box<Orange> emptyOrangeBox = getEmptyOrangeBox();



        smallAppleBox.addToBox(apple);
        smallOrangeBox.addToBox(orange);
        emptyAppleBox.addToBox(apple);
        emptyOrangeBox.addToBox(orange);



        Assertions.assertEquals(smallAppleBox.getContent().size(), 4);
        Assertions.assertEquals(smallOrangeBox.getContent().size(), 3);
        Assertions.assertEquals(emptyAppleBox.getContent().size(), 1);
        Assertions.assertEquals(emptyOrangeBox.getContent().size(), 1);
    }

    @Test
    void pourToBox() {
        Box<Apple> appleBox = getAppleBox(apple);
        Box<Apple> smallAppleBox = getSmallAppleBox(apple);

        Box<Orange> orangeBox = getOrangeBox(orange);
        Box<Orange> smallOrangeBox = getSmallOrangeBox(orange);

        Box<Apple> emptyAppleBox = getEmptyAppleBox();
        Box<Orange> emptyOrangeBox = getEmptyOrangeBox();



        appleBox.pourToBox(smallAppleBox, apple);
        appleBox.pourToBox(emptyAppleBox, apple);
        orangeBox.pourToBox(smallOrangeBox, orange);
        orangeBox.pourToBox(emptyOrangeBox, orange);



        Assertions.assertEquals(appleBox.getContent().size(), 3);
        Assertions.assertEquals(smallAppleBox.getContent().size(), 4);
        Assertions.assertEquals(emptyAppleBox.getContent().size(), 1);
        Assertions.assertEquals(orangeBox.getContent().size(), 1);
        Assertions.assertEquals(smallOrangeBox.getContent().size(), 3);
        Assertions.assertEquals(emptyOrangeBox.getContent().size(), 1);
    }

    private Box<Apple> getAppleBox(Apple apple) {
        Box<Apple> appleBox = new Box<Apple>();
        appleBox.addToBox(apple);
        appleBox.addToBox(apple);
        appleBox.addToBox(apple);
        appleBox.addToBox(apple);
        appleBox.addToBox(apple);
        return appleBox;
    }

    private Box<Apple> getSmallAppleBox(Apple apple) {
        Box<Apple> smallAppleBox = new Box<Apple>();
        smallAppleBox.addToBox(apple);
        smallAppleBox.addToBox(apple);
        smallAppleBox.addToBox(apple);
        return smallAppleBox;
    }

    private Box<Orange> getOrangeBox(Orange orange) {
        Box<Orange> orangeBox = new Box<Orange>();
        orangeBox.addToBox(orange);
        orangeBox.addToBox(orange);
        orangeBox.addToBox(orange);
        return orangeBox;
    }

    private Box<Orange> getSmallOrangeBox(Orange orange) {
        Box<Orange> smallOrangeBox = new Box<Orange>();
        smallOrangeBox.addToBox(orange);
        smallOrangeBox.addToBox(orange);
        return smallOrangeBox;
    }

    private Box<Apple> getEmptyAppleBox() {
        return new Box<Apple>();
    }

    private Box<Orange> getEmptyOrangeBox() {
        return new Box<Orange>();
    }
}