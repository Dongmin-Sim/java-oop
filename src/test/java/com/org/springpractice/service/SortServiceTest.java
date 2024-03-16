package com.org.springpractice.service;

import com.org.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    // dependency injection
    private SortService sut = new SortService(new JavaSort<String>());
//    private SortService sut = new SortService(new BubbleSort<>());

    @Test
    void test() {
        // given

        // when
        List<String> actual = sut.doSort(List.of("3", "1", "2"));

        // then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}