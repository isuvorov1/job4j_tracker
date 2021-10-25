package ru.job4j.tracker.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lava");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String model : autos) {
            System.out.println(model);
        }
    }
}