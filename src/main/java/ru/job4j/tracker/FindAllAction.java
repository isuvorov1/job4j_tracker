package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Showing all items";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        List<Item> ehh = memTracker.findAll();
        out.println(System.lineSeparator());
        for (Item eh : ehh) {
            out.println(eh);
        }
        out.println(System.lineSeparator());
        return true;
    }
}
