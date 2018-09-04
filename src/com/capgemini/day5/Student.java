package com.capgemini.day5;


public class Student {

	public static Object studentDetails(long rollNo , String studentName, int age, String course) throws Exception {

		if(age < 15 && age > 21) {
			throw new Exception("Age not within the range");
	}
		return null;
		
		
		
	}

}
