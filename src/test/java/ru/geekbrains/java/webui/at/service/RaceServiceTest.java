package ru.geekbrains.java.webui.at.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.webui.at.model.obstacles.Obstacles;
import ru.geekbrains.java.webui.at.model.obstacles.Treadmill;
import ru.geekbrains.java.webui.at.model.obstacles.Wall;
import ru.geekbrains.java.webui.at.model.participants.Cat;
import ru.geekbrains.java.webui.at.model.participants.Human;
import ru.geekbrains.java.webui.at.model.participants.Participants;
import ru.geekbrains.java.webui.at.model.participants.Robot;
import ru.geekbrains.java.webui.at.repository.ObstaclesRepository;
import ru.geekbrains.java.webui.at.repository.ParticipantsRepository;

import java.util.HashSet;
import java.util.Set;


class RaceServiceTest {

    @Test
    void race() {



    }

    private RaceService prepareRace() {
        ParticipantsRepository participantsRepository = getParticipantsRepository();

        ObstaclesRepository obstaclesRepository = getObstaclesRepository();

        return new RaceService(participantsRepository, obstaclesRepository);
    }

    private ObstaclesRepository getObstaclesRepository() {
        Treadmill treadmill1 = new Treadmill();
        treadmill1.setLength(10);

        Wall wall1 = new Wall();
        wall1.setHeight(2);

        Set<Obstacles> obstaclesSet = new HashSet<>();
        obstaclesSet.add(treadmill1);
        obstaclesSet.add(wall1);

        ObstaclesRepository obstaclesRepository= new ObstaclesRepository(obstaclesSet);
        return obstaclesRepository;
    }

    private ParticipantsRepository getParticipantsRepository() {
        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setMaxRun(10);
        tom.setMaxJump(3);

        Human john = new Human();
        john.setName("John");
        john.setMaxRun(5);
        john.setMaxJump(2);

        Robot bender = new Robot();
        bender.setName("Bender");
        bender.setMaxRun(15);
        bender.setMaxJump(1);

        Set<Participants> participantsSet = new HashSet<>();
        participantsSet.add(tom);
        participantsSet.add(john);
        participantsSet.add(bender);

        ParticipantsRepository participantsRepository = new ParticipantsRepository(participantsSet);
        return participantsRepository;
    }
}