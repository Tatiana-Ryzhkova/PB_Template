package core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

	@AfterMethod
	public void logout()
	{
		System.out.println("in logout");
	}
	@BeforeMethod
	public void login()
	{
		System.out.println("in login");
	}

	@Test
	public void testcase_001()
	{
		System.out.println("testcase_001");
	}
	@Test
	public void testcase_002()
	{
		System.out.println("testcase_002");
	}
	@Test
	public void testcase_003()
	{
		System.out.println("testcase_003");
	}
	@Test
	public void testcase_004()
	{
		System.out.println("testcase_004");
	}

}
