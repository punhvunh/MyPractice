package by.epam.learn.fundaments.arrays.bounds;

import java.util.Arrays;

public class ArrayBounds {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 25, -6};
        int [] arrayNew = changeArray(array,6);
        System.out.println(Arrays.toString(arrayNew));
        System.out.println(Arrays.toString(changeArrayNext(arrayNew)));
    }
    public static int[] changeArray(int []array, int value){
        for (int i = 0; i < array.length; i++) {
            array[i] += value++;
        }
        return array;
    }
    // так нельзя изменить данные массива в примитивных типах
    public static int[] changeArrayNext(int []array){
        for (int element: array) {
            element += 1;
        }
        return array;
    }
}
