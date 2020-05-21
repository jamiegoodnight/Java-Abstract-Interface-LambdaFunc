package transport;

// fields
// methods
// "abstract" methods

public abstract class AbstractVehicle {

    int fuel;

    public AbstractVehicle(int fuel) {
        this.fuel = fuel;
    }

    public AbstractVehicle() {
        fuel = 1;
    }

    public abstract String getPath();

    public abstract String getName();

    public void move() {
        fuel--;
    }

    public void go(int i) {
        fuel = fuel - i;
    }

    public int getFuel() {
        return fuel;
    }

    public void addFuel(int i) {
        fuel = fuel + i;
    }

}