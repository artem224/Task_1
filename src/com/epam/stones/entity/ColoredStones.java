package com.epam.stones.entity;


import java.util.Objects;

// Цветные камни
public class ColoredStones extends JewelryStones {

    private boolean isUsedInConstruction;

    public ColoredStones(String name, double weight, double price, String color, String form, double transparency, boolean isUsedInConstruction) {
        super(name, weight, price,transparency, form, color);
        this.isUsedInConstruction =  isUsedInConstruction;
    }

    public ColoredStones() {
        super("Корунд", 120, 1300,  0.2, "Красный", "Квадрат");
    }

    public boolean isUsedInConstruction() {
        return isUsedInConstruction;
    }

    public void setUsedInConstruction(boolean usedInConstruction) {
        isUsedInConstruction = usedInConstruction;
    }

    public void useInConstruction() {
        this.isUsedInConstruction = true;
    }


    @Override
    public String toString() {
        return "Камень - " +
                "название = '" + getName() + '\'' +
                ", вес = " + getWeight() +
                ", цена = " + getPrice() +
                " форма - " +  getForm() +
                " цвет - " + getColor() +
                " прозрачность " + getTransparency() +
                " Используется в строительстве - " + isUsedInConstruction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoredStones that = (ColoredStones) o;
        return isUsedInConstruction == that.isUsedInConstruction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isUsedInConstruction);
    }

}
