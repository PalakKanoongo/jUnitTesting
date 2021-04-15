package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result= junitstring.addStrings("lab", "assignment");
		assertEquals("labassignment", result);
	}

}
