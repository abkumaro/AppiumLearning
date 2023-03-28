package virtualDeviceTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VD_ClockAppTest {
	
	
	@BeforeTest
	public void setup() throws Exception {
		
		
		
		
		
		
		
		//appiumServer
		
		String appiumServer = "http://localhost:4723/wd/hub";
		
		
		
//		adb devices
//		List of devices attached
//		emulator-5554   device
		
		
		//Device
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("udid", "emulator-5554"); 						//adb 
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11.0");
		
		
		
		
		
		//application
		
		//app1 ---- using APK info
		
		//com.google.android.calculator
		//com.android.calculator2.Calculator
		
		
		
		//app2
		//adb shell dumpsys window
		
		
		//adb shell dumpsys window | find "mCurrentFocus"
		
		//mCurrentFocus=Window{d9c1897 u0 com.google.android.deskclock/com.android.deskclock.DeskClock}
		
		//clock
		//com.google.android.deskclock/com.android.deskclock.DeskClock
		
		cap.setCapability("appPackage", "com.google.android.deskclock");
		cap.setCapability("appActivity", "com.android.deskclock.DeskClock");
		
		//Create a Session
		
		
//		WebDriver driver = new ChromeDriver(); 	//launch chrome browser ----create a session
		
		
		AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL(appiumServer), cap);
		
		
		
		
	}
	
	
	
	
	@Test
	public void verifyAddFeature() {
		
		
		System.out.println("add test case");
		
	}
	
	

}
