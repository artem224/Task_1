package com.epam.stones.entity;


import java.util.Objects;

// main class
public abstract class JewelryStones {

    private String name;
    private double weight;
    private double price;
    private double transparency;
    private String color;
    private String form;

    public JewelryStones(String name, double weight, double price, double transparency, String color, String form) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
        this.form = form;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JewelryStones stones = (JewelryStones) o;
        return Double.compare(stones.weight, weight) == 0 &&
                Double.compare(stones.price, price) == 0 &&
                Double.compare(stones.transparency, transparency) == 0 &&
                name.equals(stones.name) && color.equals(stones.color) &&
                form.equals(stones.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price, transparency, color, form);
    }

    @Override
    public String toString() {
        return "Stones - {" +
                "название = '" + name + '\'' +
                ", вес = " + weight +
                ", цена = " + price +
                ", прозрачность = " + transparency +
                ", цвет = '" + color + '\'' +
                ", форма = '" + form + '\'' +
                '}';
    }
}
