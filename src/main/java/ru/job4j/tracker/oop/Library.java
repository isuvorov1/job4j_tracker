package ru.job4j.tracker.oop;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 200);
        Book headFirstJava = new Book("headFirstJava", 600);
        Book java = new Book("Java", 400);
        Book bible = new Book("bible", 1000);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirstJava;
        books[2] = java;
        books[3] = bible;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getNumberOfPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getNumberOfPages());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == cleanCode) {
                System.out.println(books[i].getName() + " " + books[i].getNumberOfPages());
            }
        }
    }
}
