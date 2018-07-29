package ru.efremovdm.JavaLevel1;

/**
 * Урок 5. Введение в ООП
 *
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 */
public class Lesson5 {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    /**
     * Конструктор класса должен заполнять эти поля при создании объекта;
     *
     * @param fio
     * @param position
     * @param email
     * @param phone
     * @param salary
     * @param age
     */
    public Lesson5(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     */
    public void show() {
        System.out.println("ФИО: " + this.fio + ", должность: " + this.position + ", email: " + this.email
                + ", телефон: " + this.phone + ", зарплата: " + this.salary + ", возраст: " + this.age);
    }

    /**
     * Получить возраст сотрудника
     *
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Создать массив из 5 сотрудников
     Пример:
     Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
     persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
     persArray[1] = new Person(...);
     ...
     persArray[4] = new Person(...);

     * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     */
    public static void main(String[] args) {

        Lesson5[] persArray = new Lesson5[5]; // Вначале объявляем массив объектов
        persArray[0] = new Lesson5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Lesson5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        persArray[2] = new Lesson5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        persArray[3] = new Lesson5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 60);
        persArray[4] = new Lesson5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 65);

        for (Lesson5 pers : persArray) {
            if (pers.getAge() > 40) {
                pers.show();
            }
        }
    }
}
