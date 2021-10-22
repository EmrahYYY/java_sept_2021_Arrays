package be.intecbrussel.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = 7 * i;
        }

        for (int myNumber : array) {
            System.out.println(myNumber);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        boolean[] boolArray = new boolean[]{true, false, true, false, false, true};
        for (boolean myBoolean : boolArray) {
            System.out.println(myBoolean);
        }


    }
}
