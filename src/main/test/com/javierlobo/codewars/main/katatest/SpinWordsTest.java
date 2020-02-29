package com.javierlobo.codewars.main.katatest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.javierlobo.codewars.main.kata.SpinWords;

class SpinWordsTest {

	@Test
	void testSpinWords() {
        assertEquals("emocleW", new SpinWords().SpinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().SpinWords("Hey fellow warriors"));
    }
}
