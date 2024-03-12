package com.org.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("자바 소트 - 리스트를 넣으면 정렬된 결과를 리턴")
    @Test
    void given_List_WhenExcuting_ThenReturnSortedList() {
        // given
        JavaSort<Integer> javaSort = new JavaSort<>();

        // when
        List<Integer> actual = javaSort.sort(List.of(3, 1, 2, 4, 5));

        // then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}