package org.itstep;

import java.util.Arrays;

public class Qw4 { //гномья сортировка
    public static int a[] = {5, 3, 1, 7, 9, 4, 2, 3, 8};
    public static void main(String[] args) {
        //bubbleSort(); // ?
        //gnomeSort(); //гномья сортировка
        for (int i=1; i<a.length; i++){
            int spec=a[i];
            int j;
            for (j=i; j>0&&spec<a[j-1]; j--)
                a[j]=a[j-1];
            a[j]=spec;
        }
        System.out.println(Arrays.toString(a));
    }

        public static void bubbleSort(){
            for (int i = 0; i<a.length-1; i++)
                for (int j = 0; j<a.length-1-i; j++)
                    if (a[j] > a[j + 1])
                        swap(j, j + 1);
            System.out.println(Arrays.toString(a));
        }

        public static void gnomeSort(){

    }
    public static void insertion(){

    }
    public static void swap(int i,int j ){
        int temp =a[i];;
        a[i]=a[j];
        a[j]=temp;

    }
}
