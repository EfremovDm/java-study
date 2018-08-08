package ru.efremovdm.JavaLevel1.Lesson7;

public class Dish {

    private int food;

    Dish(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) {
            return false;
        }

        food -= n;
        return true;
    }

    void addFood(int food) {
        this.food += food;
    }

    void info() {
        System.out.println("plate: " + food);
    }
}
