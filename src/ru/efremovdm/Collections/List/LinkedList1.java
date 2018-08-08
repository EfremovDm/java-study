package ru.efremovdm.Collections.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {

    /**
     * LinkedList — реализует интерфейс List. Является представителем двунаправленного списка (цепочка),
     * где каждый элемент структуры содержит указатели на предыдущий и следующий элементы.
     * Итератор поддерживает обход в обе стороны.
     * Реализует методы получения, удаления и вставки в начало, середину и конец списка.
     * Позволяет добавлять любые элементы в том числе и null и повторяющиеся.
     *
     * Эффективно: вставка и удаление в середине списка.
     * Малоэффективно: операции произвольного доступа.
     *
     * https://habr.com/post/127864/
     * http://developer.alexanderklimov.ru/android/java/linkedlist.php
     */
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<String>();

        linkedList.add("Барсик");
        linkedList.add("Мурзик");
        linkedList.add(1, "Рыжик"); // вставка в середину

        ListIterator<String> iterator = linkedList.listIterator(); // имеется собственный итератор

        String cat;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
