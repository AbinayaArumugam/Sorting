package com.sorting;

public class SumClosestToZero {
    public static void findClosestNumber(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(!(Math.abs(arr[i-1])<Math.abs(arr[i]))){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
        int min=Integer.MAX_VALUE;
        int x=0,y=0;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i-1]+arr[i])<=min){
                min=Math.abs(arr[i-1]+arr[i]);
                x=i-1;
                y=i;
            }
        }
        System.out.println(arr[x]+" "+arr[y]);
    }
}