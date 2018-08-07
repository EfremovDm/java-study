package ru.efremovdm.DesignPatterns.prototype2;

/**
 * Определяет интерфейс создания объекта через клонирование другого объекта вместо создания через конструктор.
 */
public class Solution {
    public static void main(String[] args) {
        Request request = new Request("lordrp", 20, "coder");
        while (true)//имитирую онлайн запросы
        {
            try {
                Request userRequest = request.clone();
                //изменение параметров
                userRequest.setAge(30);
                //тут мог бы осуществляться какой - нить поиск
                //search(userRequest)
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();//объект не поддерживает клонирование
            }
        }
    }
}