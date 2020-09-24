package ru.geekbrains.java.webui.at.repository;

import ru.geekbrains.java.webui.at.model.participants.Participants;

import java.util.Set;

public class ParticipantsRepository {

    private Set<Participants> participantsSet;

    public ParticipantsRepository(Set<Participants> participantsSet) {
        this.participantsSet = participantsSet;
    }

    public Participants getParticipant(){
        return participantsSet.iterator().next();
    }
}
