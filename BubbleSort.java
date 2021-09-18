package com.sorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       return arr;
    }
}
