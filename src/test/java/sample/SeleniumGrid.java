package sample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid {
	@Parameters(value = {"Platform","url"})
	@BeforeClass
	public void config(String platformaName, String url) throws MalformedURLException {
		System.out.println(platformaName);
		System.out.println(url);
		if(platformaName.equals("WIN10")) {
			DesiredCapabilities cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN10);
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			WebDriver driver=new RemoteWebDriver(new URL(url+"/wd/hub"), cap);
		}else if(platformaName.contains("Mac")) {
			DesiredCapabilities cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN10);
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			WebDriver driver=new RemoteWebDriver(new URL(url+"/wd/hub"), cap);
		}
	}
	
	@Test
	public void connectGrid() throws Throwable {
		
	System.out.println("success");
	
	}

}
