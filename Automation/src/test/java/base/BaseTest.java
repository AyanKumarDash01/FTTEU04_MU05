package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	protected WebDriver driver;
	protected final String BASE_URL = "https://demoqa.com";
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod(alwaysRun = true)
	Public void testDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
