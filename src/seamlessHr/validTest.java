package seamlessHr;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class validTest {
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\java and others\\chromeddddddd\\chromedriver_win32 (1)\\chromedriver.exe");
	  ChromeDriver driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  
	  //launch the url
	  driver.get("https://the-internet.herokuapp.com");
	  Thread.sleep(1000);
	  
	  //click on 'form authentication'
	  driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
	  
	  //enter 'username'
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  
	  //enter 'password'
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  Thread.sleep(1000);
	  
	  //click on Login Button
	  driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
	  
	  // Assert the success message “You logged into a secure area!” 
	  String test = driver.findElement(By.className("flash")).getText();
	  System.out.println("success message is" +test);
	  Thread.sleep(1000);
	  
	  assertTrue(test.contains("You logged into a secure area!"));
	   System.out.println("assert pass");
	 
	   
	   
	  driver.close();
	  
		  
  }
}
