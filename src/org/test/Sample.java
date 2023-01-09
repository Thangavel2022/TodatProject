package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {

	System.out.println("suguna");

	System.out.println("thangavel");
	System.setProperty("webdriver.chrome.driver", "E:\\greens\\chromeDrive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	

}
}
