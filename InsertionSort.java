package com.sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] arr){
      int len = arr.length;
      int key,j;
      for(int i=1;i<len;++i){
          key=arr[i];
          j=i-1;
          while (j>=0&&arr[j]>key){
              arr[j+1]=arr[j];
              j=j-1;
          }
          arr[j+1]=key;
      }
      return arr;
    }
}
