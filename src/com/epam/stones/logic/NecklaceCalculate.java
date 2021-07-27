package com.epam.stones.logic;

import com.epam.stones.data.StonesList;
import com.epam.stones.entity.JewelryStones;
import com.epam.stones.printer.Printer;

public class NecklaceCalculate {

    private final StonesList stonesList;
    private final Printer printer;


    public NecklaceCalculate(StonesList stonesList , Printer printer) {
        this.stonesList = stonesList;
        this.printer = printer;
    }

    public void counting() {
        calculatingAndPrintTotalPrice();
        calculatingAndPrintTotalWeight();
        sortAndPrintByPrice();
    }

    private double calculatingAndPrintTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < stonesList.size(); i++) {
            totalWeight+= stonesList.get(i).getWeight();
        }
        printer.printTotalWeight(totalWeight);
        return totalWeight;
    }

    private double calculatingAndPrintTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < stonesList.size(); i++) {
            totalPrice += stonesList.get(i).getPrice();
        }
        printer.printTotalPrice(totalPrice);
        return totalPrice;
    }

    private void sortAndPrintByPrice() {
        boolean isSorted = false;
        JewelryStones buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < stonesList.size() - 1; i++) {
                if (stonesList.get(i).getPrice() > stonesList.get(i+1).getPrice()) {
                    isSorted = false;

                    buf = stonesList.get(i);
                    stonesList.set(i,stonesList.get(i+1));
                    stonesList.set(i+1,buf);
                }
            }
        }
        printer.printSortingList(stonesList);
    }

    public void searchAndPrintStonesByTransparency(double minTransparency, double maxTransparency) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < stonesList.size(); i++) {
            if (stonesList.get(i).getTransparency() >= minTransparency &&
                    stonesList.get(i).getTransparency() <= maxTransparency) {
                str.append(stonesList.get(i)).append("\n");
            }
        }
        printer.printByTransparency(str);
    }
}
