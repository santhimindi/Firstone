import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FacebookFriends {

	@Test
	public void FbFriendsCount() throws InterruptedException{
		ChromeOptions options= new ChromeOptions(); 
		Map<String, Object> prefs= new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		options.setExperimentalOption("prefs", prefs);	
		WebDriver driver= new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("san_mindi@yahoo.co.in");
		driver.findElement(By.id("pass")).sendKeys("venuarun1234");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Santhi Mindi')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]/div[1]/span[1]")).click();
		WebElement Box=driver.findElement(By.xpath("//div[@class='j83agx80 btwxx1t3 lhclo0ds i1fnvgqd']"));
List Friends=(List) Box.findElements(By.tagName("a"));
	System.out.println(Friends.size());
	
	}
}