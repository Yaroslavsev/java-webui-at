package ru.geekbrains.java.webui.at.service;

import ru.geekbrains.java.webui.at.model.obstacles.Obstacles;
import ru.geekbrains.java.webui.at.model.participants.Participants;
import ru.geekbrains.java.webui.at.repository.ObstaclesRepository;
import ru.geekbrains.java.webui.at.repository.ParticipantsRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public class RaceService {

    private ParticipantsRepository participantsRepository;
    private ObstaclesRepository obstaclesRepository;

    public RaceService(ParticipantsRepository participantsRepository, ObstaclesRepository obstaclesRepository) {
        this.participantsRepository = participantsRepository;
        this.obstaclesRepository = obstaclesRepository;
    }



    

}
