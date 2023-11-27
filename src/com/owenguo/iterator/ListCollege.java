package com.owenguo.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollege implements College{

    private List<Integer> list = new ArrayList<>();

    public void add(Integer integer) {
        list.add(integer);
    }

    public void remove(Integer integer) {
        // 暂不实现
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this.list);
    }
}
