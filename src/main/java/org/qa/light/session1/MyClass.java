package org.qa.light.session1;

public class MyClass {

    public static void main(String[] args) {
        int j = 1;
//        System.out.println(++j);
//        System.out.println(j++);

        j += 10;
        System.out.println(j);
        j -= 5;
        System.out.println(j);
        j *= 2;
        System.out.println(j);
        j /= 3;
        System.out.println(j);

        System.out.println(3 == 2);
        System.out.println(2 <= 2);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 6){
                break;
            }
        }

        System.out.println("---------------------------------");

        while (j <= 100) {
            System.out.println("while: " +  j);
            j++;
            if ( j == 30){
                break;
            }
        }

        do {
            System.out.println("do while: " +  j);
            j++;
        } while (j <= 1);

//        int i = 10;
//        int j = 20;
//        int k = 11;

//        if (i != k) {
//            System.out.println("IF is working");
//        } else if (i != j) {
//            System.out.println("IF-ELSE is working");
//        } else {
//            System.out.println("ELSE is working");
//        }

//        System.out.println("END");

//        System.out.println(i == j);
//        System.out.println(i == k);
//        System.out.println(i != j);
//        System.out.println(i != k);

//        boolean bTrue = true;
//        boolean bTrue2 = true;
//        boolean bFalse = false;
//        boolean bFalse2 = false;

//        System.out.println(bFalse && bTrue);
//        System.out.println(bTrue && bFalse);
//        System.out.println(bTrue && bTrue2);
//        System.out.println(bTrue && bTrue2 && bFalse);
//        System.out.println(bTrue || bFalse);
//        System.out.println(bFalse2 || bTrue || bFalse);

//        System.out.println(
//                (bTrue && bFalse2) // true && false -> false
//                        || // false || true
//                (bTrue != bFalse2) // true != false -> true
//        ); //-> true


    }
}