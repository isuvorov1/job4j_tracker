package ru.job4j.tracker.oop;

public class Doctor extends Profession{
    private String speciality;

    public Doctor(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday);
        this.speciality = speciality;
    }

    public void heal(Patient patient) {
    }
}
