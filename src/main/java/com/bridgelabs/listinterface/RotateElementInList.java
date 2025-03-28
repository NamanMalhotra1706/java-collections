package com.bridgelabs.listinterface;

import java.util.*;
import java.util.List;

public class RotateElementInList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int k =2 ;

        Collections.rotate(arrayList, k);

        System.out.println(arrayList);

    }
}
