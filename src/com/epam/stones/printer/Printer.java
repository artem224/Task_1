package com.epam.stones.printer;

import com.epam.stones.data.StonesList;

public class Printer {
    private final static String TOTAL_WEIGHT_MESSAGE = "Общий вес - ";
    private final static String TOTAL_PRICE_MESSAGE  = "Общая стоимость - ";
    private final static String STONES_AFTER_SORT_MESSAGE  = "Камни после сортировки - \n";
    private final static String NOT_FOUND_STONES_MESSAGE  = "По заданному диапазону не было найдено камней";
    private final static String FOUND_STONES_MESSAGE  = "Найденные камни по прозрачности - :\n";

    public void printTotalWeight(double weight) {
        System.out.println(TOTAL_WEIGHT_MESSAGE  + weight  + "\n");
    }

    public void printTotalPrice(double price) {
        System.out.println(TOTAL_PRICE_MESSAGE  + price + "\n");
    }

    public void printSortingList(StonesList list) {
        System.out.println(STONES_AFTER_SORT_MESSAGE  + list);
    }

    public void printByTransparency(StringBuilder str) {
        if (str.isEmpty()) {
            System.out.println(NOT_FOUND_STONES_MESSAGE );
        }else {
            System.out.println(FOUND_STONES_MESSAGE  + str);
        }

    }
}
