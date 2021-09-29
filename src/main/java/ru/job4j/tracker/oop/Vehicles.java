package ru.job4j.tracker.oop;

public class Vehicles {
    public static void main(String[] args) {
        Vehicle bus1 = new Buss();
        Vehicle bus2 = new Buss();
        Vehicle plane1 = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle[] vehicles = new Vehicle[] {bus1, bus2, plane1, plane2, train1, train2};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}
