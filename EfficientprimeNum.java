package streams;

import static java.util.stream.Collectors.partitioningBy;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class EfficientprimeNum {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		System.out.println(partitionPrimesWithCustomCollector(100));
		
		//System.out.println(System.nanoTime() - start);
		

		}
	
	
	public static Map<Boolean, List<Integer>> partitionPrimesWithCustomCollector(int n) {
	  return IntStream.rangeClosed(2, n).boxed()
	                  .collect(new PrimeNumbersCollector());


	}
	
	
	
	
	

	
	

}
