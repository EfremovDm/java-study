package ru.efremovdm.DesignPatterns.prototype;

/**
 * Prototype Class
 *
 * Задаёт виды создаваемых объектов с помощью экземпляра-прототипа и создаёт новые объекты путём копирования этого
 * прототипа. Он позволяет уйти от реализации и позволяет следовать принципу «программирование через интерфейсы».
 * В качестве возвращающего типа указывается интерфейс/абстрактный класс на вершине иерархии, а классы-наследники
 * могут подставить туда наследника, реализующего этот тип.
 * Проще говоря, это паттерн создания объекта через клонирование другого объекта вместо создания через конструктор.
 *
 * TODO: Изучить клонирование в Java
 */
public class Cookie implements Cloneable {

    protected int weight;

    @Override
    public Cookie clone() throws CloneNotSupportedException {

        Cookie copy = (Cookie) super.clone();

        //In an actual implementation of this pattern you might now change references to
        //the expensive to produce parts from the copies that are held inside the prototype.

        return copy;
    }
}
