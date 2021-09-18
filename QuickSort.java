package com.sorting;

public class QuickSort {
    public static int[] swap(int[] arr,int i,int j){
     int  temp=arr[i] ;
     arr[i]=arr[j];
     arr[j]=temp;

     return arr;
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int pivotPos= partition(arr,start,end);
            quickSort(arr,start,pivotPos-1);
            quickSort(arr,pivotPos+1,end);
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return (i+1);

    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
