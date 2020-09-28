package ru.geekbrains.java.webui.at.model;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> content;

    public Box(T... content) {
        this.content = new ArrayList<T>();
    }

    public T getByIndex(Integer i) {
        return content.get(i);
    }

    public List<T> getContent() {
        return content;
    }

    public Float getWeight() {
        Float base = 0f;
        for (T t : content) {
            base += t.getFruitWeight();
        }
        return base;
    }

    public boolean compare(Box<?> other) {
        return getWeight().equals(other.getWeight());
    }

    public void addToBox(T t){
        content.add(t);
    }

    public void pourToBox(Box<T> box, T t){
        if (!content.isEmpty()){
            content.remove(t);
            box.addToBox(t);
        }
    }

}
