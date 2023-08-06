package ManagerGame;

import java.util.ArrayList;

public class Team {
    private ArrayList<Figure> figures;

    public Team(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "figures=" + figures +
                '}';
    }
}
