package ru.job4j.tracker;

import java.util.ArrayList;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        ArrayList<Item> arrayList = tracker.findAll();
        for (Item item : arrayList) {
            System.out.println(item);
        }
        return true;
    }
}
