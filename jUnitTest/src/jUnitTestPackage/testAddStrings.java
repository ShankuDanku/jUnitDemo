package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		String result = jUnitFunctions.AddStrings("Sashank", "Durbha");
		assertEquals("SashankDurbha", result);
	}

}
