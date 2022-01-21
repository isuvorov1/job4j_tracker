package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find an item by Name";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        String name = input.askStr("Enter name: ");
        List<Item> ehh = memTracker.findByName(name);
        if (ehh.size() == 0) {
            out.println(System.lineSeparator() + "Such name doesn't exist."
                    + System.lineSeparator());
        } else {
            for (Item item : ehh) {
                out.println(item);
            }
        }
        return true;
    }
}