package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        List<Item> list = tracker.findAll();
        for (Item item : list) {
            System.out.println(item);
        }
        return true;
    }
}
