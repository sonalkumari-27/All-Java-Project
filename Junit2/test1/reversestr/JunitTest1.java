package reversestr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest1 {

	@Test
	void test() {
		String actual=RevStr.reverse("sonal");
		String expected="lanos";
		assertEquals(expected,actual);
//		fail("Not yet implemented");
	}

}
