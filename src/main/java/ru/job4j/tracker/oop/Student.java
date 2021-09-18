package ru.job4j.tracker.oop;

public class Student {
    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void accordion() {
        System.out.println("*звуки баяна*");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
