import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;





import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Facebook {

@Test

public void Facebooklogin() throws IOException 
{
	/* to open the excel file we create an object of the file class*/
	
	File file= new File("C:\\Users\\SHANTI\\Desktop\\Facebook.xlsx");
	
	/* to read excel data we create an object of the fileinputstream class*/
	
	FileInputStream inputstream= new FileInputStream(file);
	
	/* instance of the workbook referencing to the xls file*/
	
	XSSFWorkbook workbook= new XSSFWorkbook(inputstream);
	
	/* object of the sheet */
	
	XSSFSheet sheet= workbook.getSheet("Sheet1");
	
	/* cell object to get the username */
	WebDriver driver= new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	for (int i=1;i<=10;i++)
	{
	String username=sheet.getRow(i).getCell(0).toString();
	driver.findElement(By.id("email")).sendKeys(username);
	/* cell object to get the password */
	
	for (int j=1;j<=10;j++)
	{
	String password=sheet.getRow(j).getCell(1).toString();
	driver.findElement(By.id("pass")).sendKeys(password);
	
	driver.findElement(By.name("login")).click();
	
WebElement user=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/div[4]/a/span/span"));
	 Assert.assertEquals(user.getText(), "Santhi");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")).click();
	break;
	}
	
	/*ChromeOptions options= new ChromeOptions(); 
	Map<String, Object> prefs= new HashMap<String,Object>();
	prefs.put("profile.default_content_setting_values.notifications",2);
	options.setExperimentalOption("prefs", prefs);	
	WebDriver driver= new ChromeDriver(options);*/
	
	/* object of the FireFox Driver */
	
		
		
		
	}

	
	
	}
	
	
	
	

}
