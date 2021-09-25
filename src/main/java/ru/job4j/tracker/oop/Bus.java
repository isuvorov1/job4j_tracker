package ru.job4j.tracker.oop;

public class Bus implements Transport{
    @Override
    public void ride() {

    }

    @Override
    public void passengers(int number) {

    }

    @Override
    public float fuel(float fuel) {
        float price = fuel * 2.14F;
        return price;
    }
}
