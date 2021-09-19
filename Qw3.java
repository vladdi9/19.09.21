package org.itstep;

//Сортировка массивов
import java.util.Arrays;

public class Qw3 {
   public static int a[] = {5, 3, 1, 7, 9, 4, 2, 3, 8};
    public static void main(String[] args) {
        //Сортировка массивов; пузырчатая сортировка
        for (int i = 0; i<a.length-1; i++)
            for (int j = 0; j<a.length-1-i; j++)
            if (a[j] > a[j + 1])
                swap(j, j + 1);
        System.out.println(Arrays.toString(a));
    }
        public static void swap(int i,int j ){
            int temp =a[i];
            a[i]=a[j];
            a[j]=temp;
    }
}
