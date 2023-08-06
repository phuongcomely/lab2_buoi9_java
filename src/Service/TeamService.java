package Service;

import ManagerGame.Figure;
import ManagerGame.Team;

import java.util.ArrayList;

public class TeamService {
    public Team createrTeam(FigureService figureService, ArrayList<Figure> figures){
        for(int i = 0; i<5; i++){
            System.out.println("TƯỚNG "+(i+1));
            Figure figure = figureService.createrFigure();
            figures.add(figure);
        }
        return  new Team(figures);
    }
}
