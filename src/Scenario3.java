import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Scenario3 {
@Test
public void Gmail(){
	ChromeOptions options= new ChromeOptions(); 
	Map<String, Object> prefs= new HashMap<String,Object>();
	prefs.put("profile.default_content_setting_values.notifications",2);
	options.setExperimentalOption("prefs", prefs);	
	WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yahoomail.com");
		driver.findElement(By.id("login-username")).sendKeys("san_mindi@yahoo.co.in");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("venuarun12");
		driver.findElement(By.id("login-signin")).click();
		
	
}
}
