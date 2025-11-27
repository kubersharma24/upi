package com.snow.upi.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice_1 {
	public static void main(String[] args) {
		/*
		 *  https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
 			https://quescol.com/interview-preparation/java-8-coding-interview-question
 			https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
 			https://javabypatel.blogspot.com/2018/06/java-8-stream-practice-problems.html 
		 * 
		 * Filter all the odd elements 
		 * Filter all the odd elements and multiply by 2
		 * Filter all the distinct odd elements and multiply by 2 
		 * print all the odd elements with stream 
		 * sum of all the odd elements remove duplicates with stream
		 * give count of elements in list
		 * find the maximum value element present in it using Stream
		 * find the min value element present in it using Stream
		 * find the first non-repeated character in it using Stream
		 * sort all the values present in it using Stream
		 * sort all the values present in it in descending order using Stream
		 * 
		 */		

//		List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
//		List <Integer> list = Arrays.asList(6,6,6,6,6,6,6);
//		List <Integer> list = Arrays.asList(1,1,1,2,2,3,4,5,6,6,6,6);
//		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
//		Set<Integer> set = new HashSet<>();
//		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
//		List <Integer> ans = list.stream().filter( x -> x%2 == 0 ).collect(Collectors.toList());
//		List <Integer> ans = list.stream().peek(x -> System.out.println(x)).filter( x -> x%2 == 0 ).map(x -> x * 2 ).collect(Collectors.toList());
//		List <Integer> ans = list.stream().peek(x -> System.out.println(x)).filter( x -> x%2 == 0 ).distinct().map(x -> x * 2 ).collect(Collectors.toList());		
//		list.stream().sorted().filter( x -> x%2 == 0 ).forEach(a -> System.out.println("problme + "+ a));
//		int ans = list.stream().filter( x -> x%2 == 0 ).mapToInt(x -> x ).sum();
//		list.stream().filter(x -> !set.add(x)).forEach(System.out::println);	
//		long ans = list.stream().count();         
//		int ans = list.stream().distinct().max( (x,y) -> x-y ).get();
//		int ans = list.stream().distinct().min( (x,y) -> x-y ).get();
//		List list = Arrays.asList("lola".split(""));
//		Map<String, Long> map = new LinkedHashMap<String, Long>();
//		list.stream().forEach(x-> map.put(x+"", map.getOrDefault(x+"" ,0L)+1));
//		System.out.println(map);
//		
//		int flag = 0 ;
//		String [] ans = {"0"};
//		
//		list.stream().forEach(x->{
//			if( ans[0] == "0" && map.containsKey(x+"") && map.get(x+"") == 1 ) {
//				ans[0] = x+"";
//			}
//		});
//		System.out.println(ans[0]);
		
//		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
		
		
		
//		System.out.println(ans);
	}
}
