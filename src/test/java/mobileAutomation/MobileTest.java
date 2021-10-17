package mobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest {
	
	 public static AppiumDriver driver;
	
	public static void main(String args[]) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0.0");
		cap.setCapability("deviceName", "604b184d");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.miui.calculator:id/btn_7_s")).click();
		
		driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
		
		driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
		
		driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
		
		String result = driver.findElement(By.id("com.miui.calculator:id/result")).getAttribute("text");
		
		System.out.println("The result of the operation is "+result);
		
	}

}
