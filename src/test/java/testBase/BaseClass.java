package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;  //Log4j
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;  //Log4j
public class BaseClass {
	
	public WebDriver driver;
	 public Logger logger; 
	 public Properties p;	

	@BeforeClass(groups="sanity")
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger = LogManager.getLogger(this.getClass());
		
		
		switch(br.toLowerCase())
		{
		case "chrome":driver= new ChromeDriver();break;
		
		case "edge":driver=new EdgeDriver();break;
		default:
			System.out.println("Invalid browser name");return;
		}
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/* driver.get("https://automationexercise.com/"); */
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups="sanity")
	public void  tearDown()
	{
		driver.close();
	}
}