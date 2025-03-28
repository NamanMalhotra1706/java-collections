package com.bridgelabs.listinterface;
import java.util.*;

public class NthElement {
    public static String findNthFromEnd(LinkedList<String> list, int N) {
        if (list == null || N <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        ListIterator<String> first = list.listIterator();
        ListIterator<String> second = list.listIterator();

        // Move first pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is greater than the size of the list");
            }
            first.next();
        }


        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;
        System.out.println(findNthFromEnd(list, N));
    }
}
