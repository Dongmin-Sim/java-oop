package com.org.javaoop;

import com.org.javaoop.logic.BubbleSort;
import com.org.javaoop.logic.JavaSort;
import com.org.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("result : " + sort.sort(Arrays.asList(args)));
    }
}
