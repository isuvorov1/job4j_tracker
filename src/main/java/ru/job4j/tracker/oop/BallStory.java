package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
    Ball ball = new Ball();
    Hare hare = new Hare();
    Fox fox = new Fox();
    Wolf wolf = new Wolf();
    ball.tryEat(ball);
    hare.tryEat(ball);
    fox.tryEat(ball);
    wolf.tryEat(ball);
    }
}
