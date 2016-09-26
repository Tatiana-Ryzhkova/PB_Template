package core;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;


public class VerifyTitle {

		@Test
	public void HomePage()
	{
		String actual= "http://www.potterybarn.com/";
		String expected = "http://www.potterybarn.com/";

		AssertJUnit.assertEquals(actual, expected);
	}
	

	@Test
	public void TC01()
	{
		System.out.println("TC#01");
	}
	@BeforeTest
	public void setUp()
	{
		System.out.println("Title verification");
	}
}

