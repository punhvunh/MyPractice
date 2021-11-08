package by.epam.learn.fundaments.arrays.multi;

import java.util.Arrays;

public class MultiDim {
    public static void main(String[] args) {
        int[][] arrayDim = new int[][]{{1, 3, 4, 4}, {5, 6}};
        int[][] arrayDim3 = {{1, 3, 4, 4}, {5, 6, 25}};
        int x = arrayDim[0][3];
        System.out.println(x);
        System.out.println(Arrays.deepToString(createMultiDim()));
    }
        public static  String[][] createMultiDim() {
            String[][] arrayDim2 = new String[5][4];
            for (int i = 0; i < arrayDim2.length; i++) {
                for (int j = 0; j < arrayDim2[j].length; j++) {
                    arrayDim2[i][j] = String.valueOf(i + j);
                }
            }
            return arrayDim2;
        }
}
