package com.sorting;

import java.util.Arrays;

public class ArraysEqualOrNot {
    public static boolean checkArraysAreEqual(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

