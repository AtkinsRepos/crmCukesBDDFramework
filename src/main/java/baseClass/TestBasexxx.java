package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import configFiles.Constants;

public class TestBasexxx {
	public static WebDriver driver;
	public static Properties prop;

	public TestBasexxx() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\configFiles\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@BeforeSuite
	public static void initBrowser() {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
		System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
			System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		String URL= prop.getProperty("ApplicationURL");
		driver.get(URL);

	}
}
