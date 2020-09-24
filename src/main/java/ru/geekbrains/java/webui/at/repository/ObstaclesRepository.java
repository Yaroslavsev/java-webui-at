package ru.geekbrains.java.webui.at.repository;

import ru.geekbrains.java.webui.at.model.obstacles.Obstacles;

import java.util.Set;

public class ObstaclesRepository {

    private Set<Obstacles> obstaclesSet;

    public ObstaclesRepository(Set<Obstacles> obstaclesSet) {
        this.obstaclesSet = obstaclesSet;
    }

    public Obstacles getObstacle(){
        return obstaclesSet.iterator().next();
    }
}
