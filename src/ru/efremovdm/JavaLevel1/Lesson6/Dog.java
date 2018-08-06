package ru.efremovdm.JavaLevel1.Lesson6;

public class Dog extends Animal {

    private double runMax = 500;
    private double jumpMax = 0.5;
    private double swimMax = 10;

    Dog() {}

    Dog(double run, double jump, double swim) {
        runMax = run;
        jumpMax = jump;
        swimMax = swim;
    }

    @Override
    public boolean run(double run) {
        return run <= runMax;
    }

    @Override
    public boolean jump(double jump) {
        return jump <= jumpMax;
    }

    @Override
    public boolean swim(double swim) {
        return swim <= swimMax;
    }
}
