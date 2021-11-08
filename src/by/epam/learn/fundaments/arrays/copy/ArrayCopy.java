package by.epam.learn.fundaments.arrays.copy;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] array = {1, 2 ,3 , 4};
        int [] hold = {51, 52 , 55 ,56, 58, 59 ,60};
        System.arraycopy(array,1,hold,2,array.length-1);
        System.out.println(Arrays.toString(hold));
    }
}
