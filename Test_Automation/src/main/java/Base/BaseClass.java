package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "D:\\Shravani\\Test_Automation\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

	}

}
