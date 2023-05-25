package HW6.models.animals.birds;

import HW6.models.interfaces.Flier;

public abstract class FlyingBird extends Bird implements Flier{
    protected int flightAltitude;

    protected FlyingBird(double height, double weight, String eyeColor, String feathersColor, int flightAltitude) {
        super(height, weight, eyeColor, feathersColor);
        this.flightAltitude = flightAltitude;
    }

    protected FlyingBird(double height, double weight, String eyeColor, String feathersColor) {
        super(height, weight, eyeColor, feathersColor);
        this.flightAltitude = 0;
    }

    public int getFlightAltitude() {
        return this.flightAltitude;
    }

    @Override
    public String fly() {
        return String.format("Я лечу на %d метров\n", this.getFlightAltitude());
    }

    @Override
    public String toString() {
        return String.format("%s, Высота полёта: %s", super.toString(), this.getFlightAltitude());
    }
}