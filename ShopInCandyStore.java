package com.sorting;

public class ShopInCandyStore {
    public static int findMin(int[] arr,int len,int k){
        int res=0;
        for(int i=0;i<len;i++){
            res+=arr[i];
            len=len-k;
        }
        return res;
    }
    public static int findMax(int[] arr,int len,int k){
        int index=0;int res=0;
        for(int i=len-1;i>=index;i--){
            res+=arr[i];
            index+=k;
        }
        return res;
    }
}