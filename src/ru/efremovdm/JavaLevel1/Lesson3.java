package ru.efremovdm.JavaLevel1;

import java.util.Random;
import java.util.Scanner;

/**
 * Java. Уровень 1. Урок 3.
 */
public class Lesson3 {

    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
     * угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число
     * чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
     * 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     *
     * @param args
     */
    public static void main(String[] args) {

        Random random = new Random();
        int steps = 3;
        int start = 0;
        int end = 9;
        boolean play = true;

        while (play) {

            int rnd = random.nextInt(end + 1);

            System.out.println("\nЗагадано число от " + start + " до " + end
                    + ". У вас есть 3 попытки чтобы его отгадать! " + rnd);

            for (int i = 0; i < steps; i++) {
                System.out.print("Введите число: ");
                int input = getInt();
                if (input == rnd) {
                    System.out.println("Вы угадали число!");
                    break;
                } else {
                    System.out.println("Введеное вами число " + (input > rnd ? "больше" : "меньше") + " загаданного!");
                }
            }

            System.out.print("Повторить игру еще раз? ");
            play = getInt() > 0;
        }
    }

    /**
     * Получение числа из консоли
     *
     * @return
     */
    private static int getInt() {
        int input = 0;
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                input = in.nextInt();
                break;
            } catch (Exception ex) {
                System.out.print("Введеное Вами число не является целым! Повторите ввод: ");
            }
        }

        return input;
    }
}
