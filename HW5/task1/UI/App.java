package HW5.task1.UI;

import HW5.task1.Core.DB.ExternalContactsCSV;
import HW5.task1.Core.DB.ExternalData;
import HW5.task1.Core.Models.PhoneBook;
import HW5.task1.Core.Models.PhoneBookMap;
import HW5.task1.Core.MVP.Model;
import HW5.task1.Core.MVP.Presenter;
import HW5.task1.Core.MVP.View;
import java.util.Scanner;

public class App {
    public static void Run() {
        Scanner scan = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBookMap();
        ExternalData db = new ExternalContactsCSV(phoneBook, "db.csv");
        Model model = new Model(phoneBook, db);
        View view = new ConsoleUI(scan);
        Presenter presenter = new Presenter(model, view);

        presenter.load();
        presenter.mainMenu();
        presenter.save();

        scan.close();
    }
}