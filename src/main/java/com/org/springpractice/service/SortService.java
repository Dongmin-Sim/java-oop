package com.org.springpractice.service;

import com.org.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(
            @Qualifier(value = "bubbleSort")
            Sort<String> sort
    ) {
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    // sort service 가 어떤 정렬 방식을 사용할지 알고 있음.
    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
