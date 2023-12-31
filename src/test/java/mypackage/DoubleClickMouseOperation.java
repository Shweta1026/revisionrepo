package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseOperation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement input1=driver.findElement(By.id("field1"));
		input1.clear();
		input1.sendKeys("Welcome");
		
		WebElement input2=driver.findElement(By.id("field1"));
		WebElement button=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();
		
		
		
		
		

	}

}
