package com.bridgelabs.setinterface;

import java.util.*;

public class UnionAndIntersection {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        set1.add(1);
        set1.add(2);
        set1.add(3);


        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> unionResult = union(set1, set2);
        Set<Integer> intersectionResult = intersection(set1, set2);

        // Print Results
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);
    }
}
