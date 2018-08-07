package ru.efremovdm.JavaLevel1.Lesson6;

public abstract class Animal {

    double runMax;
    double jumpMax;
    double swimMax;

    public abstract boolean run(double run);

    public abstract boolean jump(double jump);

    public abstract boolean swim(double swim);
}
