package com.sorting;

import java.util.*;

public class SortByFrequency {
    public static void sortByFrequency(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int k = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=0;i<arr.length;i++){
           int num= map.getOrDefault(arr[i],0)+1;
               map.put(arr[i],num);
            }
        Map sorted=valueSort(map);

        System.out.println(sorted);
        Set<Integer> keys=sorted.keySet();

            System.out.println("keys " + keys);
            Set set=sorted.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()){
            Map.Entry mp=(Map.Entry)i.next();
                int value = (int) mp.getValue();
                for (int j = 1; j <= value; j++) {
                    System.out.print(mp.getKey());
                }
            }

            }
        public static void main(String[] args){
            int[] arr={2,2,5,8,4,8,8,1};
            sortByFrequency(arr);
        }

        public static <K,V extends Comparable<V>>Map<K,V> valueSort(final Map<K,V> map){
        Comparator<K> valueComparator=new Comparator<K>() {

            public int compare(K key1, K key2) {
                int comp=map.get(key1).compareTo(map.get(key2));
                if(comp==0){
                    return 1;
                } else{
                    return comp*-1;
                }
            }
        };
       Map<K,V> sorted=new TreeMap<K,V>(valueComparator);
        sorted.putAll(map);
        return sorted;
        }
    }