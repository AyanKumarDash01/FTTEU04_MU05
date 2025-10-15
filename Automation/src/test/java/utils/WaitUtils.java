package utils;

import java.time.Duration;

public class WaitUtils {
	public static WebDriverWait shortWait(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(7));
	}
	public static WebDriverWait mediumWait(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(15));
	}
}
