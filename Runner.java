package com.sorting;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the question no");
        int question = in.nextInt();
        System.out.println("Enter the array length");
        int length=in.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<length;i++){
            arr[i]=in.nextInt();
        }
        switch (question){
            case 1:
                int[] arr1=SelectionSort.selectionSort(arr);
                for(int i=0;i<arr1.length;i++){
                    System.out.print(arr1[i] +" ");
                }
                break;
            case 2:
                int[] arr2=BubbleSort.bubbleSort(arr);
                for(int i=0;i<arr2.length;i++){
                    System.out.print(arr2[i] +" ");
                }
                break;
            case 3:
                int[] arr3=InsertionSort.insertionSort(arr);
                for(int i=0;i<arr3.length;i++){
                    System.out.print(arr3[i] +" ");
                }
                break;
            case 4:
                MergeSort.mSort(arr,0,arr.length-1);
                MergeSort.printArray(arr);
                break;
            case 5:
                QuickSort.quickSort(arr,0,arr.length-1);
                QuickSort.print(arr);
                break;
            case 6:
                System.out.println(MinimumSwapToSort.minSwap(arr));
                break;
        }
    }
}
