package School_REMASTERED.OOP;

import java.util.Arrays;

public class minCols {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 5, 7, 23},
                {11, 3, 5, 45},
                {44, 5, 5, 28},
        };

        System.out.println("Min values : " + Arrays.toString(minVal(arr)));
    }


    public static int[] minVal(int[][] arr) {
        int[] minValues = new int[arr[0].length];

        Arrays.fill(minValues, Integer.MAX_VALUE);

        int i = 0;
        int j = 0;

        while(j < arr[i].length){
            if(arr[i][j] < minValues[j]){
                minValues[j] = arr[i][j];
            }

            i++;

            if(i >= arr.length - 1){
                j++;
                i = 0;
            }
        }

        return minValues;
    }

}
