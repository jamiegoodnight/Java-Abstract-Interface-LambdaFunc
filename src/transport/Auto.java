package transport;

public class Auto extends AbstractVehicle {
    private String model;
    private int year;

    public Auto(int fuel, String model, int year) {
        super(fuel);
        this.model = model;
        this.year = year;
    }

    public String getPath() {
        return "Road";
    }

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    @Override
    public String toString() {
        String rtnStr = "Auto{" + "model:" + model + "\n" + "year: " + year + "\n" + "fuel: " + fuel + "\n" + "}"
                + "\n";
        return rtnStr;
    }
}