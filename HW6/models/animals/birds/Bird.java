package HW6.models.animals.birds;

import HW6.models.animals.base.Animal;

public abstract class Bird extends Animal{
    private String feathersColor;

    protected Bird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor);
        this.feathersColor = feathersColor;
    }

    public String getFeathersColor() {
        return this.feathersColor;
    }
}