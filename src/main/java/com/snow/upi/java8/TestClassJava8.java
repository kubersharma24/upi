package com.snow.upi.java8;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestClassJava8 {
	public static void main(String[] args) {
		/*                                                   			d/m/yy
		 *          Java 8-Questions 				  					 4/1/26 
		 *         Easy (1-15) - Basic
		 *  1. Find the maximum element in an integer array.  			done	
		 *  2. Find the minimum element in an integer array.  			done
		 *  3. Find the sum of all elements in an array.  	  			done
		 *  4. Count the number of elements in a list.        			done
		 *  5. Print all even numbers from a list.            			done
		 *  6. Print all odd numbers from a list.             			done
		 *  7. Count how many numbers are greater than 10     			done
		 *  8. Remove duplicate elements from a list.         			done
		 *  10.Sort a list in descending order.				  			done
		 *  9. Sort a list in ascending order.				  			done
		 *  11.Convert int[] to List<Integer>.                			done
		 *  12.Find the first element in a list.			  			done
		 *  13.Check if any number is negative.				  			done
		 *  14.Check if all numbers are positive.			  			done
		 *  15.Multiply each element by 2 and collect to a list. 		done
		 *  		
		 *  		MEDIUM (16–35) — Real Interview Level				
		 *  16.Find the second largest element in an array.				done
		 *  17.Find the third smallest element in an array.				done
		 *  18.Find the top 3 maximum numbers.							done
	p    *  19.Find the longest string in a list.						done
		 *  20.Find the shortest string in a list.						done
		 *  21.Count occurrences of each number in a list.				done
		 *  22.Count occurrences of each character in a string.			done
	p	 *  23.Find duplicate numbers in a list.                        done
		 *  24.Find unique numbers in a list.							done
		 *  25.Find the first non-repeated character in a string.		
		 *  26.Find the first repeated character in a string.
		 *  27.Group numbers by even and odd.
		 *  28.Partition numbers by greater than 50.
		 *  29.Convert a list of strings to uppercase.
		 *  30.Join strings with a comma separator.
		 *  31.Find the sum of squares of numbers.
		 *  32.Find the average of numbers.
		 *  33.Find the maximum number less than 100.
		 *  34.Check if a list is a palindrome.
		 *  35.Sort strings by length.
		 *  
		 *  			OBJECT / EMPLOYEE BASED (36–45) — Most Asked
		 *  		class Employee {
					    int id;
					    String name;
					    String department;
					    double salary;
					}
		 *  36.Find the employee with the highest salary.
		 *  37.Find the employee with the lowest salary.
		 *  38.Find the average salary of all employees.
		 *  39.Group employees by department.
		 *  40.Count employees in each department.
		 *  41.Find the highest paid employee in each department.
		 *  42.Sort employees by salary descending.
		 *  43.Find employees with salary greater than 50,000.
		 *  44.Get a list of employee names from a list of employees.
		 *  45.Find the department with the highest average salary.
		 *  
		 *  		ADVANCED (46–50) — Senior-Level / Tricky
		 *  46.Flatten a List<List<Integer>> into a single list.
		 *  47.Find the intersection of two lists.
		 *  48.Find the union of two lists.
		 *  49.Find the difference between two lists.
		 *  50.Find the longest word in a sentence using streams.
		 *  
		 */
		int arr[] = {5,4,3,2,1,2,8,4,9,3,1,2,4,9};
		
		/* 19
		 *  
		 * List<String> list = Arrays.asList("a","bb","ccc","dddd"); 
		 * String s = list.stream().max((a,b)->Integer.compare(a.length(),b.length())).orElse(null);
		 * 
		 */
		
		/* 20
		 * 
		 * List<Integer> map = list.stream().collect(Collectors.groupingBy(x-> x,Collectors.counting())). entrySet().stream().filter(a->a.getValue() !=
		 * 1).map(a->a.getKey()).collect(Collectors.toList());
		 * 
		 */
	}
}
