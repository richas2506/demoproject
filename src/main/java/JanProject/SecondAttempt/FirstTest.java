package JanProject.SecondAttempt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*; 
import org.openqa.selenium.*; 

public class FirstTest {

	public static void main(String[] args) {
		
		System.out.println("hello");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("end");

	}

}
