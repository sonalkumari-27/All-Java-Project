package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PrimeNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> nums=new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			nums.add(i);
		}
//		System.out.println(nums);
//		Stream<Integer> data= nums.stream();
//		data.forEach(n->System.out.println(n));
//		long count =data.count();
//		System.out.println(count); // gives size of the stream
//		Stream <Integer> sortedData=data.sorted(Comparator.reverseOrder()); //gives desc order data
//		sortedData.forEach(n->System.out.println(n));
		
		nums.stream()
			.distinct() //remove duplicates
			.filter(n->n%2==0)
			.map(n->n*2)
			.sorted(Comparator.reverseOrder())
			.skip(4)//skip first n elements
//			.forEach(n-> System.out.println(n));
			.forEach(System.out::println);
	}

}
