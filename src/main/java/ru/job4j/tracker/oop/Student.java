package ru.job4j.tracker.oop;

public class Student {
    public void music() {
        System.out.println("I believe I can fly");
    }

    public void accordion() {
        System.out.println("*звуки баяна*");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.accordion();
        petya.accordion();
        petya.accordion();
        petya.music();
        petya.music();
        petya.music();
    }
}
