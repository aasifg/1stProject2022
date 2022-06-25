package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aasif\\Selleniumworkspace\\SelleniumClass1\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); //code to maximize the window
		Thread.sleep(2000); //to pause..have to add throws hover over
		driver.close(); //to close. have to close after thread.sleep
		
		
		
		
	}
	
	
	
	
}
