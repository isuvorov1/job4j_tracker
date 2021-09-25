package ru.job4j.tracker.oop;

public class Engineer extends Profession {
    private String occupation;

    public Engineer(String name, String surname, String education, String birthday, String occupation) {
        super(name, surname, education, birthday);
        this.occupation = occupation;
    }

    public void doTechnicalTask (Task task) {

    }
}
