package com.epam.stones.boot;

import com.epam.stones.data.StonesList;
import com.epam.stones.entity.Gems;
import com.epam.stones.entity.JewelryStones;
import com.epam.stones.entity.ColoredStones;
import com.epam.stones.logic.NecklaceCalculate;
import com.epam.stones.printer.Printer;

public class Main {

    public static void main(String[] args) {
        Gems gem = new Gems("Алмаз", 12.3, 1122,"Квадрат", 1, "Чёрный", 4 );
        ColoredStones alexandrit = new ColoredStones("Александрит", 11.2, 113.3, "Красный ", "Круглый", 0.1, true);
        JewelryStones stone = new Gems("Агат", 200, 10000, "Плоский", 1, "Фиолетовый", 2);
        Gems gems = new Gems();
        ColoredStones coloredStone = new ColoredStones();
        StonesList list = new StonesList(gem,gems);
        list.add(coloredStone,stone,gems, alexandrit);
        Printer printer = new Printer();
        NecklaceCalculate necklace = new NecklaceCalculate(list, printer);
        necklace.counting();
        necklace.searchAndPrintStonesByTransparency(1,2);



    }
}
