package com.epam.stones.data;

import com.epam.stones.entity.JewelryStones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StonesList {

    private final List<JewelryStones> stonesList = new ArrayList<>();

    public StonesList(JewelryStones... stones) {
        stonesList.addAll(Arrays.asList(stones));
    }

    public List<JewelryStones> getStonesList() {
        return stonesList;
    }

    public void add(JewelryStones... stones) {
        stonesList.addAll(Arrays.asList(stones));
    }

    public boolean isEmpty() {
        return stonesList.isEmpty();
    }

    public int size() {
        return stonesList.size();
    }

    public boolean remove(Object o) {
        return stonesList.remove(o);
    }

    public JewelryStones get(int index) {
        return stonesList.get(index);
    }

    public JewelryStones set(int index, JewelryStones stone) {
        return stonesList.set(index, stone);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (JewelryStones stones : stonesList){
            str.append(stones).append("\n");

        }
        return str.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StonesList list = (StonesList) o;
        return Objects.equals(stonesList, list.stonesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stonesList);
    }
}
