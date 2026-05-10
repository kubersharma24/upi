package com.snow.upi.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
Questions
1. Find max element in an array
	ans:  int [] num = {1,2,3,4,5,6,7,8};
	      int a = Arrays.stream(num).max().getAsInt();
	      System.out.println(a); // 8
	      
2. Find min element in an array
	ans:  int [] num = {1,2,3,4,5,6,7,8};
	      int a = Arrays.stream(num).min().getAsInt();
	      System.out.println(a); //1
	
3. Sum of all Values in Array
	ans : int [] num = {1,2,3,4,5,6,7,8};
	      int a = Arrays.stream(num).sum();
	      System.out.println(a); //36

4. Sum of all Values in List
	ans : Integer [] num = {1,2,3,4,5,6,7,8};	
	      //List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
	      List<Integer> list = Arrays.asList(num);
	      int a = list.stream().mapToInt(x -> x).sum();
	      System.out.println(a); //36

	
5. Count numbers elements in list/array
	ans : Integer [] num = {1,2,3,4,5,6,7,8};	
	      //List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
	      List<Integer> list = Arrays.asList(num);
	      long a = list.stream().mapToInt(x -> x).count();
	      System.out.println(a); //8
	  
6. Return Second Largest
	ans : int [] num = {1,2,3,4,5,6,6,7,7,9,8};	
	      int a = Arrays.stream(num).sorted().skip(num.length-2).findFirst().getAsInt();
	      System.out.println(a); //8

7. Return first Odd number
	ans : int [] num = {1,2,3,4,5,6,6,7,7,9,8};	
	      int a = Arrays.stream(num).filter(x -> x%2==0 ).findFirst().getAsInt();
	      System.out.println(a); //2

8. Return list of Odd numbers
	ans : // 1 way with premitive
		  int [] num = {1,2,3,4,5,6,7,8};	
	      List<Integer> l = Arrays.stream(num).filter(x -> x%2==0 ).boxed().collect(Collectors.toList());
	      
	      // 2 way with premitive
//	      Integer [] num = {1,2,3,4,5,6,7,8};
//	      List<Integer> list = Arrays.asList(num);
//	      List<Integer> l  = list.stream().filter(x -> x%2==0 ).collect(Collectors.toList());
	      System.out.println(l); // [2, 4, 6, 8]

9. Count of odd numbers 
	ans : int [] num = {1,2,3,4,5,6,7,8};	
	      long c = Arrays.stream(num).filter(x -> x%2==0 ).count();
	      System.out.println(c); //4
	      
10. Square the List and return list
	ans : Set<Integer> set = new HashSet<>(List.of(1,2,4,5));
			Function<Integer, Integer > f = a -> a*a;
	      int [] num = {1,2,3,4,5,6,7,8};	
	      List<Integer> c = Arrays.stream(num).map(x -> f.apply(x)).boxed().collect(Collectors.toList());
	      System.out.println(c); //[1, 4, 9, 16, 25, 36, 49, 64]
	      
11. Return List of ele > 10
	ans : int [] num = {11,2,13,4,15,6,17,18};
	      Predicate<Integer> p = a -> a>10; 
	      List<Integer> c = Arrays.stream(num).filter(a -> p.test(a)).boxed().collect(Collectors.toList()); 
	      System.out.println(c); //[11, 13, 15, 17, 18]
	      
12. Return Frequency of Elements in String
	asn : String s = "123456123456654";Map<Character, Long > map2 = s.chars().mapToObj(a -> (char) a)
	    		  .collect(Collectors.groupingBy( a -> a, Collectors.counting()));
	      System.out.println(map2); // {1=2, 2=2, 3=2, 4=3, 5=3, 6=3}
	      
13. Print all the Duplicates in the String 
	ans : String s = "123456123456654";
	      s.chars().mapToObj(a -> (char) a)
	    		  .collect(Collectors.groupingBy( a -> a, Collectors.counting()))
	    		  .entrySet()
	    		  .stream()
	    		  .filter(e -> e.getValue()>1)
	    		  .forEach(e-> System.out.print(e.getKey()+" ")); // 1 2 3 4 5 6 
	    		  
14. Grouped Annagram with Java 8
	ans : String s = "123456123456654";
	      List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
	      List<List<String>> l = list.stream().collect(Collectors.groupingBy( a -> { 
	    	  					char [] ch = a.toCharArray();
	    	  					Arrays.sort(ch);
	    	  					return new String(ch);
	      						}))
	    		  .values()
	    		  .stream()
	    		  .collect(Collectors.toList());
	      System.out.println(l); // [[eat, tea, ate], [bat], [tan, nat]]
	      
	      or 
	      
	      Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(a -> {
	    	  char ch [] = a.toCharArray();
	    	  Arrays.sort(ch);
	    	  return new String(ch);
	      }));
	      List<List<String>> ans = map.values().stream().toList();
	      System.out.println(ans);
	     
15. Count Frequency of String in list
	ans : List<String> words = List.of("java", "python", "java", "c", "python", "java");
		  Map<String, Long> map = words.stream().collect(Collectors.groupingBy(a-> a, Collectors.counting()));
	      System.out.println(map); // {python=2, c=1, java=3}
	      
16. Group odd Even Number
	ans : List<Integer> nums = List.of(1,2,3,4,5,6);
		  Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.groupingBy(n -> n%2 == 0 ));
		  System.out.println(map); // {false=[1, 3, 5], true=[2, 4, 6]}
		
17. Group String by there length 
	ans : List<String> words = List.of("a", "bb", "ccc", "dd", "eee");
		  Map<Integer, List<String>> map = words.stream().collect(Collectors.groupingBy(a->a.length()));
		  System.out.println(map); //{1=[a], 2=[bb, dd], 3=[ccc, eee]}
		
18. Count of String With same length
	ans : List<String> words = List.of("apple", "bat", "cat", "banana", "dog");
		  Map<Integer, Long> map = words.stream().collect(Collectors.groupingBy( a -> a.length(), Collectors.counting()));
		  System.out.println(map); // {3=3, 5=1, 6=1}

19. Sum of Odd and Even Number in list
	ans : List<Integer> nums = List.of(1,2,3,4,5,6);
		  Map<Boolean, Integer> map = nums.stream().collect(Collectors.groupingBy( a -> a%2==0, Collectors.summingInt(a->a))); 
		  System.out.println(map); // {false=9, true=12}
		  
20. Grouping On the Basis of First Char 
	ans : List<String> words = List.of("apple", "ant", "bat", "ball", "cat");
		  Map<Character , String> map = words.stream().collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.joining(",")));
	   	  System.out.println(map); //  {a=apple,ant, b=bat,ball, c=cat}
	   	  
21. Find all Non Repeating Elements.
	ans : String s = "aabccdeef";
					s.chars().mapToObj(a-> (char) a)
					.collect(Collectors.groupingBy(b -> b, Collectors.counting()))
					.entrySet()
					.stream().filter(c -> c.getValue() == 1).forEach(x-> System.out.print(x.getKey()+" "));
					// b d f 
	
22. Find 1st Non Repeating Element.
	ans : String s = "aabccdeef";
			Character ch = s.chars().mapToObj(a-> (char) a)
							.collect(Collectors.groupingBy(b -> b, Collectors.counting()))
							.entrySet()
							.stream().filter(c -> c.getValue() == 1).map(x->x.getKey()).findFirst().orElse(null);
							//b 

23. Check if list has all even elements 
	ans : List<Integer> list = List.of(1,2,3,4,5,6);
				Boolean flag = list.stream().allMatch(a->a%2==0);
				System.out.println(flag); // false;
				
24. check if any number is less then -1;
	ans : List<Integer> list = List.of(-1,0,1,2,3,4,5,6);
		  Boolean flag = list.stream().anyMatch(a-> a<0 );
		  System.out.println(flag); // true;
		  
25. Print 1st Element of the List
	ans : List<Integer> list = List.of(1,2,3,4,5,6);
		  Optional<Integer> ans = list.stream().findFirst();
		  if(ans.isPresent())
		  System.out.println(ans.get()); // 1 
		
26. Print 3rd element of the list
	ans : List<Integer> list = List.of(1,2,3,4,5,6);
		  Optional<Integer> ans = list.stream().skip(2).findFirst();
		  if(ans.isPresent())
		  System.out.println(ans.get()); // 3 

*/



/*
 * 			Stream with User Defined DataType
 * 
 * Employee e1 = new Employee(1,20_000,"IT","A1");
Employee e2 = new Employee(2,30_000,"IT","A2");
Employee e3 = new Employee(3,40_000,"IT","A3");
Employee e4 = new Employee(4,70_000,"IT","A4");
Employee e5 = new Employee(5,30_000,"IT","A5");
Employee e6 = new Employee(6,20_000,"IT","A6");
Employee e7 = new Employee(7,30_000,"IT","A7");
Employee e8 = new Employee(8,80_000,"FINANCE","A8");
Employee e9 = new Employee(9,990_000,"FINANCE","A9");
		List<Employee> list = Arrays.asList(e1,e9,e3,e4,e5,e6,e7,e8,e2);
		Collections.sort(list, (a,b)-> Integer.compare(b.getSalary(), a.getSalary())); // sort with compartor
		
		
1. Group Employe with Same department 
	ans : Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(a->a.getDepartment()));
	   	  System.out.println(map);
	   	  
2. Max Salary from employees 
	ans : Employee e = list.stream().max((a,b)-> Integer.compare(a.getSalary(), b.getSalary())).get();
		  System.out.println(e); //Employee(id=9, salary=990000, department=FINANCE, name=A9)
		  
3. Avg. Salary of all individual department
	ans : Map<String, Double> map = list.stream().collect(Collectors.groupingBy(a-> a.getDepartment(), Collectors.averagingDouble(a ->a.getSalary())));
		System.out.println(map);

4. Count Employess i all department 
	ans : Map<String, Long> map = list.stream().collect(Collectors.groupingBy(a-> a.getDepartment(), Collectors.counting()));
		System.out.println(map); {FINANCE=2, IT=7}
		
		
5. Print top 3 Salaried Employee 
	ans : list.stream().limit(3).forEach(System.out::println);

6. Print top 2nd salaried Employee
	ans : list.stream().skip(1).limit(1).forEach(System.out::println);

7. Print top 1st salaried Employee
	ans : list.stream().limit(1).forEach(System.out::println);
*
*
*/

public class Practice_2 {
	public static void main(String[] args) {
		int arr[] = {2,3,4,2,1,5,2,3,9,8,1,3,5,1};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		List<String> list = Arrays.asList("123","12345","57854321");
		
		
		
	}
}

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee{
	private int id;
	private int salary;
	private String department;
	private String name;
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || o.getClass()!= getClass()) return false;
		Employee e = (Employee) o;
		return this.id == e.getId() && Objects.equals(name, e.name) && this.salary == e.getSalary();
			
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
	
	
}
