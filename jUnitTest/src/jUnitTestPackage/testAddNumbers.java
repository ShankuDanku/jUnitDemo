package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		int result = jUnitFunctions.AddNumbers(10, 90);
		assertEquals(100, result);
	}

}
