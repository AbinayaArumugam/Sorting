package com.sorting;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapToSort {
    public static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static int minSwap(int[] arr){
        int len=arr.length;
        int ans=0;
        int[] temp= Arrays.copyOfRange(arr,0,len);
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        Arrays.sort(temp);
        for(int i=0;i<len;i++){
            hash.put(arr[i],i);
        }
        for(int i=0;i<len;i++){
            if(arr[i]!=temp[i]){
                ans++;
                int init=arr[i];
                swap(arr,i,hash.get(temp[i]));
                hash.put(init,hash.get(temp[i]));
                hash.put(temp[i],i);
            }
        }
        return ans;
    }
}
