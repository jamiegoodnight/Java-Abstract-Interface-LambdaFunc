package transport;

public class Horse extends AbstractVehicle {
    public String name;

    public Horse(String name, int fuel) {
        super(fuel);
        this.fuel *= 2;
        this.name = name;

    }

    public Horse(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return "Grass";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String rtnStr = "Horse{" + "breed:" + name + "\n" + "avgWeight: " + fuel + "\n" + "}" + "\n";
        return rtnStr;
    }
}