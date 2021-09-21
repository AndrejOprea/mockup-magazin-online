package ro.mycodescool.model;

import java.util.Comparator;

public class ComparatorStoc implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {

        return Integer.compare(o1.getStock(),o2.getStock());
    }
}
