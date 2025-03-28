package com.bridgelabs.listinterface;

import java.util.*;

public class ReverseAList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println("After reverse: ");
        System.out.println(arrayList);

        List<Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);

        System.out.println("Before reverse Linked List : ");
        System.out.println(linkList);
        Collections.reverse(linkList);
        System.out.println("After reverse Linked List : ");
        System.out.println(linkList);


    }
}
