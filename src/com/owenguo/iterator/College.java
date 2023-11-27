package com.owenguo.iterator;

import java.util.Iterator;

/**
 * 容器接口
 */
public interface College {

    /**
     * 得到当前容器的迭代器
     *
     * @return
     */
    Iterator createIterator();
}
