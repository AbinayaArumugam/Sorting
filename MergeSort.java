package com.sorting;

public class MergeSort {
    public static void mSort(int[] arr,int i,int j){
        if(i<j){
            int mid=i+(j-i)/2;
            mSort(arr,i,mid);
            mSort(arr,mid+1,j);
            mergeSort(arr,i,mid,j);

        }
    }
    public static void mergeSort(int[] arr,int left,int mid,int right){
       int n1=mid-left+1;
       int n2=right-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;++i)
            l[i]=arr[left+i];
        for(int j=0;j<n2;++j)
            r[j]=arr[mid+1+j];
        int i=0,j=0;
         int k=left;
       while (i<n1&&j<n2){
           if(l[i]<=r[j]){
               arr[k]=l[i];
               i++;
           } else {
               arr[k]=r[j];
               j++;
           }
           k++;
       }
       while(i<n1){
           arr[k]=l[i];
           i++;
           k++;
       }
       while (j<n2){
           arr[k]=r[j];
           j++;k++;
       }
    }
    public static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
