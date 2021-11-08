package by.epam.learn.fundaments.arrays.reference;

public class ArrayReference {
    public static void main(String[] args) {
        int [] array = {1, 42};
        Object object = array;
        int x = ((int[])object)[0];
        System.out.println(x);

        int[][] array1 = {{54, 68, 90},{1, 2, 3}};
        Object object1 = array1;
        Object object2 = array1[0];
        int y = ((int[][])object1)[0][0];
        System.out.println(y);
    }
}
