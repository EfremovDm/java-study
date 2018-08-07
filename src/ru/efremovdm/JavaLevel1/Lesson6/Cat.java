package ru.efremovdm.JavaLevel1.Lesson6;

public class Cat extends Animal {

    Cat() {
        runMax = 200;
        jumpMax = 2;
        swimMax = 0;
    }

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
