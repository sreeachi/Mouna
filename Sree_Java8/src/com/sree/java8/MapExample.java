package com.sree.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,3,5,3,2,6,7);
		//IntSummaryStatistics s
		IntSummaryStatistics r = num.stream().map(i-> i).distinct().sorted()
//				.collect(Collectors.toList())
				.mapToInt(x->x).summaryStatistics();
		System.out.println(r.getMax());
		//r.getMin();
		//r.forEach(System.out::println);
		
		Random rn = new Random();
		rn.ints().limit(2).sorted().forEach(System.out::println);
		
		
	}

}
