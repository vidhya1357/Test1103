package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SomeTest {
	@Test
	public void TC001() {
		System.out.println("TC001");
	}
	@AfterClass
	public void TC002() {
		System.out.println("TC002");
	}

}
