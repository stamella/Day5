package com.capgemini.day5.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.TaxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithInvalidName() {
		Exception e;
		e = assertThrows(Exception.class, () -> TaxCalculator.calculateTax("null",true,5000));
		assertEquals("Name should not be empty",e.getMessage());
	}
	@Test
	void testCalculateTaxWithInputs() throws Exception  {
		assertEquals(6000.00,TaxCalculator.calculateTax("swathi",true,100000));
		
	}
	
	@Test
	void testCalculateTaxWithIneligible() {
		Exception e;
		e = assertThrows(Exception.class, () -> TaxCalculator.calculateTax("swathi",true,5000));
		assertEquals("Tax not eligible",e.getMessage());
		
	}
	@Test
	void testCalculateTaxWithInvalidCountry() {
	    Exception e;
		e = assertThrows(Exception.class,()->TaxCalculator.calculateTax("swathi", false, 5000));	
	    assertEquals("The employee should be an indian citizen for calculating tax",e.getMessage());
	}
	
	

}
