package com.sorting;

public class SortedOrNot {
    public static boolean checkSort(int[] arr){
        int len=arr.length;
        if(len==0||len==1){
            return true;
        }
        for(int i=1;i<len;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
