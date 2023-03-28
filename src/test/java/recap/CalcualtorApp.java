package recap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcualtorApp extends BaseTest{
	
	//priority ---- 0
	//priority is same ---- naming con -----ascii value
	
	
	
	
	@Test
	public void verifyAddTest() {
		
		System.out.println("add test case");
		

		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on plus
		driver.findElement(By.id("op_add")).click();
		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		
		//click on plus
		driver.findElement(By.id("eq")).click();
		
		
		
		//get the results
		String actualResult = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		System.out.println("Addition Results are: " + actualResult);
		
		
		Assert.assertEquals(actualResult, "1996");
		
	}
	
	
	@Test
	public void verifyMultTest() {
		
		System.out.println("add test case");
		

		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on multiply
		driver.findElement(By.id("op_mul")).click();
		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		
		//click on plus
		driver.findElement(By.id("eq")).click();
		
		
		
		//get the results
		String actualResult = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		System.out.println("Mul Results are: " + actualResult);
		
		
		Assert.assertEquals(actualResult, "996004");
		
	}

	
	@Test
	public void verifyDivTest() {
		
		System.out.println("add test case");
		

		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on division
		driver.findElement(By.id("op_div")).click();
		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		
		//click on plus
		driver.findElement(By.id("eq")).click();
		
		
		
		//get the results
		String actualResult = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		System.out.println("Div Results are: " + actualResult);
		
		
		Assert.assertEquals(actualResult, "1");
		
	}
	
	@Test
	public void verifySubTest() {
		
		System.out.println("add test case");
		

		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_8")).click();
		
		//click on subtraction
		driver.findElement(By.id("op_sub")).click();
		
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("digit_7")).click();
		
		
		//click on plus
		driver.findElement(By.id("eq")).click();
		
		
		
		//get the results
		String actualResult = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
		System.out.println("Sub Results are: " + actualResult);
		
		
		Assert.assertEquals(actualResult, "1");
		
	}

}
