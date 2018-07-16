package ru.efremovdm.JavaLevel1;

import java.lang.Exception;

/**
 * Java. Уровень 1. Урок 1.
 */
public class Lesson1 {

    public static void main(String[] args) {

        try {
            double abcd = abcd(1, 2, 3, 3);
            System.out.println("Результат выражения: a * (b + (c / d)) = " + abcd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        boolean summ = summ(5, 7);
        System.out.println("Сумма чисел " + (summ  ? "" :  "НЕ") + " находится в пределах от 10 до 20!");

        ckeckInt(100);

        int a = -20;
        boolean checkInt2 = checkInt2(a);
        System.out.println("Число " + a +" является " + (!checkInt2 ? "" : "НЕ") + " отрицательным");

        showName("Дмитрий");

        checkYear(400);
    }

    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     * где a, b, c, d – входные параметры этого метода;
     */
    private static double abcd(double a, double b, double c, double d) {

        if (0 == d) {
            throw new NumberFormatException("Нельзя делить на ноль!");
        }

        return a * (b + (c / d));
    }

    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма
     * лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
     */
    private static boolean summ(double a, double b) {
        double result = a + b;
        return result >= 10 && result <= 20;
    }

    /**
     * 5. Написать метод, которому в качестве параметра передается целое число, метод должен
     * напечататьвконсоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
     */
    private static void ckeckInt(int a) {
        System.out.println("Число " + a + " является " + (a >= 0 ? "положительным" : "отрицательным"));
    }

    /**
     * 6. Написать метод, которому в качестве параметра передается целое число,
     * метод должен вернуть true, если число отрицательное;
     */
    private static boolean checkInt2(int a) {
        return a < 0;
    }

    /**
     * 7. Написать метод, которому в качестве параметра передается строка,
     * обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
     */
    private static void showName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * 8. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static void checkYear(int a) {
        boolean result = (a % 4 == 0 && (a % 100 != 0 || a % 100 == 0 && a % 400 == 0));
        System.out.println("Год " + a + (!result ? " НЕ" : "") + " является високосным");
    }
}
