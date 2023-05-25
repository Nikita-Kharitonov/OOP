package HW6.models.animals.birds;

public class Stork extends FlyingBird{

    public Stork(double height, double weight, String eyeColor, String feathersColor, int flightAltitude) {
        super(height, weight, eyeColor, feathersColor,flightAltitude);
    }

    public Stork(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound() {
        return ".....";
    }

    @Override
    public String toString() {
        return String.format("Аист (%s)", super.toString());
    }
}