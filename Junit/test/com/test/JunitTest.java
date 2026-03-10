package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {
	junit j=new junit();
	@Test
		void revtest() {
		assertEquals("olleh",j.rev("hello"));
//		fail("Not yet implemented");
	}

}
