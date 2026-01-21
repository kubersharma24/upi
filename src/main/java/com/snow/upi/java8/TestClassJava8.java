package com.snow.upi.java8;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestClassJava8 {
	public static void main(String[] args) {
		/*                                                   			 d/m/yy    
		 *          Java 8-Questions 				  					 4/1/26 * 20/01/26
		 *         Easy (1-15) - Basic
		 *  1. Find the maximum element in an integer array.  			done	   d
		 *  2. Find the minimum element in an integer array.  			done	   d
		 *  3. Find the sum of all elements in an array.  	  			done       d
		 *  4. Count the number of elements in a list.        			done       d
		 *  5. Print all even numbers from a list.            			done	   d
		 *  6. Print all odd numbers from a list.             			done	   d
		 *  7. Count how many numbers are greater than 10     			done	   d
		 *  8. Remove duplicate elements from a list.         			done       d
		 *  10.Sort a list in descending order.				  			done       d
		 *  9. Sort a list in ascending order.				  			done       d
		 *  11.Convert int[] to List<Integer>.                			done	   d
		 *  12.Find the first element in a list.			  			done	   d
		 *  13.Check if any number is negative.				  			done	   d
		 *  14.Check if all numbers are positive.			  			done	   d	
		 *  15.Multiply each element by 2 and collect to a list. 		done       d
		 *  		
		 *  		MEDIUM (16–35) — Real Interview Level				
		 *  16.Find the second largest element in an array.				done	   d
		 *  17.Find the third smallest element in an array.				done	   d
		 *  18.Find the top 3 maximum numbers.							done	   d
	p    *  19.Find the longest string in a list.						done	   d	
		 *  20.Find the shortest string in a list.						done	   d
		 *  21.Count occurrences of each number in a list.				done       d
		 *  22.Count occurrences of each character in a string.			done	   d
	p	 *  23.Find duplicate numbers in a list.                        done	   d 
		 *  24.Find unique numbers in a list.							done	   d
		 *  25.Find the first non-repeated character in a string.				   d
		 *  26.Find the first repeated character in a string.	                   d
		 *  27.Group numbers by even and odd.                                      d
		 *  28.Partition numbers by greater than 50.                               d
		 *  29.Convert a list of strings to uppercase.							   d
		 *  30.Join strings with a comma separator.								   d
		 *  31.Find the sum of squares of numbers.                                 d
		 *  32.Find the average of numbers.                                        d
		 *  33.Find the maximum number less than 100.							   d
	p	 *  34.Reverse a List                                                      d
		 *  34.1. Check if a list is a palindrome.								   d
		 *  35.Sort strings by length.											   d
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
		 *  46.Flatten a List<List<Integer>> into a single list.                   d
		 *  47.Find the intersection of two lists.								   d
		 *  48.Find the union of two lists.										   -
		 *  49.Find the difference between two lists.							   d
		 *  50.Find the longest word in a sentence using streams.                  d 
	eg	 *  51.Reverse String.													   d
	eg	 *  52.Merge two list.                                                     d
	eg	 *  53.Reverse Words in sentence using stream.                             d
		 *  54.Return Common numbers from two List.                                d
	eg	 *  55.Convert List Of Emp to map. (key = e_id, val = emp)                 d
		 *  
		 */
		int arr[] = {5,4,3,2,1,2,8,4,9,3,1,2,4,9};
		
		/*
		 * eg 
		 * 
		 * IntStream.range()
		 * boolean map = IntStream.range(0,list.size()/2).allMatch(i->list.get(i).equals(list.get(list.size()-i-1)));
		 * 
		 * flatMap()
		 * List<Integer> ans = list.stream().flatMap(a->a.stream()).collect(Collectors.toList());
		 * 
	  51 * Stream.of() // reverser string 
		 * String ans = Stream.of(str1.split("")).reduce(" ", (a,b)-> b+a); 
		 * 
		 * Stream.concat() // join two List
	  52 * List<Integer> ans = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		 * 
		 * 
	  53 * rev word in String
		 * String ans = Stream.of(str1.split(" ")).map(a->{ StringBuilder sb = new StringBuilder(a);
																          sb.reverse();
																          return sb.toString();
																      }).collect(Collectors.joining(" "));
		 * 
		 * 
	  55 * Map<Integer, Employee> map = list.stream().collect(Collectors.toMap(a->a.id, (a)->a)); 
		 * 
		 * 
	     */ 
		
		
		
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
		
		/*
		 * 34
		 * 
		 * List<Integer> map = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(), l->{Collections.reverse(l); return l ;}));
		 * 
		 */
	}
}
