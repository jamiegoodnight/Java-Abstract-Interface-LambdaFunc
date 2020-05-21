package transport;

public class Camel implements Vehicle, Animal {
    private int fuel = 0;
    private String name;

    public Camel(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        fuel = fuel - 1;
    }

    @Override
    public void eat(int i) {
        fuel = fuel + i;
    }

    @Override
    public String speak() {
        return "*Camel noise*";
    }

    @Override
    public String getPath() {
        return "Sand";
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public void addFuel(int i) {
        eat(i);
    }
}