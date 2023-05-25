package HW5.task1.UI;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    static final String welcomeMsg = "Добро пожаловать в программу телефонной книги.\n";
    static final String byeMsg = "\nДо свидания.";

    static final String chooseActionsMsg = "Выберите следующие действие:";
    static final String invalidCmdMsg = "Команда неверна,попробуйте еще раз.";

    static final String getCommandMsg = "Введите команду: ";
    static final String getNameMsg = "Введите Имя: ";
    static final String getEmailMsg = "Введите Em@il: ";
    static final String getPhoneNumberMsg = "Введите номер телефона: ";
    static final String invalidEmailMsg = "Неверный Em@il";
    static final String invalidPhoneNumberMsg = "Неверный номер телефона";
    static final String successAddMsg = "Контакт успешно сохранен.";
    static final String successEditMsg = "Контакт успешно отредактирован.";
    static final String successRemovedMsg = "Контакт успешно удален.";
    static final String ContactFoundMsg = "Найден следующий контакт.";
    static final String noContactFoundMsg = "Контакты не найдены.";

    static final String showAllContactsMsg = "Найдены следующие контакты:";
    static final String editContactMsg = "Для редактирования контакта заполните следующие поля:";
    static final String askAddContactMsg = "Контакт не найден.Добавить новый(Да/Нет): ";

    static final String getSearchStrMsg = "Введите Имя для поиска контакта: ";
    static final String notDigitMsg = "Это не цифра, попробуйте еще раз";
    static final String removeContacMsg = "Контакт будет удален:";
    static final String askRemoveContactMsg = "Вы уверены? (Да/нет): ";

    static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новый контакт"),
            entry(2, "Изменить существующий контакт"),
            entry(3, "Удалить контакт"),
            entry(4, "Показать все контакты"),
            entry(5, "Показать подробную информацию о контакте"),
            entry(0, "Выход"));

    static final Map<Integer, String> mainMenuEntriesMsg = Map.ofEntries(
            entry(1, "Вы решили добавить новый контакт."),
            entry(2, "Вы решили изменить контакт."),
            entry(3, "Вы решили удалить контакт."),
            entry(4, "Вы решили вывести всю контактную информацию:"),
            entry(5, "Вы решили печатать всю потробную информацию."),
            entry(0, "До свидания"));
}