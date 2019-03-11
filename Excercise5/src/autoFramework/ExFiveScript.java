package autoFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExFiveScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\Desktop\\e2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/browser-navigation-commands/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.toolsqa.com/selenium-webdriver/browser-navigation-commands/");
		driver.navigate().refresh();
		
		
		
		

	}

}
