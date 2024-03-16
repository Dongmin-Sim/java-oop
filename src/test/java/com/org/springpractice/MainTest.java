package com.org.springpractice;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void main() {
        // given
        String[] args = {"2", "3", "1"};

        // when & then
        Main.main(args);
    }
}