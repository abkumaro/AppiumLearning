package recap;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup() throws Exception {
		
		
		
		String appiumServer = "http://192.168.1.5:4723/wd/hub";
		
		//get udid of specific device
//		adb devices
//		List of devices attached
//		emulator-5554   device
		
		
		//deviceDetails
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		//ApplicationDetails
		
		//adb shell dumpsys window | find "mCurrentFocus"
		//mCurrentFocus=Window{2bb5cf4 u0 com.google.android.calculator/com.android.calculator2.Calculator}
		caps.setCapability("appPackage", "com.google.android.calculator");
		caps.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		//serverdetails
		//create a session
		//driver = new ChromeDriver():  //launch browser, create a session
			
		driver = new AppiumDriver<MobileElement>(new URL(appiumServer), caps);
		
		
	}

}
