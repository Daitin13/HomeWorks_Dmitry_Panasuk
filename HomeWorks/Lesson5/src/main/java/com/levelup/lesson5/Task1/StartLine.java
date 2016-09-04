package com.levelup.lesson5.Task1;

import com.levelup.lesson5.Task1.IstartLine;

import java.util.ArrayList;
import java.util.List;

public class StartLine extends Participant implements IstartLine {
    static int MAX_PARTICIPANT = 10;
    private int counter;
    List<IParticipant> participants = new ArrayList<IParticipant>();

    public StartLine() {
    }

    public boolean startAll() {
        return false;//TODO
    }

    public boolean checkResaultAll() {
        return false;//TODO
    }

    public boolean addParticipant() {
        if (counter<MAX_PARTICIPANT){
            participants.add(IParticipant)
        }
    }
}





