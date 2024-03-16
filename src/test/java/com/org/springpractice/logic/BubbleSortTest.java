package com.org.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블 소트 - 리스트를 넣으면 정렬된 결과를 리턴")
    @Test
    void given_List_WhenExcuting_ThenReturnSortedList() {
        // given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // when
        List<Integer> actual = bubbleSort.sort(List.of(3, 1, 2, 4, 5));

        // then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}