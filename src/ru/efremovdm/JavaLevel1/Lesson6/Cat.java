package ru.efremovdm.JavaLevel1.Lesson6;

public class Cat extends Animal {

    private double runMax = 200;
    private double jumpMax = 2;
    private double swimMax = 0;

    Cat() {}

    Cat(double run, double jump, double swim) {
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
