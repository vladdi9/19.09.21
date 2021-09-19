package org.itstep;

import java.util.Arrays;

// Двумерные масивы
public class Qw5 {
    public static int numRow = 5;
    public static int numCols = 6;
    private static int[][] arr = new int[numRow][numCols];

    public static void main(String[] args) {
        fillOrderYD();
        System.out.println(arrToStringAligned());
    }
    public static void fillOrder(){
        for (int i=0; i<numRow; i++)
            for (int j=0; j<numCols; j++)
                arr[i][j]=i*numCols+j+1;
        System.out.println(Arrays.toString(arr));
    }
    public static String arrtoString() {
        fillOrder();
        StringBuilder resalt = new StringBuilder();
        String separator = ",";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                resalt.append(arr[i][j]);
                if (j != arr[i].length - 1)
                    resalt.append(separator);
            }
            resalt.append("\n");
        }
            return resalt.toString();
    }
    public static String arrToStringAligned() {
        StringBuilder result = new StringBuilder();
        String pad = "     ";
        for (int i = 0; i < numRow; i++) {
            for (int j = 0; j < numCols; j++) {
                String sNumber = Integer.toString(arr[i][j]);
                String sPadded = pad.substring(sNumber.length()) + sNumber;
                if (j == 0) result.append(sNumber);
                else
                    result.append(sPadded);
            }
            result.append("\n");
        }
        return result.toString();
    }
    public static void fillOrderYD(){
        for (int i=0; i<numRow; i++)
            for (int j=0; j<numCols; j++)
                arr[i][j]=j*numCols+i+1;
        System.out.println(Arrays.toString(arr));
    }
}
