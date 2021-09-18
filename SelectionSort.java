package com.sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }

        return arr;
    }
}
