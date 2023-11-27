package com.owenguo.iterator;

import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterator {

    private List<Integer> list;

    private int index = -1;

    public ListIterator(List<Integer> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (++index >= list.size()) {
            return false;
        }

        return true;
    }

    @Override
    public Object next() {

        return list.get(index);
    }
}
