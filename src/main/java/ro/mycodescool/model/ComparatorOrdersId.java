package ro.mycodescool.model;

import java.util.Comparator;

public class ComparatorOrdersId implements Comparator<Orders> {

    @Override
    public int compare(Orders o1, Orders o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
