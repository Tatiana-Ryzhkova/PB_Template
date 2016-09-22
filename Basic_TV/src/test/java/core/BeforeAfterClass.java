package core;


	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class BeforeAfterClass {

		@BeforeClass
		public void login()
		{
			System.out.println("in login");
		}

		@Test
		public void TC_01()
		{
			System.out.println("TC01");
		}
		@Test
		public void TC_02()
		{
			System.out.println("TC02");
		}
		@Test
		public void TC_03()
		{
			System.out.println("TC03");
		}
		@Test
		public void TC_04()
		{
			System.out.println("TC04");
		}
		@AfterClass
		public void logout()
		{
			System.out.println("logout");
		}

	}