package ru.geekbrains.java.webui.at.model.participants;

public class Robot implements Participants{

    private String name;
    private int maxRun;
    private int maxJump;

    public int run(){
        return maxRun;
    }

    public int jump(){
        return maxJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }
}
