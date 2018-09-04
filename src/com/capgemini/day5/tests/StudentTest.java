package com.capgemini.day5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.Student;
import com.capgemini.day5.TaxCalculator;

class StudentTest {
	
	@Test
	void testAgeNotWithinRange() {
		Exception e;
		e =  assertThrows(Exception.class, () -> Student.studentDetails(276,"swathi",22,"Java"));
		assertEquals("Age not within the range",e.getMessage());
	}
	@Test
	void testNameNotValidOption() {
		
	}

}
