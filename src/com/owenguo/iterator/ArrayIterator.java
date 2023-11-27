package com.owenguo.iterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator {

    /**
     * 容器 【迭代器是需要知道容器的底层数据结构的】
     *
     * 【 通过构造方法传进来】
     */
    private Integer[] arr;

    /**
     * 获取元素的指针
     */
    private int index = -1;

    public ArrayIterator(Integer[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        if (++index >= arr.length) {
            return false;
        }
        if (arr[index] == null) {
            return false;
        }

        return true;
    }

    @Override
    public Object next() {

        return arr[index];
    }
}
