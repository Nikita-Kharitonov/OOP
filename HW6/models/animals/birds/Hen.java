package HW6.models.animals.birds;

public class Hen extends NonFlyingBird{

    public Hen(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return String.format("Ку-ка-ре-ку!");
    }

    @Override
    public String toString() {
        return String.format("Курица (%s)", super.toString());
    }
}