package transport;

import java.util.*;

public class Main {

    // Static if we're not instantiating
    public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();

    public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester) {
        for (AbstractVehicle v : vehicles) {
            filteredList.clear();
            if (tester.test(v)) {
                System.out.println(v.getName() + "" + v.getFuel());
                filteredList.add(v);
            }
        }
    }

    // public static void printVehicles(ArrayList<AbstractVehicle> vehicles,
    // CheckVehicle tester) {
    // for (AbstractVehicle v : vehicles) {
    // if (tester.test(v)) {
    // System.out.println(v.getName() + "" + v.getFuel());
    // }
    // }
    // }

    public static void main(String[] args) {

        Camel spitty = new Camel("Spitty");
        Camel humpy = new Camel("Humpy");
        Camel drymouth = new Camel("Drymouth");

        spitty.eat(10);
        humpy.eat(25);
        for (int i = 0; i < 3; i++) {
            spitty.move();
        }
        System.out.println("Spitty " + spitty.getFuelLevel());

        System.out.println("\n **** From Abstract Class ***");
        Horse horsey = new Horse("Horsey", 10);
        horsey.addFuel(10);
        System.out.print("Horsey " + horsey.getFuel());

        Horse holiday = new Horse("Holiday");
        System.out.print("Holiday " + holiday.getFuel());
        holiday.go(10);

        Auto vw = new Auto(1, "EuroVan", 2000);

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();
        myList.add(horsey);
        myList.add(holiday);
        myList.add(vw);

        System.out.println();
        System.out.println("*** MY LIST ***");
        System.out.println(myList.toString());

        printVehicles(myList, v -> v.getFuel() < 0);
        printVehicles(myList, v -> (v.getFuel() < 0) && (v instanceof Horse));

        // Alphabetical order
        myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        myList.forEach((v) -> System.out.println(v.getName()));

    }
}