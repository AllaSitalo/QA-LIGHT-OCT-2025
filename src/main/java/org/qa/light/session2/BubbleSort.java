package org.qa.light.session2;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        /*
            1. Алгоритм починає з першої пари сусідніх елементів у масиві.
            2. Якщо перший елемент більший за другий (для сортування за зростанням), їх міняють місцями.
            3. Проходи повторюються, поки весь масив не буде відсортований, тобто поки не станеться так,
             що за цілий прохід жодного обміну не було зроблено.
         */
        //заповнюємо масив випадковми значеннями
        int[] sortable = new int[10];
        Random rand = new Random();
        for (int i = 0; i < sortable.length; i++) {
            sortable[i] = rand.nextInt(100);
        }
        boolean needSorting = true;
        while (needSorting) {
            needSorting = false;
            for (int i = 0; i < sortable.length-1;i++) {
                if (sortable[i] > sortable[i+1]) {
                    int currentVal = sortable[i];
                    int nextVal = sortable[i+1];
                    sortable[i] = nextVal;
                    sortable[i+1] = currentVal;
                    needSorting = true;
                }
            }
        }
        //вивід результату
        for (int i : sortable) {
            System.out.println(i);
        }
        System.out.println("END");
        }

    }
