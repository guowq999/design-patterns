package com.owenguo.iterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        ArrayCollege arrayCollege = new ArrayCollege();
        arrayCollege.add(1);
        arrayCollege.add(2);
        arrayCollege.add(3);

        Iterator iterator = arrayCollege.createIterator();

        while (iterator.hasNext()) {
            Integer next = (Integer) iterator.next();
            System.out.println(next);
        }

        System.out.println("=================================================");

        ListCollege listCollege = new ListCollege();
        listCollege.add(1);
        listCollege.add(2);
        listCollege.add(3);
        Iterator iterator1 = listCollege.createIterator();
        while (iterator1.hasNext()) {
            Integer next = (Integer) iterator1.next();
            System.out.println(next);
        }
    }
}
