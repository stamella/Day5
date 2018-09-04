package com.capgemini.day5;

public class TaxCalculator {

	public static Object calculateTax(String employeeName,boolean isIndian, double empSal) throws Exception {
		 double tax;
		if(isIndian == true && employeeName != "" && employeeName != "null") {
		      if(empSal > 100000)
			   return tax = (empSal * 8)/100;
		    else if(empSal > 50000 && empSal <= 100000)
			   return tax = (empSal * 6)/100;
		    else if(empSal > 30000 && empSal <= 50000)
			   return tax = (empSal * 5)/100;
		    else if(empSal >= 10000 && empSal <= 30000)
			   return tax = (empSal * 4)/100;
		    else
	           throw new Exception("Tax not eligible");
	    }
	    else if(isIndian == false)
	    throw new Exception("The employee should be an indian citizen for calculating tax");
	    else
	    throw new Exception("Name should not be empty");			
		
}
}

	