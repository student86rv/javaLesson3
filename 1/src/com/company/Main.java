package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        IntList list = new IntArrayList();
        list.add(10);

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }

        list.add(9, 16);
        list.remove(10);
        list.set(11, 31);

        System.out.println("Пустой? " + list.isEmpty());
        System.out.println("Содержит значение? " + list.contains(10));
        System.out.println("11-й элемент:" + list.get(11));
        System.out.println("Размер: " + list.size());
    }
}
