package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete an existing item";
    }

    @Override
    public boolean execute(Input input, Store memTracker) {
        int id = Integer.parseInt(input.askStr("Enter item's ID: "));
        if (memTracker.delete(id)) {
            out.println(System.lineSeparator() + "ID " + id + " deleted."
                    + System.lineSeparator());
        } else {
            out.println(System.lineSeparator() + "ERROR!" + System.lineSeparator()
                    + "ID \"" + id + "\" doesn't exist." + System.lineSeparator());
        }
        return true;
    }
}