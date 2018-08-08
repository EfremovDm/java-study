package ru.efremovdm.DesignPatterns.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Барсик");
        states.add("Мурзик");
        states.add("Васька");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
