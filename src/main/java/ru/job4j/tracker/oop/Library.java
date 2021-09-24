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
        for (Book value : books) {
            System.out.println(value.getName() + " " + value.getNumberOfPages());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book value : books) {
            System.out.println(value.getName() + " " + value.getNumberOfPages());
        }
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " " + book.getNumberOfPages());
            }
        }
    }
}
