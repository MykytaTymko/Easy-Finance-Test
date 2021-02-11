package com.mycompany.easyfinancetest.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mykyta Tymko
 */
public class Task {

    public static void main(String[] args) {

        //Task 1 example
        Integer numberSweetsForEachChild = distributeCandies(3, 1);
        System.out.println("Task 1: " + numberSweetsForEachChild);

        //Task 2 example
        String h = deleteDuplicatePoints("Hi how are you..... I am very good.");
        System.out.println("Task 2: " + h);
    }

    //Task 1
    public static Integer distributeCandies(int m, int n) {
        Integer numberCandiesForEveryone = m / n;
        return numberCandiesForEveryone;
    }

    public static String deleteDuplicatePoints(String s) {
        ArrayList<String> ArrayMain = new ArrayList<>(Arrays.asList(s.split("")));
        for (int i = 0; i < (ArrayMain.size() - 1); i++) {
            if (ArrayMain.get(i).equals(".")) {
                while (ArrayMain.get(i + 1).equals(".")) {
                    ArrayMain.remove(i + 1);
                }
            }
        }
        String[] f = ArrayMain.toArray(new String[0]);
        String str = String.join("", f);
        return str;
    }

}
