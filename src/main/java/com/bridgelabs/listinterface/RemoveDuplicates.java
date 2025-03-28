package com.bridgelabs.listinterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int ele :list){
            set.add(ele);
        }

        ArrayList<Integer> ansList = new ArrayList<>();

        int listIx = 0;

        while(listIx<list.size()){
            int element = list.get(listIx);
            if(set.contains(element)){
                set.remove(element);
                ansList.add(element);
            }
            listIx++;
        }

        System.out.println(ansList);
    }
}
