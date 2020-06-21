import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses {
    
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\work1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//EX1 Facebook
//		driver.get("https://www.facebook.com/");
//		
//		WebElement user =driver.findElement(By.id("email"));
//		
//		Actions action =new Actions(driver);
//		action.moveToElement(user).
//		click().keyDown(Keys.SHIFT).sendKeys("hello").
//		keyUp(Keys.SHIFT).doubleClick().contextClick().build().perform();
		
		//EX2 DRAG AND DROP
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.id("fourth"));
		WebElement dest = driver.findElement(By.id("amt7"));
		
		Actions action =new Actions(driver);
		action.dragAndDrop(source, dest).build().perform();
		


	}

}
