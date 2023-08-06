package Service;

import ManagerGame.Figure;

import java.util.Scanner;

public class FigureService {
    public Figure createrFigure(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tướng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vị trí tướng: ");
        String position = scanner.nextLine();

        return new Figure(name, position);
    }
}
