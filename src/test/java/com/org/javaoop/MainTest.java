package com.org.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
        // given
        String[] args = {"2", "3", "1"};

        // when & then
        Main.main(args);
    }

}