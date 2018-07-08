package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ss\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://cleartrip.com");	
			driver.manage().window().maximize();
			
		Set<String>  Windowhandle =  driver.getWindowHandles();
		System.out.println(Windowhandle.size());
			
	WebElement wed = driver.findElement(By.id("FromTag"));
	wed.sendKeys("Delhi");
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ui-id-1"))));
	driver.findElement(By.id("ui-id-1")).click();
	driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	List<WebElement> cal =driver.findElements(By.cssSelector("td"));
	
	
//	for (WebElement webElement : cal) {
//		System.out.println(webElement.getText());
//		if (webElement.getText().equals("17")) {
//			webElement.click();
//		}
//	}
			}
			Select select = new Select(driver.findElement(By.name("adults")));
			select.selectByVisibleText("5");

	}

}
