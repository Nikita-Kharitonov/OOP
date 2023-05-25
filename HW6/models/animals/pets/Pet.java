package HW6.models.animals.pets;

import HW6.models.animals.base.Animal;
import HW6.models.interfaces.Petter;

import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal implements Petter{
    private String name;
    private String breed;
    private List<String> vaccinations;
    private String furColor;
    private Date birthDate;

    public Pet(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.furColor = furColor;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public List<String> getVaccinations() {
        return this.vaccinations;
    }

    public String getFurColor() {
        return this.furColor;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String pet() {
        return String.format("Его погладили. Животное любит тебя!)");
    }

    @Override
    public String toString() {
        return String.format(
                "%s, Имя: %s, Порода: %s, Прививки: %s, Цвет шерсти: %s, Дата рождения: %s",
                super.toString(), this.getName(), this.getBreed(), this.getVaccinations(), this.getFurColor(), this.getBirthDate()
        );
    }
}