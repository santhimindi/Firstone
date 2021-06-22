import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Scenario1 {

	@Test
	public void goalplandate()
	{
		/* Login to GoalPlan and verify the date present in goalsheet is today’s date. */
	/*	
	ChromeOptions options= new ChromeOptions(); 
	Map<String, Object> prefs= new HashMap<String,Object>();
	prefs.put("profile.default_content_setting_values.notifications",2);
	options.setExperimentalOption("prefs", prefs);	
	WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ourgoalplan.com/Login.aspx");
		driver.findElement(By.id("txtName")).sendKeys("gopam");
		driver.findElement(By.id("txtPassword")).sendKeys("Feature754321@");
		driver.findElement(By.id("btnLogin")).click();
		WebElement goaldate=driver.findElement(By.id("lblGoalDate"));
		String datedisplayed=goaldate.getText();
		System.out.println(datedisplayed); */
		
		/*  Login to Goal Plan and verify that “abcrakadabrakadabra" is not present in the goalsheet. */
		/*
		ChromeOptions options= new ChromeOptions(); 
		Map<String, Object> prefs= new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		options.setExperimentalOption("prefs", prefs);	
		WebDriver driver= new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ourgoalplan.com/Login.aspx");
			driver.findElement(By.id("txtName")).sendKeys("gopam");
			driver.findElement(By.id("txtPassword")).sendKeys("Feature754321@");
			driver.findElement(By.id("btnLogin")).click();
		String t= "abcrakadabrakadabra";
		if(driver.getPageSource().contains("abcrakadabrakadabra")){
			System.out.println("Text " + t + " is present");
		}
			else
			{
				System.out.println("Text " + t + " is not present" );
		
			} */
		
		/* Verify your lead name not to be blank */
		
	/*	ChromeOptions options= new ChromeOptions(); 
		Map<String, Object> prefs= new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications",2);
		options.setExperimentalOption("prefs", prefs);	
		WebDriver driver= new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://ourgoalplan.com/Login.aspx");
			driver.findElement(By.id("txtName")).sendKeys("gopam");
			driver.findElement(By.id("txtPassword")).sendKeys("Feature754321@");
			driver.findElement(By.id("btnLogin")).click();
		
WebElement LeadName=driver.findElement(By.xpath("//a[@href='PublicProfile.aspx?id=6']"));	
 String LeadName_value=LeadName.getText();
 if(LeadName_value.isEmpty())
 {
	 System.out.println("The Lead Name field is blank");
	 
 }
 else
 {
	 System.out.println("The Lead Name field is not blank");
 }
	}
}
*/