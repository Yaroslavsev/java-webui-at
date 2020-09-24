package ru.geekbrains.java.webui.at.model.obstacles;

import ru.geekbrains.java.webui.at.model.participants.Participants;

public class Wall implements Obstacles{

    private int height;

    public boolean isOvercomed (Participants participant){
        if (participant.getMaxJump() >= height){
            return true;
        }
        return false;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
