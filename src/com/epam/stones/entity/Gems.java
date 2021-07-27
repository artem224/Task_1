package com.epam.stones.entity;


import java.util.Objects;

// Самоцветы
public class Gems extends JewelryStones {

    private int degreeOfRarity;


    public Gems(){
        super("Изумруд", 12, 1000, 1, "Белый", "Треугольник");
    }

    public Gems(String name, double weight, double price, String form, float transparency, String color, int degreeOfRarity) {
        super(name, weight, price, transparency, color, form);
        this.degreeOfRarity = degreeOfRarity;
    }


    public int getDegreeOfRarity() {
        return degreeOfRarity;
    }

    public void setDegreeOfRarity(int degreeOfRarity) {
        this.degreeOfRarity = degreeOfRarity;
    }


    @Override
    public String toString() {
        return "Камень - " +
                "название = '" + getName() + '\'' +
                ", вес = " + getWeight() +
                ", цена = " + getPrice() +
                " форма - " + getForm() +
                " прозрачность - " + getTransparency() +
                " цвет - " + getColor() +
                " степень редкости  - "  + degreeOfRarity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!Gems.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        final Gems other = (Gems) obj;
        if ((this.getName() == null) ? (other.getName() != null) : !this.getName().equals(other.getName())) {
            return false;
        }

        if (this.getForm() != other.getForm()) {
            return false;
        }

        if (this.getTransparency() != other.getTransparency()) {
            return false;
        }

        if (this.getPrice() != other.getPrice()) {
            return false;
        }

        if (this.getWeight() != other.getWeight()) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(degreeOfRarity);
    }

}
