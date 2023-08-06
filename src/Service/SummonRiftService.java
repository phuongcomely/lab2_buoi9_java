package Service;

import ManagerGame.Figure;
import ManagerGame.SummonRift;
import ManagerGame.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {
    public SummonRift createrSum(TeamService teamService, ArrayList<Team> teams,FigureService figureService, ArrayList<Figure> figures){
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<2; i++){
            System.out.println("MỜI BẠN NHẬP THÔNG TIN TEAM "+(i+1));
            Team team = teamService.createrTeam(figureService, figures);
            teams.add(team);

        }
        System.out.println("Nhập thời gian bắt đầu: ");
        Double time = Double.parseDouble(scanner.nextLine());

        return new SummonRift(time, teams);
    }
}
