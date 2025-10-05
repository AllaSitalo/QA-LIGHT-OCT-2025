package org.qa.light.session2;

public class Main {
    public static void main(String[] args) {
//        int[] ints = new int[10];
//        ints[0] = 10;
//        ints[1] = 20;
//        ints[2] = 30;
//        ints[3] = 40;
//        ints[4] = 50;
//        ints[5] = 60;
//        ints[6] = 70;
//        ints[7] = 80;
//        ints[8] = 90;
//        ints[9] = 100;
//        System.out.println(">>>>" + ints.length);

//        int[] ints2 = {1, 2, 3};
//
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }

//        String[] strs = new String[4];
//        strs[0] = "abc";
//        strs[1] = "def";
//        strs[2] = "ghi";
//        strs[3] = "jkl";
//
//        for (int i : ints) {
//            System.out.println(i);
//        }
//
//        for (String str : strs) {
//            System.out.println(str);
//        }

//        Random rand = new Random();
//        int[] ints = new int[100];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = rand.nextInt(1000);
//        }
//        System.out.println("Odd numbers:");
//        for (int i : ints) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("Even numbers:");
//        for (int i : ints) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        int[][] ints = {
                {1, 2, 3, 4},
                {4, 5, 6, 6, 7},
                {7, 8, 9, 8, 4, 1, 5}
        };
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }
}
