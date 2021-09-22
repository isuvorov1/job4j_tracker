package ru.job4j.tracker.oop;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDate("01/09/2021");
        student.setGroup(21);
        student.setName("Anton Ivanov");
        System.out.println("Student name: "+student.getName() + ", student group: "+student.getGroup()+ ", student admission date: " +student.getDate());
    }
}
