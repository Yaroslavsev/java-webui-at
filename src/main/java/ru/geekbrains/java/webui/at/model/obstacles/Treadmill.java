package ru.geekbrains.java.webui.at.model.obstacles;

import ru.geekbrains.java.webui.at.model.participants.Participants;

public class Treadmill implements Obstacles {

    private int length;

    public boolean isOvercomed (Participants participant){
        if (participant.getMaxRun() >= length){
            return true;
        }
        return false;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
