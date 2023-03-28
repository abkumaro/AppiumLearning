package virtualDeviceTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VD_CalcualtorAppTest extends BaseTest{
	
	
	//UIAutomatorViewer
	
	//@Test
	public void verifyAddFeature() {
		
		//click on 9
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		
		//click on plus icon
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		
		//click on 9
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
		
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		//get the Result
		String actualResult = driver.findElement(By.id("result_final")).getText();
		System.out.println("Result : " + actualResult);
		
		
		Assert.assertEquals(actualResult, "1976");
		
	}
	
	
	@Test
	public void verifyMulFeature() {
		
		
		//clear the Result
		driver.findElement(By.id("clr")).click();
		
		
		//click on 9
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		
		//click on plus icon
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		
		//click on 9
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
		
		
		//click on equal icon
		driver.findElement(By.id("eq")).click();
		
		
		//get the Result
		String actualResult = driver.findElement(By.id("result_final")).getText();
		System.out.println("Result : " + actualResult);
		
		
		//Assert.assertEquals(actualResult, "1976");
		
	}
	

}
