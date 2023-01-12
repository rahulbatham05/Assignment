package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListRemoveDuplicate {
	
//	Write a program that will remove duplicate values from List
//	Input – Java, TestNG, Maven, Java, 
//	Output – Java, TestNG, Maven


	public static void main(String[] args) {
		List <String> course=new ArrayList<>();
		Set<String> newCourse=new HashSet<>();
		course.add("Java");
		course.add("TestNG");
		course.add("Maven");
		course.add("Java");
		
		newCourse.addAll(course);
		System.out.println("After removing the duplicates "+newCourse);
		

	}

}
