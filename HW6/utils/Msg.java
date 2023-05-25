package HW6.utils;

import java.util.Map;
import static java.util.Map.entry;

public class Msg {
    public static final String welcomeMsg = "Добро пожаловать в наш зоопарк!\n";
    public static final String byeMsg = "До встречи!\n";
    public static final String chooseActionsMsg = "Выберите одно из последующих действий:";
    public static final String addAnimalMsg = """
            Добавить новое животное (посмотрите, какие это могут быть типы)
            1 - Кот
            2 - Собака
            3 - Тигр
            4 - Волк
            5 - Курица
            6 - Аист
            """;

    public static final String askAnimalClassMsg = "Какой это тип? ";
    public static final String askAnimalHeightMsg = "Какой рост животного? ";
    public static final String askAnimalWeightMsg = "ККакой вес животного? ";
    public static final String askAnimalEyeColorMsg = "Какой у него цвет глаз? ";
    public static final String askPetNameMsg = "Как его зовут? ";
    public static final String askPetBreedMsg = "Какая у него порода? ";
    public static final String askPetVaccinationsMsg = "Какие у него имеются прививки (через пробел)? ";
    public static final String askPetFurColorMsg = "Какой у него цвет шерсти? ";
    public static final String askPetBirthDaterMsg = "Дата рождения животного (формат: гггг-мм-дд)? ";
    public static final String askWildAnimalHabitatMsg = "Какая среда обитания животного? ";
    public static final String askWildAnimalFoundDateMsg = "Когда было обнаруженно данное животное (формат: гггг-мм-дд)? ";
    public static final String askBirdFeathersColorMsg = "Какого цвета перья? ";
    public static final String askBirdFlightAltitudeMsg = "Какова высота его полета? ";
    public static final String askIsDogTrainedMsg = "Собака дрессирована (ответ да / нет)? ";
    public static final String askIsWolfLeaderdMsg = "Данное живоное - вожак стаи (ответ да / нет)? ";
    public static final String askIsCatWoollyMsg = "У данной кошки длинна шерсть (ответ да / нет)? ";

    public static final String getIndexlMsg = "Введите номер: ";
    public static final String getAnimalIDMsg = "Введите ID животного: ";
    public static final String invalidAnimalIDMsg = "Неверный ID животного";
    public static final String incorrectInputMsg = "Это неверный ответ, попробуйте еще раз!";
    public static final String cannotDoItMsg = "Невозможно (Неверный ID животного)";

    public static final String animalWasAddedMsg = "Это животное было добавленно в Зоопарк";
    public static final String animalNotAddedMsg = "Это животное не было добавленно в Зоопарк";
    public static final String nobodyRemovedMsg = "Никто не был удален из Зоопарка (Неверный ID животного)";
    public static final String animalWasRemovedMsg = "Животное удалено из Зоопарка";

    public static final String nobodyLivesInZooMsg = "В Зоопарке по никто не живет";
    public static final String notImplementedMsg = "На данный момент не реализовано";

    public static final String cannotFlyMsg = "Данное животное не умеет летать. Извините!";
    public static final String cannotPetMsg = "Данное животное не домашнее. Извините!";
    public static final String cannotTrainMsg = "Данное животное нельзя дрессировать. Извините!";

    public static final Map<Integer, String> mainMenuEntries = Map.ofEntries(
            entry(1, "Добавить новое животное в Зоопарк"),
            entry(2, "Удалить животное из Зоопарка"),
            entry(3, "Распечатать инормацию о конкретном животном"),
            entry(4, "Распечатать инормацию о всех животных в Зоопарке"),
            entry(5, "Издать звук конкретного животного"),
            entry(6, "Издать звук всех животных в Зоопарке"),
            entry(7, "Умеет ли летать это животное?"),
            entry(8, "Данное животное домашнее?"),
            entry(9, "Это животное можно дрессировать?"),
            entry(0, "Выйти из Зоопарка"));
}