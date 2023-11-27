package com.owenguo.iterator;

import java.util.Iterator;

public class ArrayCollege implements College{
    /**
     * 容器
     */
    private Integer[] arr = new Integer[10];

    /**
     * 元素存放的位置
     */
    private int index = 0;

    public void add(Integer integer) {
        if (index >= arr.length ) {
            return;
        }
        arr[index++] = integer;
    }

    public void remove(Integer integer) {
        // 暂不实现
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this.arr);
    }
}
