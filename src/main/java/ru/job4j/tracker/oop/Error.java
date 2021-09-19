package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error () {
    }

    public Error (boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void errorDetails() {
        System.out.println("наличие ошибки: "+ active);
        System.out.println("статус: "+ status);
        System.out.println("Сообщение "+ message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 2, "ошибка 2");
        Error error3 = new Error(true, 3, "ошибка 3");
        error1.errorDetails();
        error2.errorDetails();
        error3.errorDetails();
    }
}
