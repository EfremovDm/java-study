package ru.efremovdm.JavaLevel1.Lesson6;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 *
 * 2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве
 * параметра каждому методу передается величина, означающая или длину препятствия (для
 * бега и плавания), или высоту (для прыжков).
 *
 * 3 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 * прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 *
 * 4 При попытке животного выполнить одно из этих действий, оно должно сообщить результат в
 * консоль. (Например, dog1.run(150); -> результат: run: true)
 *
 * 5 * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег
 * может быть 400 м., у другой 600 м.
 */
public class Lesson6 {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog(400, 0.5, 10),
                new Dog(600, 0.5, 10)
        };

        for (Animal animal : animals) {

            System.out.printf(
                "%s run: %s\n",
                animal.getClass().getSimpleName(),
                animal.run(500)
            );

            System.out.printf(
                "%s jump: %s\n",
                animal.getClass().getSimpleName(),
                animal.jump(0.5)
            );

            System.out.printf(
                "%s swim: %s\n\n",
                animal.getClass().getSimpleName(),
                animal.swim(8)
            );
        }
    }
}
