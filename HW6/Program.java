package HW6;

import HW6.models.zoo.Zoo;
import HW6.presenters.Presenter;
import HW6.views.ConsoleView;
import HW6.views.View;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Zoo javaZoo = new Zoo();
        View view = new ConsoleView(scan);
        Presenter presenter = new Presenter(view, javaZoo);
        presenter.Run();
        scan.close();
    }
}