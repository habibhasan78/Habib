
 
 
package com.usa.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//WebDriver driver = new WebDriver ();----not possible because both are interface.
	//WebDriver driver = new ChromeDriver();---Up casting the driver.
	//WebDriver driver = new FirefoxDriver---selenium version 2.53.1 and default browser is Firefox
	                                      //---Firefox driver version supports 46.1 or below 47
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Driver.get(url);----in two ways put url-1
	driver.get("https://www.ups.com/us/en/Home.page");
	//driver.navigate().to("https://www.ups.com/us/en/Home.page");url-2
	//driver.findElement(By.xpath(""));
	//driver.navigate().refresh();
	//By linkText
	//driver.findElement(By.linkText("Log in / Sign up")).click();
	//By partialLinkText.
	//driver.findElement(By.partialLinkText("Log in / Sign up")).click();
	//driver.findElement(By.className("ups-analytics")).click();---By class name does not work.
	
	//driver.close----Close only browser. it works for IE browser
	//driver.quit-----Close browser+server. For IE browser,it does not work.
	//By X-path
	driver.findElement(By.xpath("(//*[@class='ups-analytics']))[7]")).click();

	
}   
}
