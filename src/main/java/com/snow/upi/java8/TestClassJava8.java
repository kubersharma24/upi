package com.snow.upi.java8;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestClassJava8 {
	public static void main(String[] args) {
		/*                                                   			 d/m/yy    
		 *          Java 8-Questions 				  					 4/1/26 * 20/01/26 * 6/02/26* 9/02/26
		 *         Easy (1-15) - Basic
		 *  1. Find the maximum element in an integer array.  			done	   d			d		d	
		 *  2. Find the minimum element in an integer array.  			done	   d			d		d
		 *  3. Find the sum of all elements in an array.  	  			done       d			d		d
		 *  4. Count the number of elements in a list.        			done       d			d		d
		 *  5. Print all even numbers from a list.            			done	   d			d		d
		 *  6. Print all odd numbers from a list.             			done	   d			d		d
		 *  7. Count how many numbers are greater than 10     			done	   d			d		d
		 *  8. Remove duplicate elements from a list.         			done       d			d		d
		 *  10.Sort a list in descending order.				  			done       d			d		d
		 *  9. Sort a list in ascending order.				  			done       d			d		d
		 *  11.Convert int[] to List<Integer>.                			done	   d			d		d
		 *  12.Find the first element in a list.			  			done	   d      		d		d
		 *  13.Check if any number is negative.				  			done	   d			d		d
		 *  14.Check if all numbers are positive.			  			done	   d			d		d
		 *  15.Multiply each element by 2 and collect to a list. 		done       d			d		d
		 *  
		 *  		
		 *  		MEDIUM (16–35) — Real Interview Level				
		 *  16.Find the second largest element in an array.				done	   d			d		d
		 *  17.Find the third smallest element in an array.				done	   d			d		d
		 *  18.Find the top 3 maximum numbers.							done	   d			d		d
	p    *  19.Find the longest string in a list.						done	   d			d		d
		 *  20.Find the shortest string in a list.						done	   d			d		d
		 *  21.Count occurrences of each number in a list.				done       d			d		d
		 *  22.Count occurrences of each character in a string.			done	   d			d		d
	p	 *  23.Find duplicate numbers in a list.                        done	   d 			d		d
		 *  24.Find unique numbers in a list.							done	   d			d		d
		 *  25.Find the first non-repeated character in a string.				   d			d		d
		 *  26.Find the first repeated character in a string.	                   d			d		d
		 *  27.Group numbers by even and odd.                                      d			d		d
		 *  28.Partition numbers by greater than 50.                               d			d		d
		 *  29.Convert a list of strings to uppercase.							   d			d		d
		 *  30.Join strings with a comma separator.								   d			d		d
		 *  31.Find the sum of squares of numbers.                                 d			d		d
		 *  32.Find the average of numbers.                                        d			d		d
		 *  33.Find the maximum number less than 100.							   d			d		d
	p	 *  34.Reverse a List                                                      d 			d		d
		 *  34.1. Check if a list is a palindrome.								   d			d		d
		 *  35.Sort strings by length.											   d			d		d
		 *  	
		 *  			OBJECT / EMPLOYEE BASED (36–45) — Most Asked
		 *  		class Employee {
					    int id;
					    String name;
					    String department;
					    double salary;
					}	
		 *  36.Find the employee with the highest salary.												d
		 *  37.Find the employee with the lowest salary.												d
		 *  38.Find the average salary of all employees.												d
		 *  39.Group employees by department.															d
		 *  40.Count employees in each department.														d					
		 *  41.Find the highest paid employee in each department.										-
		 *  42.Sort employees by salary descending.														d			
		 *  43.Find employees with salary greater than 50,000.											d	
		 *  44.Get a list of employee names from a list of employees.									d	
		 *  45.Find the department with the highest average salary.										-
		 *  
		 *  		ADVANCED (46–50) — Senior-Level / Tricky	
		 *  46.Flatten a List<List<Integer>> into a single list.                   d 					d
		 *  47.Find the intersection of two lists.								   d					d
		 *  48.Find the union of two lists.										   -					-
		 *  49.Find the difference between two lists.							   d					d
		 *  50.Find the longest word in a sentence using streams.                  d 					d				
	eg	 *  51.Reverse String.													   d					d
	eg	 *  52.Merge two list.                                                     d					d
	eg	 *  53.Reverse Words in sentence using stream.                             d					d
		 *  54.Return Common numbers from two List.                                d					d
	eg	 *  55.Convert List Of Emp to map. (key = e_id, val = emp)                 d					d
	
					.reduce()	
		 *  56.Find the sum of all elements using reduce()												d
		 *  57.Find the product of all numbers															d
		 *  58.Find the maximum element using reduce()													d
		 *  59.Find the minimum element using reduce()													d
		 *  60.Concatenate a list of strings using reduce()												-
		 *  Reverse a string using streams + reduce()													d
		 *  Find the longest string using reduce()														d
		 *  Find the sum of salaries of all employees using reduce()									d	
		 *  Find the employee with max salary using reduce()											d	
		 *  Find the total number of characters in a list of strings									d
		 *  
		 *  		Collectors.groupingBy()
		 *  Group employees by department and count 													-
		 *  Group employees by department and average salary											-
		 *  Group numbers by range (0–50, 51–100)														-	
		 *  Group strings by length																		d
		 *  Group words by first character																d
		 *  			
		 *  		flatMap() (VERY COMMON)
		 *  Convert List<List<Integer>> → List<Integer>                                                 d
		 *  Extract all words from a list of sentences													d			
		 *  Flatten a list of employees’ skills															-	
		 *  Find distinct words from multiple sentences													-
		 *  Count total elements after flattening														-
		 *  
		 *  	map()
		 *  Sort Characters in String By Frequency // tree -> eetr/eert
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

//class Employee {
//    int id;
//    int salary;
//    String dep;
//    String name;
//    
//    Employee(int a, int d, String b, String c){
//      this.id = a; this.name = c ; this.dep = b ; this.salary = d ;
//    }
//    
//@Override
//public boolean equals(Object o ){
//if(this == o ) return true;
//else if (o == null || o.getClass() != this.getClass()) return false;
//Employee e = (Employee) o;
//
//return e.id == this.id && Objects.equals(name, e.name) && Objects.equals(dep, e.dep) && e.salary == this.salary;
//}
//
//
//@Override
//public int hashCode(){
//return Objects.hash(id,name,dep,salary);
//}
//
//@Override
//public String toString(){
//return id +" : "+name+" : "+dep+" : "+salary+"\n"; 
//}
//}
//
//
//Employee e1 = new Employee(1,20_000,"IT","A1");
//Employee e2 = new Employee(2,30_000,"IT","A2");
//Employee e3 = new Employee(3,40_000,"IT","A3");
//Employee e4 = new Employee(4,70_000,"IT","A4");
//Employee e5 = new Employee(5,30_000,"IT","A5");
//Employee e6 = new Employee(6,20_000,"IT","A6");
//Employee e7 = new Employee(7,30_000,"IT","A7");
//Employee e8 = new Employee(8,80_000,"FINANCE","A8");
//Employee e9 = new Employee(9,990_000,"FINANCE","A9");
//Employee e10 = new Employee(9,990_000,"FINANCE","A9");
//List<Employee> list = Arrays.asList(e1,e9,e3,e4,e5,e6,e7,e8,e2,e10);
//System.out.println(e10.hashCode() == e9.hashCode());
//System.out.println(e10 == e9);
//System.out.println(e10.equals(e9));