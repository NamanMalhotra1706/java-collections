package com.bridgelabs.setinterface;

import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> ansSet = new HashSet<>();
        for(int i : set){
            if(!set2.contains(i)){
                ansSet.add(i);
            }
        }

        for(int i : set2){
            if(!set.contains(i)){
                ansSet.add(i);
            }
        }
        System.out.println(ansSet);
    }
}
