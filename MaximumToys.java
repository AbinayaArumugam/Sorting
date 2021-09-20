package com.sorting;

public class MaximumToys {
    public static int MaxToys(int[] arr,int n,int k){
        int sum=0;int count=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum<=k){

                count++;
            }
        }
        return count;
    }
}
