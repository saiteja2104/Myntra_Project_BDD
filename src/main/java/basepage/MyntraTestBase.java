package basepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.pages.Landingpage;

public class MyntraTestBase {
	private Properties prop ;
	private WebDriver driver;
	
	
	
	public  MyntraTestBase() {
			try {
			prop=new Properties();
			String projectpath=System.getProperty("user.dir");
			String configpath=projectpath+File.separator+"PropertiesFile"+File.separator+"Config.properties";
			FileInputStream fis= new FileInputStream(configpath);
			prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}		
			
				
			
	}
public WebDriver driverinitializer() throws MalformedURLException {
	if (prop.getProperty("browser").equals("chrome")) {
		if(prop.getProperty("browserenvtype").equals("remote"))
		{
			DesiredCapabilities cap= new DesiredCapabilities();

			cap.setPlatform (Platform.WIN10); //cap.setPlatform (Platform.MAC); 
			cap.setBrowserName("chrome"); //cap.setBrowserName("MicrosoftEdge")

			driver = new RemoteWebDriver(new URL("http://192.168.17.156:4444/wd/hub"), cap);

		}
		else {
		driver=new ChromeDriver();}}
	else if(prop.getProperty("browser").equals("firefox")) {
		driver=new FirefoxDriver();}
	else if(prop.getProperty("browser").equals("InternetExplorer")) {
		driver=new InternetExplorerDriver();}
	driver.manage().window().maximize();
	return driver;
	
}
public Landingpage geturl() {
	driver.get(prop.getProperty("url"));
	return new Landingpage(driver);

}

}
