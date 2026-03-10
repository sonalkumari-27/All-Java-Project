package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitTest {
	Junit j = new Junit();
	@Test
	void test() {
		int actual=j.add(1, 4);
		int expected = 5;
		assertEquals(expected,actual);
//		fail("Not yet implemented");
	}
	@BeforeEach
	public void start() {
		System.out.println("Before Each");
	}
	@BeforeAll
	public void all() {
		System.out.println("all");
	}
	
	
//	@Test
//	public void arrayTest() {
//		try {
//			int arr[]=null;
//			for (int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//			}
//		}
//		catch (NullPointerException e) {
//			System.out.println("Exception handled");
//		}
//	}
//	@Test
//	void sub() {
//		assertEquals(6,j.sub(8, 3));
//	}
	@Test
	void mul() {
		assertEquals(8,j.mul(4, 2));
	}
	@Test
	void div() {
		assertEquals(10,j.div(20, 2));
	}
	@Test
	void arr() {
		int actual[]= {1,2,3};
		int expected[]= {1,2,3};
		assertArrayEquals(expected,actual);
	}
}

