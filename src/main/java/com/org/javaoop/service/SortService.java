package com.org.javaoop.service;

import com.org.javaoop.logic.JavaSort;
import com.org.javaoop.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    // sort service 가 어떤 정렬 방식을 사용할지 알고 있음.
    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
