package core;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


import net.sf.testng.databinding.DataBinding;
import net.sf.testng.databinding.TestInput;
import net.sf.testng.databinding.TestOutput;
import static java.lang.Integer.parseInt;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Basic_TV {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		String csvFile = "./src/main/resources/url.csv";
		BufferedReader br = null;
		String line = null;
		String cvsSplitBy = ",";
		String text_case_id = null;
		String url = null;
		String title_expected = null;
		
		br = new BufferedReader(new FileReader(csvFile));
		WebDriver driver = new FirefoxDriver();
		while ((line = br.readLine()) != null) {

			String[] csv = line.split(cvsSplitBy);

			text_case_id = csv[0];
			url = csv[1];
			title_expected = csv[2];

			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String title_actual = driver.getTitle();
			
			System.out.println("");
			if (title_expected.equals(title_actual)) {
				System.out.println("Test Case ID: \t\t" + text_case_id);
				System.out.println("URL: \t\t\t" + url);
				System.out.println("Title Expected: \t" + title_expected);
				System.out.println("Title Actual: \t\t" + title_actual);
				System.out.println("Test Case Result: \t" + "PASSED");
			} else {
				System.out.println("Test Case ID: \t\t" + text_case_id);
				System.out.println("URL: \t\t\t" + url);
				System.out.println("Title Expected: \t" + title_expected);
				System.out.println("Title Actual: \t\t" + title_actual);
				System.out.println("Test Case Result: \t" + "FAILED");

			}

		}

		driver.quit();
		br.close();
	}
}
	// @Test
//	String url = null;
//   	String title_HomePage_expected = null;
		
//		driver = new FirefoxDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	}

	
//	public void after(){		
//		driver.close();
//		driver.quit();
//		System.out.println("Finished"); 	}
	
//	public  String getTitlePage () {
//		String actual_title = driver.getTitle();
//        return actual_title; 	}
	
//		public  Boolean verifyTitlePage (String expected_title){
//		Boolean b =    getTitlePage ().equals(expected_title);
// return b; }
	
//	public void readProperties (String resources_file){
//        String	resources_file = "./src/main/resources";	
// try {
//	Properties property = new Properties();
//	property.load(new FileInputStream(resources_file));

 // url = property.getProperty("url");
 // title_HomePage_expected = property.getProperty("title_HomePage_expected" );

// } catch (FileNotFoundException e) {
//	System.out.println("Method 'readProperties()' - BLOCK");
//	System.out.println();
//	System.out.println(e.getMessage());
// } catch (IOException e) {
//	System.out.println("Method 'readProperties()' - BLOCK");
//	System.out.println();
//	System.out.println(e.getMessage()); }	}//END readProperties	


// }//End of Class	 }


  // @Test(dataProvider = "dp")
  // public void f(Integer n, String s) {
 //  @DataProvider
 //  public Object[][] dp() {
 //   return new Object[][] {
 //     new Object[] { 1, "a" },
 //     new Object[] { 2, "b" },     };
