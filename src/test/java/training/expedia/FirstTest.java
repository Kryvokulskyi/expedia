package training.expedia;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
		public static void main(String[] args) {
			WebDriver driver;
			driver = new FirefoxDriver();
			String baseURL = "http://www.google.com";
			
			driver.get(baseURL);
		
	}


}
