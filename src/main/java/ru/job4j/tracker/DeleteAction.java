package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete existing Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete existing Item ====");
        int id = input.askInt("Enter id: ");
        tracker.delete(id);
        if (tracker.delete(id)) {
            System.out.println("Delete success.");
            return true;
        } else {
            System.out.println("Delete fail.");
            return false;
        }
    }
}