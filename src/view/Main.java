package view;

import ManagerGame.Figure;
import ManagerGame.SummonRift;
import ManagerGame.Team;
import Service.FigureService;
import Service.SummonRiftService;
import Service.TeamService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TeamService teamService = new TeamService();
        ArrayList<Team> teams = new ArrayList<>();
        FigureService figureService = new FigureService();
        ArrayList<Figure> figures = new ArrayList<>();



        SummonRiftService summonRiftService = new SummonRiftService();
        SummonRift summonRift = summonRiftService.createrSum(teamService, teams, figureService, figures);

        System.out.println("======== THÔNG TIN TRẬN ĐẤU LOL =======");
        System.out.println(summonRift);
    }
}
