package by.epam.learn.fundaments.arrays.creating;

import java.util.Arrays;

public class ArrayCreating {
    int [] array = new int [10];

    String [] array2 = {"Fedor", "Foka"};
    int [] array3 , b;
    int array4 [], a; //array int
    int [] array5 = new int[] {1 ,4 ,5 ,6};
    public static void arrayCreator(){
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 100 +i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        String[] strings = createStringArray(5);
        ArrayCreating.arrayCreator();
        System.out.println(Arrays.toString(strings));
        int [] array1 = new int[50];
        array1 = new int[33];
    }

    public static  String[] createStringArray(final int SIZE){
        String[] strings = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }
}
