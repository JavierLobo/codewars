package com.javierlobo.codewars.main.katatest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.javierlobo.codewars.main.kata.ValidateCreditCardNumber;

class ValidateCreditCardNumberTest {

	@Test
	void testValidadte() {
		assertEquals(false, new ValidateCreditCardNumber("954").validadte("954"));
	}
}
