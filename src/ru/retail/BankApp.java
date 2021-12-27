package ru.retail;

import ru.retail.kassa.MoneyKassa;

public class BankApp extends Object {


    public static void main(String[] args) {

        int count = 10, count2 = 11;

/*        while (count < 10) {
            count++;
            System.out.println(count);
        }

        do {
            count++;
            System.out.println(count2);
        } while (count2 < 10);*/

        for(int m = 1, j = 10; m <= 3; m++, j=j+6) {
            System.out.println("Полка и ячейка [" + m  + "]");
        }

/*    n =  1   2   3  4    5     6  7
       -----------------------------
       3 | x | m| x | x | x | x | x |
       2 | x | m| x | x | x | x | x |
       1 | x | m| x | x | x | x | x |
       m
       */


    }

}


// public static boolean giveCredit(boolean pol, int age) {
//    return (pol == false && age > 20) || pol;


//  boolean clientPol = false; // false - женщина , true - мужчина
//  int age = 20;


//  System.out.println(giveCredit(clientPol, age)); //  boolean pol = clientPol;  int age = age

/*    public static boolean giveCredit(int age, boolean hasCredit, boolean mOrF) {
        return (age > 30 && !hasCredit && mOrF) || !mOrF; // false || true
}*/


