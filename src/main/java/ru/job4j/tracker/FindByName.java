package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByName implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Item(s) with this name: " + name + " could not be found.");
        } return true;
    }
}