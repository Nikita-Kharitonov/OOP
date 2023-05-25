package HW6.models.animals.pets;

import HW6.models.interfaces.Trainer;

import java.util.Date;
import java.util.List;

public class Dog extends Pet implements Trainer{
    protected boolean trained;

    public Dog(double height, double weight, String eyeColor, String name, String breed,
               List<String> vaccinations, String furColor, Date birdhDate, boolean trained) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birdhDate);
        this.trained = trained;
    }

    public Dog(double height, double weight, String eyeColor, String name, String breed,
               List<String> vaccinations, String furColor, Date birdhDate) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birdhDate);
        this.trained = false;
    }

    public boolean isTrained() {
        return this.trained;
    }

    @Override
    public String train() {
        this.trained = true;
        return String.format("Собака %s успешно обучена\n", this.getName());
    }

    @Override
    public String sound() {
        return "Гав-Гав!";
    }

    @Override
    public String toString() {
        return String.format("Собака (%s, обучение: %b)", super.toString(), this.isTrained());
    }
}