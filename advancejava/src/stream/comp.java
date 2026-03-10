package stream;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.function.Consumer;
	import java.util.stream.Stream;
	import java.util.Comparator;
	import java.util.Arrays;
	import java.util.stream.Collectors;
	public class comp {

		public static void main(String[] args) {
//			Comparator<Integer> com=new Comparator<Integer>(){
//				public int compare (Integer i,Integer j){
//					if(i%10>j%10){
//						return 1;// TODO Auto-generated method stub
//					}else return -1;
//				}
//			};
//			List<Integer> nums= new ArrayList<>();
//			nums.add(456);
//			nums.add(578);
//			nums.add(234);
//			nums.add(345);
//			Collections.sort(nums, com);
//			System.out.println(nums);
//		}
//		class Employee{
//			int age;
//			String name;
//		public Employee(int age, String name) {
//			this.age=age;
//			this.name=name;
//		}
//			
//		}
	//}
//		List<Integer> l= Arrays.asList(1,2,3,4,5);
//		l.forEach(n->System.out.println(n));
//		Consumer<String>c=name->System.out.println(name);
//		c.accept("sonal");
//		Stream<Integer>s=l.stream();
//		long count=s.filter(n->n%2==0)
//				.sorted()
//				.count();
//		System.out.println(count);
		List<Integer> l= Arrays.asList(1,2,3,4,5);
		Stream<Integer>s=l.stream();
		List<Integer> l2=s.collect(Collectors.toList());
		l2.forEach(System.out::println);
	}
	}
