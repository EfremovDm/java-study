package ru.efremovdm.JavaLevel1.Lesson2;

/**
 * Java. Уровень 1. Урок 2.
 */
public class Lesson2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] res1 = exercise1(arr);
        showArray("1. Результирующий массив: ", res1);

        int[] res2 = exercise2();
        showArray("2. Результирующий массив: ", res2);

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] res3 = exercise3(arr3);
        showArray("3. Результирующий массив: ", res3);

        exercise4();

        int[] arr5 = {1, 100, 37, 86, -1000, 1234, 200, 123, 234, 345};
        int[] res5 = exercise5(arr5);
        showArray("5. Минимальное, максимальное: ", res5);

        int[] arr2 = {1, 1, 1, 2, 1};
        boolean res = exercise6(arr2);
        System.out.println("6. Левая и правая часть массива: " + (res ? " равны" : " не равны"));

        // 7-е задание мне не ясно по части смещения - нужно заполнять null-ами в начале или конце
        // или же "удалять" лишние элементы массива. Вобщем не стал делать, постановка не корректная.
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static int[] exercise1(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = arr[i] > 0 ? 0 : 1;
        }
        return arr;
    }

    /**
     * 2. Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    private static int[] exercise2() {
        int start = 0;
        int[] arr = new int[8];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = start;
            start = start + 3;
        }
        return arr;
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     * пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static int[] exercise3(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    private static void exercise4() {
        int[][] arr = new int[5][5];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i][i] = 1;
        }
    }

    /**
     * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    private static int[] exercise5(int[] arr) {
        int min = 0; int max = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                min = max = arr[i];
            }
            else {
                if (arr[i] > max) {
                    max = arr[i];
                }
                else if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        return new int[]{min, max};
    }

    /**
     * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры:
     * checkBalance ([1, 1, 1, || 2, 1]) → true,
     * checkBalance ([2, 1, 1, 2, 1]) → false,
     * checkBalance ([10, || 10]) → true,
     * граница показана символами ||, эти символы в массив не входят.
     */
    private static boolean exercise6(int[] arr) {

        int left = 0; int right = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            left += arr[i];
            right = 0;
            for (int j = i + 1; j < length; j++) {
                right += arr[j];
            }
            if (right == left) {
                return true;
            }
        }

        return false;
    }

    private static void showArray(String name, int[] arr) {
        System.out.print(name);
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
