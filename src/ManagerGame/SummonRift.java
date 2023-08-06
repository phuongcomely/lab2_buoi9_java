package ManagerGame;

import java.util.ArrayList;

public class SummonRift {
    private Double time;
    private ArrayList<Team> teams;

    public SummonRift(Double time, ArrayList<Team> teams) {
        this.time = time;
        this.teams = teams;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "time=" + time +
                ", teams=" + teams +
                '}';
    }
}
