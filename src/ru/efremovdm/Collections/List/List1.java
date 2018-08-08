package ru.efremovdm.Collections.List;

import java.util.ArrayList;

public class List1 {

    /**
     * ArrayList — реализует интерфейс List.
     *
     * Как известно, в Java массивы имеют фиксированную длину, и после того как массив создан,
     * он не может расти или уменьшаться. ArrayList может менять свой размер во время исполнения программы,
     * при этом не обязательно указывать размерность при создании объекта. Элементы ArrayList могут
     * быть абсолютно любых типов в том числе и null.
     *
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<String> catNames = new ArrayList<String>();
        catNames.add("Васька");
        catNames.add("Машка");
        catNames.add("Машка123");
        catNames.add("Машка012");

        catNames.remove("Машка012");

        for (String с: catNames) {
            System.out.println(с);
        }

        catNames.clear();
    }
}
